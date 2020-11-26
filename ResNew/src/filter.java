import java.sql.Connection;
import java.sql.SQLException;

import jdbcConnection.EstablishingConnection;

public class filter {
	
	Connection con;
	PreparedStatement ps;
	try
	{
	con = EstablishingConnection.getCon();
	String sql = "SELECT * FROM details";
	ps = con.prepareStatement(sql);
	ResultSet rs = ps.executeQuery();
	
	while(rs.next())
	{
	String location = rs.getString("location"); 

	
	
	}
	
	</select>
	

	</p>


	
	}
	catch(SQLException sql)
	{ 
	System.out.println(sql);
	}
	


}
