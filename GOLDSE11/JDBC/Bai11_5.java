package JDBC;

import java.sql.*;

public class Bai11_5 {
    public static void main(String[] args) {
        String sql = "Select * FROM gold WHERE id=3"; // Luu y den thu tu
        try (Connection con = ConnectMariaDB.getConnect("GoldSE11");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);) {
            if (rs != null) {
                while (rs.next()) {
                    System.out.println(rs.getString(2));
                }
            } else {
                System.out.println("None");
            }

        } catch (SQLException e) {
            System.out.println("SQL Exception!");
        }
    }
}
