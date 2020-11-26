package com.maantt.restlicenceapp.show;

public class DoaRestaurentData {
	private String url;
	private String name;
	private String address;
	private String location;
	private String cusine;
	private String dishes;
	private float price;
	private float rating;
	private int votes;
	private int Uniqueid;
	public DoaRestaurentData(String url, String name, String address, String location, String cusine, String dishes,
			float price, float rating, int votes, int uniqueid) {
		super();
		this.url = url;
		this.name = name;
		this.address = address;
		this.location = location;
		this.cusine = cusine;
		this.dishes = dishes;
		this.price = price;
		this.rating = rating;
		this.votes = votes;
		this.Uniqueid = uniqueid;
	

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
	public String getCusine() {
		return cusine;
	}
	public void setCusine(String cusine) {
		this.cusine = cusine;
	}
	public String getDishes() {
		return dishes;
	}
	public void setDishes(String dishes) {
		this.dishes = dishes;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public int getVotes() {
		return votes;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}
	public int getUniqueid() {
		return Uniqueid;
	}
	public void setUniqueid(int uniqueid) {
		Uniqueid = uniqueid;
	}
	
}
