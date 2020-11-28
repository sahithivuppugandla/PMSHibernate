package com.wellsfargo.batch5.pms.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class CommodityModel {

	@NotNull(message="Item Name is mandate")
	@NotBlank(message="Item Name is mandate")
	private String itemName;
	
	@NotNull(message="Item Price is mandate")
	@Min(value=1,message="Item Price can not be negative or zero")
	private Double itemPrice;
	
	@NotNull(message="Updated Date is mandate")	
	@PastOrPresent(message="Updated Date can not be a future date")
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate updatedDate;
	
	@NotNull(message="Updated Time is mandate")	
	@PastOrPresent(message="Updated Time can not be a future time")
	@DateTimeFormat(iso=ISO.TIME)
	private LocalTime updatedTime;
	
	public CommodityModel() {
		
		System.out.println("Default Constructor");
	}
	
	public CommodityModel(String itemName, Double itemPrice, LocalDate updatedDate, LocalTime updatedTime) {
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
