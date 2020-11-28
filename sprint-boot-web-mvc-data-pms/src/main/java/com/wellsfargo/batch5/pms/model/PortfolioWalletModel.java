package com.wellsfargo.batch5.pms.model;

import javax.persistence.Column;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class PortfolioWalletModel {

	@NotNull(message="wallet balance is mandate")
	private Double walletBalance;
	
	private Double amountWithdrawn;
	
	
	public PortfolioWalletModel() {
		
	}

	public PortfolioWalletModel(Double walletBalance, Double amountWithdrawn) {
		super();
		this.walletBalance = walletBalance;
		this.amountWithdrawn = amountWithdrawn;
	}
	
	public Double getWalletBalance() {
		return walletBalance;
	}
	public void setWalletBalance(Double walletBalance) {
		this.walletBalance = walletBalance;
	}
	
	public Double getAmountWithdrawn() {
		return amountWithdrawn;
	}
	public void setAmountWithdrawn(Double amountWithdrawn) {
		this.amountWithdrawn = amountWithdrawn;
	}

	@Override
	public String toString() {
		return "PortfolioWalletEntity [walletBalance=" + walletBalance + ", amountWithdrawn=" + amountWithdrawn + "]";
	}

	
}
