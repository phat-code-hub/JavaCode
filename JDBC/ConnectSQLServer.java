package JDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectSQLServer {
	public static Connection getConnect(String path) throws SQLException {
		// if (path.isEmpty())
		// 	path = "SachVB2012";
		// // String connectionUrl = "jdbc:sqlserver://<server>:<port>;databaseName=AdventureWorks;user=<user>;password=<password>";
		// String url = "jdbc:sqlserver://localhost\\VB2012/;databaseName=path;user='root';password=''";
		// // String user = "root";
		// // String passwd = "";// "Congaukuma210663";
		// Connection con = DriverManager.getConnection(url);
		// return con;
			Driver d=null;
			Connection con = null;
			if (path.isEmpty())
				path = "SachVB2012";
			try {
				d = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			//Port 1433
			String connUrl = 
					"jdbc:sqlserver://localhost;database=SachVB2012;"
							+ "integratedSecurity=true;user='root';password=''";
			con = d.connect(connUrl, new Properties());
	
			return con;
	}
}
