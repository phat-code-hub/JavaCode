package JDBC;

import java.sql.*;

public class TestMysqlDBConnect {
    public static void main(String[] args) throws SQLException {
        String sql = "Select * From department";
        try (Connection con = ConnectDB.getConnect("golddb");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);) {
            while (rs.next()) {
                System.out.println(rs.getString(2));
            }
        }
    }
}
