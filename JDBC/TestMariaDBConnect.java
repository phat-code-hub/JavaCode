package JDBC;

import java.sql.*;

public class TestMariaDBConnect {
    public static void main(String[] args) throws SQLException {
        String sql = "Select * From Phat";
        try (Connection con = ConnectMariaDB.getConnect("JavaDB");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);) {
            while (rs.next()) {
                System.out.println(rs.getString(2));
            }
        }
    }

}
