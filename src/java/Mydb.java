import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Mydb {
    Connection con;
    public Connection getCon(){
        try{
          
        String url="jdbc:mysql://localhost:3306/student";
        String uname="root";
        String pass="skmoon@mal3";
        
        Class.forName("com.mysql.jdbc.Driver");
        
       con = DriverManager.getConnection(url,uname,pass);  
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Mydb.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
