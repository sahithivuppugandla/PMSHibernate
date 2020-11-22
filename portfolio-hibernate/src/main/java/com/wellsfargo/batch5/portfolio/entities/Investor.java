package com.wellsfargo.batch5.portfolio.entities;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;



@Entity
@Table(name="Investor")
public class Investor extends UserLogin{
    
	@Column(name="investor_name")
	private String investorName;
	
	@Column(name="investor_email")
	private String investorEmail;
	
	@Column(name="investot_phone")
	private Integer investorPhone;
	
	@Column(name="investor_address")
	private String investorAddress;
	
	
	@Column(name="investor_PAN",unique=true)
	private String investorPAN;
	
	@Column(name="amount_invested")
	private Double amountInvested;
	
	@Column(name="amount_earned")
	private Double amountEarned;
	
	@Column(name="portfolio_value")
	private Double portfolioValue;
	
	/*@OneToMany(mappedBy ="investor",cascade=CascadeType.ALL)
	private Set<Company> company;*/		
	
	/*@OneToMany(mappedBy ="investor",cascade=CascadeType.ALL)
	private Set<Stock> stocks;*/
	
	/*@OneToMany
	private List<Commodity> commodity;*/
	
	@Embedded
	private PortfolioWallet wallet;
		
	@Embedded
	private CommissionCalculation commission;
	
	
	
	public Investor() {
		
		System.out.println("default constructor");
	}
	
	public Investor(String investorName, String investorEmail, Integer investorPhone, String investorAddress,
			String investorPAN, Double amountInvested, Double amountEarned, Double portfolioValue
			) {
		super();
		this.investorName = investorName;
		this.investorEmail = investorEmail;
		this.investorPhone = investorPhone;
		this.investorAddress = investorAddress;
		this.investorPAN = investorPAN;
		this.amountInvested = amountInvested;
		this.amountEarned = amountEarned;
		this.portfolioValue = portfolioValue;
		//this.commission = commission;
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
	
	/*public Set<Company> getCompany() {
		return company;
	}

	public void setCompany(TreeSet<Company> treeSet) {
		this.company = treeSet;
	}*/

	/*public Set<Stock> getStocks() {
		return stocks;
	}
	public void setStocks(TreeSet<Stock> treeSet) {
		this.stocks = treeSet;
	}*/
	/*public List<Commodity> getCommodity() {
		return commodity;
	}
	public void setCommodity(List<Commodity> commodity) {
		this.commodity = commodity;
	}*/
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

	@Override
	public String toString() {
		return "Investor [investorName=" + investorName + ", investorEmail=" + investorEmail + ", investorPhone="
				+ investorPhone + ", investorAddress=" + investorAddress + ", investorPAN=" + investorPAN
				+ ", amountInvested=" + amountInvested + ", amountEarned=" + amountEarned + ", portfolioValue="
				+ portfolioValue + ", wallet=" + wallet + ", commission=" + commission + "]";
	}

	

	

	
	
	
	
}
