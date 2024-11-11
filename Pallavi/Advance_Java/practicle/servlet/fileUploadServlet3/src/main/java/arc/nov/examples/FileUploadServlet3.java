package arc.nov.examples;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class FileUploadServlet3
 */
@WebServlet("/FileUploadServlet3")

@MultipartConfig(
	    fileSizeThreshold = 1024 * 1024 * 1, // 1 MB
	    maxFileSize = 1024 * 1024 * 10,      // 10 MB
	    maxRequestSize = 1024 * 1024 * 100    // 100 MB
	) 
	public class FileUploadServlet3 extends HttpServlet {

		private static final long serialVersionUID = 1L;

		protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	            throws ServletException, IOException {
	        
	        response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	        
	        // Gets the file part from the request
	        Part filePart = request.getPart("file"); // "file" should match the name attribute in your form
	        String fileName = getSubmittedFileName(filePart);
	        
	        // Directory where files will be saved
	        String uploadPath = getServletContext().getRealPath("") + File.separator + "uploads";
	        File uploadDir = new File(uploadPath);
	        if (!uploadDir.exists()) {
	            uploadDir.mkdir();
	        }
	        
	        try {
	            // Write the file
	            filePart.write(uploadPath + File.separator + fileName);
	            out.println("<html><body>");
	            out.println("<h2>File " + fileName + " has been uploaded successfully!</h2>");
	            out.println("</body></html>");
	        } catch (Exception e) {
	            out.println("<html><body>");
	            out.println("<h2>Error: " + e.getMessage() + "</h2>");
	            out.println("</body></html>");
	        } finally {
	            out.close();
	        }
	    }
	    
	    private String getSubmittedFileName(Part part) {
	        String contentDisp = part.getHeader("content-disposition");
	        String[] tokens = contentDisp.split(";");
	        for (String token : tokens) {
	            if (token.trim().startsWith("filename")) {
	                return token.substring(token.indexOf("=") + 2, token.length()-1);
	            }
	        }
	        return "";
	    }
	    
	    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	            throws ServletException, IOException {
	        response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	        out.println("<html>");
	        out.println("<head>");
	        out.println("<title>File Upload Form</title>");
	        out.println("</head>");
	        out.println("<body>");
	        out.println("<h2>File Upload Form</h2>");
	        out.println("<form method='post' action='FileUploadServlet3' enctype='multipart/form-data'>");
	        out.println("<input type='file' name='file' required/><br/><br/>");
	        out.println("<input type='submit' value='Upload'/>");
	        out.println("</form>");
	        out.println("</body>");
	        out.println("</html>");
	        out.close();
	    }
	}