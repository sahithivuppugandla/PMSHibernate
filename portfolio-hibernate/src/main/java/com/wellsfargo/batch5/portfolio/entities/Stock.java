package com.wellsfargo.batch5.portfolio.entities;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="stock")
public class Stock implements Comparable<Stock> {
	
	@Id
	@Column(name="stock_id")
	private Integer stockId;
	
	@Column(name="stock_exchange")
	private String stockExchange;
	
	@Column(name="current_price")
	private Double currentPrice;
	
	@Column(name="date")
	private LocalDate date;
	
	@Column(name="time")
	private LocalTime time;
	
	@ManyToOne
	@JoinColumn(name="comp_code")
	private Company company;
	
	/*@ManyToOne
	@JoinColumn(name="investor_PAN")
	private Investor investor;*/
	
	
	public Stock(){
		
	}
	
	
	public Stock(Integer stockId, String stockExchange, Double currentPrice, LocalDate date, LocalTime time, Company company) {
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


	public Company getCompany() {
		return company;
	}


	public void setCompany(Company company) {
		this.company = company;
	}


	/*public Investor getInvestor() {
		return investor;
	}


	public void setInvestor(Investor investor) {
		this.investor = investor;
	}
*/

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

	@Override
	public int compareTo(Stock o) {
		
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
		return "Stock [stockId=" + stockId + ", stockExchange=" + stockExchange + ", currentPrice=" + currentPrice
				+ ", date=" + date + ", time=" + time + ", company=" + company + "]";
	}


	
	
	
	
	

	
}
