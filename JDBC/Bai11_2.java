package JDBC;

import java.sql.*;

public class Bai11_2 {
    public static void main(String[] args) throws SQLException {
        String sql = "Select * From PHAT";
        try (Connection con = ConnectMariaDB.getConnect("JavaDB");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);) {
            while (rs.next()) {
                System.out.println(rs.getString(2));
            }
        }
    }

}
