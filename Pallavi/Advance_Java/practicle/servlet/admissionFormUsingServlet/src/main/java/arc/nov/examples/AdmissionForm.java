package arc.nov.examples;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


@WebServlet("/AdmissionForm")

@MultipartConfig(
	    fileSizeThreshold = 1024 * 1024 * 1, // 1 MB
	    maxFileSize = 1024 * 1024 * 10,      // 10 MB
	    maxRequestSize = 1024 * 1024 * 100    // 100 MB
	) 

public class AdmissionForm extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String add = request.getParameter("address");
		String email = request.getParameter("email");
		String dob = request.getParameter("dob");
		String gender = request.getParameter("gender");
		String pass = request.getParameter("password");
		
//		Part filePart = request.getPart("image");
		Part filePart = request.getPart("image");
		String fileName = getSubmitedFileName(filePart);
		
//		 try {
//	            // Write the file
////	            filePart.write(uploadPath + File.separator + fileName);
//	            out.println("<html><body>");
//	            out.println("<h2>File " + fileName + " has been uploaded successfully!</h2>");
//	            out.println("</body></html>");
//	        } catch (Exception e) {
//	            out.println("<html><body>");
//	            out.println("<h2>Error: " + e.getMessage() + "</h2>");
//	            out.println("</body></html>");
//	        } finally {
//	            out.close();
//	        }
		
		
		out.println("<h3>Name is: "+name+"</h3>");
		out.println("<h3>Address is: "+add+"</h3>");
		out.println("<h3>Email is: "+email+"</h3>");
		out.println("<h3>Date Of Birth is: "+dob+"</h3>");
		out.println("<h3>Image Name: "+fileName+"</h3>");
				
		
		 String filePath = "C:\\Users\\COMnet\\Desktop\\admissionData.txt";
//	        String dataToAppend = "This is new data to be appended.";

	        try (FileWriter writer = new FileWriter(filePath, true)) {
	            writer.write("\n\nName: "+name+"\nPassword: "+pass+"\nEmail: "+email+"\nAddres: "+add+"\nDOB: "+dob+"\nGender: "+gender+"\nImageName: "+fileName); 
	            System.out.println("Data appended successfully.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
	        
/*	try {
			
//			if()
			FileOutputStream fos = new FileOutputStream("C:\\Users\\COMnet\\Desktop\\admissionData.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			byte []n = name.getBytes();
			byte []n1 = add.getBytes();
			byte []n2 = email.getBytes();
			byte []n3 = dob.getBytes();
			
			
			bos.write(n);
			bos.write(n1);
			bos.write(n2);
			bos.write(n3);
			bos.close();
			fos.close();
		}
		catch(Exception e){
			out.println("<h3>Error: "+e.getMessage()+"</h3>");
		}*/
	}
	
	private String getSubmitedFileName(Part part) {
		
		String contentDisp = part.getHeader("content-disposition");
		String []tokens = contentDisp.split(";");
		
		for(String token : tokens) {
			if(token.trim().startsWith("filename")) {
				return token.substring(token.indexOf("=")+2, token.length()-1);
			}
		}
		return "";
		
	}

}
