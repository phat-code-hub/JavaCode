package JDBC;

import java.sql.*;

public class TestMariaDBConnect {
    public static void main(String[] args) throws SQLException {
        String sql = "Select * From hong";
        try (Connection con = ConnectMariaDB.getConnect("GoldSE11");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);) {
            while (rs.next()) {
                System.out.println(rs.getString(2));
            }
        }
    }

}
