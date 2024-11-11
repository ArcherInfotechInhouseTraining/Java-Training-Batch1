package arc.nov.examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormServlet
 */
@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FormServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		
		String data_name = request.getParameter("name");
		String data_email = request.getParameter("email");
		String data_password = request.getParameter("password");
		String data_gender = request.getParameter("gender");
		String []skills = request.getParameterValues("skill");
		String country = request.getParameter("country"); // for single selected value
		String []languages = request.getParameterValues("languages");
		String userId = request.getParameter("userId");
		String comments = request.getParameter("comments");
		String dob = request.getParameter("dob");
		
		
		System.out.println("Name: "+data_name+"\t Email: "+data_email+"\t Password: "+data_password+"\t gender: "+data_gender+"\t Skills: ");
		if(skills != null) {
			for(String s : skills) {
				System.out.print(s+" ");
			}
		}
		System.out.println("\t Country: "+country);
		System.out.println("Languages: ");
		if(skills != null) {
			for(String lan : languages) {
				System.out.print(lan+" ");
			}
		}
		System.out.println("\t UserId: "+userId);
		System.out.println("\t Comments: "+comments);
		System.out.println("\t DOB: "+dob);
		
		PrintWriter out = response.getWriter();
		out.write("<html><body>");
		out.write("<h2>Data Submitted Successfully...!!!</h2>");
		out.write("<p><h3>Data is</h3>"+"</p>");
		out.write("<p><b>Name:</b>"+data_name+"</p>");		
		out.write("<p><b>Email: </b>"+data_email+"</p>");
		out.write("<p><b>Password: </b>"+data_password +"</p>"); 
		out.write("<p><b>Gender: </b>"+data_gender+"</p>");
		
		out.write("<p><b>Skills:</b>"+"</p>");
//		to display skills
		if(skills != null) {
			for(String s : skills) {
				out.write(s+" ");
			}
		}

		out.write("<p><b>Country: </b>"+country+"</p>");
		out.write("<p><b>Languages: </b>"+"</p>");
		if(skills != null) {
			for(String lan : languages) {
				out.write(lan+" ");
			}
		}
		out.write("<p><b>UserId: </b>"+userId+"</p>");
		out.write("<p><b>Comments: </b>"+comments+"</p>");
		out.write("<p><b>DOB: </b>"+dob+"</p>");
		out.write("</body></html>");
		
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
