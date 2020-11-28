package com.wellsfargo.batch5.pms.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

@Embeddable
@Table(name="commcalculation")
public class CommissionCalculationEntity {

	@Column(name="stock_to_sell")
	private Integer stocksToSell;
	
	@Column(name="stock_price_at_sell")
	private Double stockPriceAtSelling;
	
	public CommissionCalculationEntity() {
		
		System.out.println("default Cons");
	}
	public CommissionCalculationEntity(Integer stocksToSell, Double stockPriceAtSelling) {
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
