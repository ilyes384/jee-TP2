package folder;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
@WebFilter("/MyFilter1")
public class MyFilter1 implements Filter{
	public void init (FilterConfig filterConfig)
    {
    }
    public void destroy ()
    {
    }
    
    public void doFilter (ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException
    {
        response.setContentType ("text/html");
        PrintWriter out = response.getWriter ();
        out.println("<b> <i>Filtering request and passing it to Wrapper class</i> </b> <br/>");
        /// Appel du constructeur de la classe d'enveloppe de requête 
        RequestWrapper1 requestWrapper = new RequestWrapper1 (request);
        // Cette méthode appelle le filtre suivant dans la chaîne
        chain.doFilter (requestWrapper, response);
    }
}
