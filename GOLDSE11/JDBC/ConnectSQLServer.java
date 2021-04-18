package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectSQLServer {
	public static Connection getConnect(String path) throws SQLException {
		if (path.isEmpty())
			path = "SachVB2012";
		String url = "jdbc:sqlserver://localhost\\VB2012:1433;databaseName=" + path
				+ ";integratedSecurity=True;user='root';password=''";
		Connection con = DriverManager.getConnection(url);
		if (con == null) {
			System.out.println("Invalid Connection!");
		}
		return con;
	}
}
