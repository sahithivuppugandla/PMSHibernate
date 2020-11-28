package com.wellsfargo.batch5.pms.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;



public class StockModel implements Comparable<StockModel> {
	
	@NotNull(message="Stock Id is mandate")
	@Min(value=1,message="Stock Id can not be negative or zero")
	private Integer stockId;
	
	@NotNull(message="Stock Exchange is mandate")
	@NotBlank(message="Stock Exchange is mandate")
	private String stockExchange;
	
	@NotNull(message="Current Price is mandate")
	@Min(value=1,message="Current Price can not be negative or zero")
	private Double currentPrice;
	
	@NotNull(message="Local Date is mandate")	
	@PastOrPresent(message="Local Date can not be a future date")
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate date;
	
	@NotNull(message="Local Time is mandate")	
	@PastOrPresent(message="Local Time can not be a future time")
	@DateTimeFormat(iso=ISO.TIME)
	private LocalTime time;
	
	
	private CompanyModel company;
	
	public StockModel(){
		
	}
	
	public StockModel(Integer stockId, String stockExchange, Double currentPrice, LocalDate date, LocalTime time, CompanyModel company) {
		super();
		this.stockId = stockId;
		this.stockExchange = stockExchange;
		this.currentPrice = currentPrice;
		this.date = date;
		this.time = time;
		this.company=company;
	
	}
	
	public Integer getStockId() {
		return stockId;
	}
	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
	public Double getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(Double currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	
	public CompanyModel getCompany() {
		return company;
	}


	public void setCompany(CompanyModel company) {
		this.company = company;
	}

	@Override
	public int compareTo(StockModel o) {
		
		return this.stockId.compareTo(o.stockId);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(stockId);
	}
	

	@Override
	public boolean equals(Object obj) {
		
		return Objects.equals(this, obj);
	}

	@Override
	public String toString() {
		return "StockEntity [stockId=" + stockId + ", stockExchange=" + stockExchange + ", currentPrice=" + currentPrice
				+ ", date=" + date + ", time=" + time + ", company=" + company + "]";
	}

}
