package com.manntt.restshowdata;

public class DAOShowRestaurentData {
	private String url;
	private String name;
	private String address;
	private String location;
	private String cuisine;
	private String dishes;
	private Float prices;
	private Float rating;
	private int votes;
	private int uniqueid;
	public DAOShowRestaurentData(String url, String name, String address, String location, String cuisine,
			String dishes, Float prices, Float rating, int votes, int uniqueid) {
		super();
		this.url = url;
		this.name = name;
		this.address = address;
		this.location = location;
		this.cuisine = cuisine;
		this.dishes = dishes;
		this.prices = prices;
		this.rating = rating;
		this.votes = votes;
		this.uniqueid = uniqueid;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	public String getDishes() {
		return dishes;
	}
	public void setDishes(String dishes) {
		this.dishes = dishes;
	}
	public Float getPrices() {
		return prices;
	}
	public void setPrices(Float prices) {
		this.prices = prices;
	}
	public Float getRating() {
		return rating;
	}
	public void setRating(Float rating) {
		this.rating = rating;
	}
	public int getVotes() {
		return votes;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}
	public int getUniqueid() {
		return uniqueid;
	}
	public void setUniqueid(int uniqueid) {
		this.uniqueid = uniqueid;
	}
	
	
	
	

}
