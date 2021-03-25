package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectMariaDB2 {
	public static Connection getConnect(String path) throws SQLException {
		if (path.isEmpty())
			path = "JavaDB";
		String url = "jdbc:mariadb://127.0.0.1/" + path;
		String user = "root";
		String passwd = "";// "Congaukuma210663";
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
