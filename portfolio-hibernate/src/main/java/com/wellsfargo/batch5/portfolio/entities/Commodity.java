package com.wellsfargo.batch5.portfolio.entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Commodity {

	private String itemName;
	private Double itemPrice;
	private LocalDate updatedDate;
	private LocalTime updatedTime;
	
	public Commodity() {
		
		System.out.println("Default Constructor");
	}
	
	public Commodity(String itemName, Double itemPrice, LocalDate updatedDate, LocalTime updatedTime) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.updatedDate = updatedDate;
		this.updatedTime = updatedTime;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public LocalDate getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}
	public LocalTime getUpdatedTime() {
		return updatedTime;
	}
	public void setUpdatedTime(LocalTime updatedTime) {
		this.updatedTime = updatedTime;
	}
	
	
	
}
