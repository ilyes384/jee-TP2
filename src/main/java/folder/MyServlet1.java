package folder;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class MyServlet1 extends GenericServlet{
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service (ServletRequest request, ServletResponse response) throws ServletException, IOException
	    {
	        response.setContentType ("text/html");
	     // Récupération du paramètre "username" de la requête
	        String name = request.getParameter ("username");
	        PrintWriter out = response.getWriter ();
	        out.println (name);
	    }
}
