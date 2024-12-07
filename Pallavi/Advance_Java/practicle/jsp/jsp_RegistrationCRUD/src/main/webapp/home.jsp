<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            background-color: #f9f9f9;
        }

        h1 {
            margin-top: 20px;
            color: #333;
        }

        .buttons-container {
            margin-top: 50px;
        }

        .button {
            display: inline-block;
            margin: 10px;
            padding: 15px 30px;
            font-size: 18px;
            color: #fff;
            background-color: #007BFF;
            border: none;
            border-radius: 5px;
            text-decoration: none;
            cursor: pointer;
        }

        .button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <h1>Registration CRUD</h1>

    <div class="buttons-container">
        <a href="create.jsp" class="button create">Create</a>
        <a href="read.jsp" class="button read">Read</a>
        <a href="update.jsp" class="button update">Update</a>
        <a href="delete.jsp" class="button delete">Delete</a>
    </div>

    <!-- Drop Down for ID -->
    <form method="post">
        <br><br><br>
        <label>Select id</label>
        <select name="iddropdown" onchange="this.form.submit()">
         <!-- Default option -->
        <option value="" disabled selected>Select an ID</option>
        
            <%
                String url = "jdbc:mysql://localhost:3306/jspreg_db";
                String name = "root";
                String password = "root";

                Connection conn = null;
                Statement stmt = null;
                ResultSet rs = null;

                try {
                    // Load drivers
                    Class.forName("com.mysql.cj.jdbc.Driver");

                    // Create a connection
                    conn = DriverManager.getConnection(url, name, password);

                    String sql = "SELECT id FROM users";
                    stmt = conn.createStatement();
                    rs = stmt.executeQuery(sql);

                    while (rs.next()) {
                        int id = rs.getInt("id");
            %>
                        <option value="<%=id%>"><%=id%></option>
            <%
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    // Close resources
                    try { if (rs != null) rs.close(); } catch (SQLException ignore) {}
                    try { if (stmt != null) stmt.close(); } catch (SQLException ignore) {}
                    try { if (conn != null) conn.close(); } catch (SQLException ignore) {}
                }
            %>
        </select>
    </form>

    <!-- Display data according to id -->
    <%
        if (request.getMethod().equalsIgnoreCase("post")) {
            String selectedId = request.getParameter("iddropdown");
            System.out.println("Id is: "+selectedId);

            if (selectedId != null && !selectedId.trim().isEmpty()) {
                try (Connection conn2 = DriverManager.getConnection(url, name, password);
                     PreparedStatement pstmt = conn2.prepareStatement("SELECT * FROM users WHERE id = ?")) {

                    pstmt.setInt(1, Integer.parseInt(selectedId));

                    try (ResultSet rst = pstmt.executeQuery()) {
                        if (rst.next()) {
    %>
    <h1>List Of Registered Users</h1>
    <table border="1" align="center">
        <thead>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Email</th>
                <th>Registration Date</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td><%=rst.getInt("id")%></td>
                <td><%=rst.getString("name")%></td>
                <td><%=rst.getString("email")%></td>
                <td><%=rst.getString("registration_date")%></td>
            </tr>
        </tbody>
    </table>
    <%
                        } else {
                            out.println("<p>No user found with the selected ID.</p>");
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    %>
</body>
</html>
