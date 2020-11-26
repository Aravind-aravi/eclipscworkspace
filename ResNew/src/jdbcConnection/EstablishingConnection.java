package jdbcConnection;


import java.sql.Connection;
import java.sql.DriverManager;

public class EstablishingConnection implements ConnectionProvider{
	static Connection con = null;

	public static Connection getCon() {

		try {

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(dburl, dbname, dbpassword);

		} catch (Exception e) {

			System.out.println(e);

		}

		return con;
	}
}
