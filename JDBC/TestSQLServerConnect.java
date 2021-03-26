package JDBC;

import java.sql.*;

public class TestSQLServerConnect {
    public static void main(String[] args) throws SQLException {
        String sql = "Select * From TLogIn";
        try (Connection con = ConnectSQLServer.getConnect("SachVB2012");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);) {
            while (rs.next()) {
                System.out.println(rs.getString(2));
            }
        }
    }

}
