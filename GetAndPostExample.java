package ajaxpkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetAndPostExample extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected void processRequest(HttpServletRequest request,
			HttpServletResponse response, String method)
	throws ServletException,IOException {
		// Set content type of the response to text/xml
		response.setContentType("text/xml");
		// Get the user's input
		String firstName  = request.getParameter("firstName");
		String middleName = request.getParameter("middleName");
		String birthday   = request.getParameter("birthday");
		
		// Create response text
		String responseText = "Hello " + firstName + " " + middleName
				+ ".Your birthday is " + birthday + "."
				+ "[Method: " + method + "]";
		
		// Write the response back to the browser
		PrintWriter out = response.getWriter();
		out.println(responseText);
		//System.out.println(responseText);
		// Close the writer
		out.close();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse
			response)
	throws ServletException, IOException{
		// Process the request in method processRequest
		processRequest(request, response, "GET");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse
			response)
	throws ServletException, IOException {
		System.out.println(request.getParameter("firstName") + " "
				+ request.getParameter("middleName") +  " " 
				+ request.getParameter("birthday"));
		// Process the request in method processRequest
		processRequest(request, response, "POST");
	}
}
