

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author skmoon
 */
@WebServlet(urlPatterns = {"/Logout"})
public class Logout extends HttpServlet {
    
    @Override
    public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
    {
       HttpSession session = request.getSession();
       session.removeAttribute("Username");
       session.invalidate();
       
    }
}