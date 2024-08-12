import org.postgresql.Driver;

import java.sql.*;
public class DemoJDBC {

    public static void main(String a[]) throws ClassNotFoundException, SQLException {

        String url ="jdbc:postgresql://localhost:5432/test";
        String uname ="postgres";
        String pass ="0000";
        String query = "SELECT * FROM public.student";
//        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
//        rs.next();
//        System.out.println(rs.next());
//        System.out.println( rs.getString("sname"));

        System.out.println("connection Established");

            while(rs.next())

            {
                System.out.println(rs.getInt("marks") + " "+ rs.getString("sname"));
            }
        con.close();
        System.out.println("connection Closed");
    }
}
