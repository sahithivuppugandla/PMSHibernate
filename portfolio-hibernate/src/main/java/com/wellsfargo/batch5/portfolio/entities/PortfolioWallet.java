package com.wellsfargo.batch5.portfolio.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

@Embeddable
@Table(name="portfoliowallet")
public class PortfolioWallet {

	@Column(name="wallet_balance")
	private Double walletBalance;
	
	@Column(name="amount_withdrawn")
	private Double amountWithdrawn;
	
	
	public PortfolioWallet() {
		
	}

	public PortfolioWallet(Double walletBalance, Double amountWithdrawn) {
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

	
}
