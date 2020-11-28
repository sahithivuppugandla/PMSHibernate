package com.wellsfargo.batch5.pms.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="commodity")
public class CommodityEntity {
	
	@Id
	@Column(name="itemName")
	private String itemName;
	
	@Column(name="itemPrice")
	private Double itemPrice;
	
	@Column(name="udate")
	private LocalDate updatedDate;
	
	@Column(name="utime")
	private LocalTime updatedTime;
	
	public CommodityEntity() {
		
		System.out.println("Default Constructor");
	}
	
	public CommodityEntity(String itemName, Double itemPrice, LocalDate updatedDate, LocalTime updatedTime) {
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

	@Override
	public String toString() {
		return "CommodityEntity [itemName=" + itemName + ", itemPrice=" + itemPrice + ", updatedDate=" + updatedDate
				+ ", updatedTime=" + updatedTime + "]";
	}
	
	
	
}
