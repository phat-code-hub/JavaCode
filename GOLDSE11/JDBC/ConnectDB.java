package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	public static Connection getConnect(String path) throws SQLException {
		if (path.isEmpty())
			path = "mysql";
		String url = "jdbc:mysql://localhost:3360/" + path;
		String user = "root";
		String passwd = "Congaukuma210663";
		Connection con = DriverManager.getConnection(url, user, passwd);
		return con;
	}
}
