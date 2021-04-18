package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectMariaDB {
	public static Connection getConnect(String path) throws SQLException {
		if (path.isEmpty())
			path = "GOLDSE11";
		// path = "JavaDB";
		String url = "jdbc:mariadb://localhost/" + path;
		String user = "root";
		String passwd = "";
		Connection con = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection(url, user, passwd);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}
}
