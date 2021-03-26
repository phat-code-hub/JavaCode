package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectSQLServer {
	public static Connection getConnect(String path) throws SQLException {
		if (path.isEmpty())
			path = "SachVB2012";
		// String connectionUrl =
		// "jdbc:sqlserver://<server>:<port>;databaseName=AdventureWorks;user=<user>;password=<password>";
		String url = "jdbc:sqlserver://localhost\\VB2012/;databaseName=path;user='root';password=''";
		// String user = "root";
		// String passwd = "";// "Congaukuma210663";
		Connection con = DriverManager.getConnection(url);
		return con;
	}
}
