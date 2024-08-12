import org.postgresql.Driver;

import java.sql.*;
public class DemoJDBC {

    public static void main(String a[]) throws ClassNotFoundException, SQLException {

        String url ="jdbc:postgresql://localhost:5432/test";
        String uname ="postgres";
        String pass ="0000";

//        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("connection Established");
    }
}
