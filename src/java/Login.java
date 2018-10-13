
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet(urlPatterns = {"/Login"})
public class Login extends HttpServlet 
{
   
    @Override
    public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
    {
        String uname = request.getParameter("uname");
        String pass = request.getParameter("pass");
        
        LoginDatabase dao = new LoginDatabase();
        
      PrintWriter out=  response.getWriter();
      
        if(dao.check(uname, pass))
        {
            HttpSession session = request.getSession();
            session.setAttribute("Username", uname);
            response.sendRedirect("Welcome.jsp");
            System.out.println("Login sucess");
        }
        else
        {
            out.println("Login not sucess");
        }
    }
}

