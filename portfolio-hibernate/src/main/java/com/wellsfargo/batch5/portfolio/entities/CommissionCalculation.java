package com.wellsfargo.batch5.portfolio.entities;

public class CommissionCalculation {

	private Integer stocksToSell;
	private Double stockPriceAtSelling;
	
	public CommissionCalculation() {
		
		System.out.println("default Cons");
	}
	public CommissionCalculation(Integer stocksToSell, Double stockPriceAtSelling) {
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
	
}
