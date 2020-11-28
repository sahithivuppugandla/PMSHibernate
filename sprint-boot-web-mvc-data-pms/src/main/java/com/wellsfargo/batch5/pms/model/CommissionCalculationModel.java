package com.wellsfargo.batch5.pms.model;

import javax.persistence.Column;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class CommissionCalculationModel {

	
	@NotNull(message="Stocks To Sell is mandate")
	@Min(value=1,message="Stocks To sell can not be negative or zero")
	private Integer stocksToSell;
	
	@NotNull(message="stock Price is mandate")
	@Min(value=1,message="stock Price can not be negative or zero")
	private Double stockPriceAtSelling;
	
	public CommissionCalculationModel() {
		
		System.out.println("default Cons");
	}
	public CommissionCalculationModel(Integer stocksToSell, Double stockPriceAtSelling) {
		super();
		this.stocksToSell = stocksToSell;
		this.stockPriceAtSelling = stockPriceAtSelling;
	}
	public Integer getStocksToSell() {
		return stocksToSell;
	}
	public void setStocksToSell(Integer stocksToSell) {
		this.stocksToSell = stocksToSell;
	}
	public Double getStockPriceAtSelling() {
		return stockPriceAtSelling;
	}
	public void setStockPriceAtSelling(Double stockPriceAtSelling) {
		this.stockPriceAtSelling = stockPriceAtSelling;
	}
	@Override
	public String toString() {
		return "CommissionCalculationEntity [stocksToSell=" + stocksToSell + ", stockPriceAtSelling="
				+ stockPriceAtSelling + "]";
	}
	
}
