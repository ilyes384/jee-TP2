package folder;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletRequestWrapper;

public class RequestWrapper1 extends ServletRequestWrapper{
	public RequestWrapper1 (ServletRequest req)
    {
        // Appel du constructeur de la classe parente ServletRequestWrapper
        super (req);
    }
    public String getParameter (String str)
    {
    	 // Appel de la méthode de la classe parente ServletRequest, getParameter(String).
        String name = super.getParameter (str);
        if (name.equals (""))
        {
         name = "Please, enter your name in the form";
        }
        return name;
    }
}
