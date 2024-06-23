package JDBC;

import java.sql.*;

public class JdbcDemo {

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pratyay", "root", "Pa@8541831275");
            Class.forName("com.mysql.jdbc.Driver");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM employee");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "       " + rs.getString(2
                        + "      " + rs.getString(3) + "     " + rs.getString(4)));
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
