
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDatabase {

    String url = "jdbc:mysql://localhost:3306/student";
    String uname = "root";
    String passw = "skmoon@mal3";
    String sql = "select * from login where name=? and pass=?";

    public boolean check(String name, String pass) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, passw);
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, name);
            st.setString(2, pass);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
