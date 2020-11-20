package com.wellsfargo.batch5.portfolio.entities;

public class PortfolioWallet {

	private double walletBalance;
	private double amountInvested;
	private double amountWithdrawn;
	
	
	public double getWalletBalance() {
		return walletBalance;
	}
	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}
	public double getAmountInvested() {
		return amountInvested;
	}
	public void setAmountInvested(double amountInvested) {
		this.amountInvested = amountInvested;
	}
	public double getAmountWithdrawn() {
		return amountWithdrawn;
	}
	public void setAmountWithdrawn(double amountWithdrawn) {
		this.amountWithdrawn = amountWithdrawn;
	}

	
}
