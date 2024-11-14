package arc.nov.examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

/**
 * Servlet implementation class FileUploadServlet
 */
@WebServlet("/FileUploadServlet")
public class FileUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public void init() throws ServletException {
    	System.out.println("-------------------------------------");
    	System.out.println("init method is called in"+this.getClass().getName());
    	System.out.println("-------------------------------------");
    }
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		MultipartRequest multipartRequest = new MultipartRequest(request, "D:\\Archer\\Java_Prg\\Advance_Java\\fileUploadData");
		out.print("Successfully Uploaded");
	}
	
	public void destroy() {
		System.out.println("-------------------------------------");
		System.out.println("Destroy method is called in"+this.getClass().getName());
		System.out.println("-------------------------------------");
	}

}