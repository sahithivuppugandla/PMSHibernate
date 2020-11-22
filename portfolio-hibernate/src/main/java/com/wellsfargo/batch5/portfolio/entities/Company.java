package com.wellsfargo.batch5.portfolio.entities;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;







@Entity
@Table(name="company")
public class Company implements Comparable<Company> {
	
	@Id
	@Column(name="comp_code")
    private Integer companyCode;
	
	@Column(name="comp_title")
    private String companyTitle;
	
	@Column(name="comp_opr")
    private String companyOperations;
	
	@Column(name="sharecount")
    private Integer shareCount;
	
	@Column(name="open_share_price")
    private Double openSharePrice;
	
	@Column(name="sector")
    private String sector;
	
	@Column(name="currency")
    private String currency;
	
	@Column(name="turnover")
    private Integer turnover;
	
	@OneToMany(mappedBy="company", cascade=CascadeType.ALL)
	private Set<Stock> stocks;

	@ManyToOne
	@JoinColumn(name="investor_PAN")
	private Investor investor;
	
   
    public Company(){
   	 System.out.println("default constructor");
    }

    
	
	public Company(Integer comapanyCode, String companyTitle, String companyOperations, Integer shareCount,
			Double openSharePrice, String sector, String currency, Integer turnover) {
		super();
		this.companyCode = comapanyCode;
		this.companyTitle = companyTitle;
		this.companyOperations = companyOperations;
		this.shareCount = shareCount;
		this.openSharePrice = openSharePrice;
		this.sector = sector;
		this.currency = currency;
		this.turnover = turnover;
		
	}



	

	public Integer getCompanyCode() {
		return companyCode;
	}



	public void setCompanyCode(Integer companyCode) {
		this.companyCode = companyCode;
	}



	public String getCompanyTitle() {
		return companyTitle;
	}

	public void setCompanyTitle(String companyTitle) {
		this.companyTitle = companyTitle;
	}

	public String getCompanyOperations() {
		return companyOperations;
	}

	public void setCompanyOperations(String companyOperations) {
		this.companyOperations = companyOperations;
	}

	public Integer getShareCount() {
		return shareCount;
	}

	public void setShareCount(Integer shareCount) {
		this.shareCount = shareCount;
	}

	public Double getOpenSharePrice() {
		return openSharePrice;
	}

	public void setOpenSharePrice(Double openSharePrice) {
		this.openSharePrice = openSharePrice;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Integer getTurnover() {
		return turnover;
	}

	public void setTurnover(Integer turnover) {
		this.turnover = turnover;
	}

	public Set<Stock> getStocks() {
		return stocks;
	}


	public void setStocks(TreeSet<Stock> treeSet) {
		this.stocks = treeSet;
	}



	public int compareTo(Company comp) {
		
		return this.companyCode.compareTo(comp.companyCode);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(companyCode);
	}
	

	@Override
	public boolean equals(Object obj) {
		
		return Objects.equals(this, obj);
	}



	@Override
	public String toString() {
		return "Company [companyCode=" + companyCode + ", companyTitle=" + companyTitle + ", companyOperations="
				+ companyOperations + ", shareCount=" + shareCount + ", openSharePrice=" + openSharePrice + ", sector="
				+ sector + ", currency=" + currency + ", turnover=" + turnover + ", stocks=" + stocks + "]";
	}



	

	
	
	
}