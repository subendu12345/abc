import java.sql.*;

public class DataBase{
    
    public static void main(String[]args) throws Exception
    {
      
        String url="jdbc:mysql://localhost:3306/student";
        String uname="root";
        String pass="skmoon@mal3";
        String query="insert into login values('Ram',33)";
        
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con = DriverManager.getConnection(url,uname,pass);
        
        Statement st = con.createStatement();
         int count = st.executeUpdate(query);
         System.out.println(count);
    st.close();
    con.close();
    }
    }