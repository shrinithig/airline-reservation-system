package com.bookStore.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MyBooks")
public class MyBookList {
	
	@Id
	private int id;
	private String departure;
	private String arrival;
	private String price;
	public MyBookList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyBookList(int id, String departure, String arrival, String price) {
		super();
		this.id = id;
		this.departure = departure;
		this.arrival = arrival;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
}
