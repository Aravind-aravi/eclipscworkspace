package com.manntt.restshowdata;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import jdbcConnection.*;
public class ShowRestaurentDataService {
	static Connection con;
	static String Query;
	static PreparedStatement ps;
	static ResultSet rs;
	
	public DAOShowRestaurentData ShowData (DAOShowRestaurentData e) {
		
		int status=0;
		try {
			con=EstablishingConnection.getcon();
			Query= "Select*from details";
			//ps=con.prepareStatement(Query);
			Statement s = con.createStatement();

			s.executeQuery(Query);

			rs = s.getResultSet();

			while (rs.next()) {

			 int b=    e.setUniqueid(rs.getInt("uniqueid"));
				e.setUrl(rs.getString("url"));
				e.setName(rs.getString("name"));
				e.setAddress(rs.getString("address"));
				e.setLocation(rs.getString("location"));
				e.setCuisine(rs.getString("cuisine"));
				e.setDishes(rs.getString("dishes"));
				e.setPrices(rs.getFloat("price"));
				e.setRating(rs.getFloat("ratings"));
				e.setVotes(rs.getInt("votes"));
				
				

			}
			

			rs.close();

			s.close();


			
	}catch(Exception sql)
		{
		System.out.println(sql);
		}
		return e;
		}
	
}
