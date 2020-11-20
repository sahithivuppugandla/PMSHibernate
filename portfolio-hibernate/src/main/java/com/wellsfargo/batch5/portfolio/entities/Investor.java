package com.wellsfargo.batch5.portfolio.entities;

import java.util.List;

public class Investor extends User{

	private String investorName;
	private String investorEmail;
	private Integer investorPhone;
	private String investorAddress;
	private String investorPAN;
	private Double amountInvested;
	private Double amountEarned;
	private Double portfolioValue;
	private List<Company> company;
	private List<Stock> stocks;
	private List<Commodity> commodity;
	private PortfolioWallet wallet;
	private CommissionCalculation commission;
	
	public Investor() {
		
		System.out.println("default constructor");
	}
	
	public Investor(String investorName, String investorEmail, Integer investorPhone, String investorAddress,
			String investorPAN, Double amountInvested, Double amountEarned, Double portfolioValue,
			List<Company> company, List<Stock> stocks, List<Commodity> commodity, PortfolioWallet wallet,
			CommissionCalculation commission) {
		super();
		this.investorName = investorName;
		this.investorEmail = investorEmail;
		this.investorPhone = investorPhone;
		this.investorAddress = investorAddress;
		this.investorPAN = investorPAN;
		this.amountInvested = amountInvested;
		this.amountEarned = amountEarned;
		this.portfolioValue = portfolioValue;
		this.company = company;
		this.stocks = stocks;
		this.commodity = commodity;
		this.wallet = wallet;
		this.commission = commission;
	}

	public String getInvestorName() {
		return investorName;
	}
	public void setInvestorName(String investorName) {
		this.investorName = investorName;
	}
	public String getInvestorEmail() {
		return investorEmail;
	}
	public void setInvestorEmail(String investorEmail) {
		this.investorEmail = investorEmail;
	}
	public Integer getInvestorPhone() {
		return investorPhone;
	}
	public void setInvestorPhone(Integer investorPhone) {
		this.investorPhone = investorPhone;
	}
	public String getInvestorAddress() {
		return investorAddress;
	}
	public void setInvestorAddress(String investorAddress) {
		this.investorAddress = investorAddress;
	}
	public String getInvestorPAN() {
		return investorPAN;
	}
	public void setInvestorPAN(String investorPAN) {
		this.investorPAN = investorPAN;
	}
	public Double getAmountInvested() {
		return amountInvested;
	}
	public void setAmountInvested(Double amountInvested) {
		this.amountInvested = amountInvested;
	}
	public Double getAmountEarned() {
		return amountEarned;
	}
	public void setAmountEarned(Double amountEarned) {
		this.amountEarned = amountEarned;
	}
	public Double getPortfolioValue() {
		return portfolioValue;
	}
	public void setPortfolioValue(Double portfolioValue) {
		this.portfolioValue = portfolioValue;
	}
	public List<Company> getCompany() {
		return company;
	}
	public void setCompany(List<Company> company) {
		this.company = company;
	}
	public List<Stock> getStocks() {
		return stocks;
	}
	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}
	public List<Commodity> getCommodity() {
		return commodity;
	}
	public void setCommodity(List<Commodity> commodity) {
		this.commodity = commodity;
	}
	public PortfolioWallet getWallet() {
		return wallet;
	}
	public void setWallet(PortfolioWallet wallet) {
		this.wallet = wallet;
	}
	public CommissionCalculation getCommission() {
		return commission;
	}
	public void setCommission(CommissionCalculation commission) {
		this.commission = commission;
	}
	
	
}
