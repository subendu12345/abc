package subendu;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


 
@WebServlet(urlPatterns = {"/Add"})
public class Add extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse respon) throws IOException{
        //here we are take input from user
       String name=request.getParameter("n1");
       String add=request.getParameter("n2");
        
                
        PrintWriter out= respon.getWriter();
        
        out.println("Welcome "+ name);
        
        
    }
    
    
}