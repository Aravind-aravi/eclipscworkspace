package com.maantt.restlicenceapp.show;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import jdbcConnection.EstablishingConnection;

public class ShowRestaurentData {
	
	

	public int ShowRestaurentData(DoaRestaurentData p) {

		int show = 0;
		

		try {
			Connection con = EstablishingConnection.getCon();

			String sql = "select * from details";

			Statement s = con.createStatement();

			ResultSet rs = s.executeQuery(sql);



			while (rs.next()) {

				p.setUniqueid(rs.getInt("uniqueid"));
				p.setUrl(rs.getString("url"));
				p.setName(rs.getString("name"));
				p.setAddress(rs.getString("address"));
				p.setLocation(rs.getString("location"));
				p.setCusine(rs.getString("cuisine"));
				p.setDishes(rs.getString("dishes"));
				p.setPrice(rs.getFloat("price"));
				p.setRating(rs.getFloat("ratings"));
				p.setVotes(rs.getInt("votes"));
			

			}

			rs.close();

			s.close();

		} catch (Exception e) {

			System.out.println("Exception is ;" + e);

		}
		return show;

	}

}
