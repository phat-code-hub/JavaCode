package JDBC;

import java.sql.*;

public class Bai11_4 {
    public static void main(String[] args) {
        String sql = "Select name,id,score FROM gold WHERE id=1"; // Luu y den thu tu
        try (Connection con = ConnectMariaDB.getConnect("GoldSE11");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);) {
            while (rs.next()) {
                System.out.println(rs.getString(2));
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception!");
        }
    }
}
