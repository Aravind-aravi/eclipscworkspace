package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class EstablishingConnection implements ConnectionProvider {
	static Connection con=null;
	public static Connection getcon() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, dbname, dbpassword);
			
		}
		catch(Exception sql)
		{
		System.out.println(sql);
		}
		
		return con;
		
	}
	

}
