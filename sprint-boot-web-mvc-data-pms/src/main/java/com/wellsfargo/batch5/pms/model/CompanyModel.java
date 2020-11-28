package com.wellsfargo.batch5.pms.model;

import java.util.Objects;
import java.util.Set;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;



public class CompanyModel implements Comparable<CompanyModel> {

	
	@NotNull(message="Company Code is mandate")
	@Min(value=1,message="Company Code can not be negative or zero")
    private Integer companyCode;
	
	@NotNull(message="Title is mandate")
	@NotBlank(message="Title is mandate")
    private String companyTitle;
	
	@NotBlank(message="Operations is mandate")
    private String companyOperations;
	
	@NotNull(message="Share count is mandate")
	@Min(value=1,message="Share count can not be negative or zero")
    private Integer shareCount;
	
    @NotNull(message="Open Share Price is mandate")
	@Min(value=1,message="Open Share Price can not be negative or zero")
    private Double openSharePrice;
	
    @NotBlank(message="Sector is mandate")
    private String sector;
	
    @NotBlank(message="Currency is mandate")
    private String currency;
	
   
    private Integer turnover;
	
	
	private Set<StockModel> stocks;
 
    public CompanyModel(){
   	 
    }
	
	public CompanyModel(Integer comapanyCode, String companyTitle, String companyOperations, Integer shareCount,
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

	public Set<StockModel> getStocks() {
		return stocks;
	}

	public void setStocks(Set<StockModel> stocks) {
		this.stocks = stocks;
	}


	@Override
	public int compareTo(CompanyModel comp) {
		
		return this.companyCode.compareTo(comp.getCompanyCode());
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
