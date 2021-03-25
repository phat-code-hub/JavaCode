package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	public static Connection getConnect(String path) throws SQLException {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		if (path.isEmpty())
			path = "mysql";
		String url = "jdbc:mariadb://localhost/" + path;
		String user = "root";
		String passwd = "Congaukuma210663";
		Connection con = DriverManager.getConnection(url, user, passwd);
		return con;
	}
}
