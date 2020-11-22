package com.wellsfargo.batch5.portfolio.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.wellsfargo.batch5.portfolio.entities.CommissionCalculation;
import com.wellsfargo.batch5.portfolio.entities.Investor;
import com.wellsfargo.batch5.portfolio.entities.PortfolioWallet;
import com.wellsfargo.batch5.portfolio.util.JpaUtil;

public class PortfolioApp {

public static void main(String[] args) {
		
		Investor invest=new Investor("WellsFargo", "test@gmail.com",980765123,"Hyderabad","BKKHUP1234",2500.50,500.45,1000.50);
		invest.setWallet(new PortfolioWallet(2000.00, 800.00));
		invest.setCommission(new CommissionCalculation(3, 200.00));
	
		EntityManager em = JpaUtil.getEntityManager();
		
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		em.persist(invest);
		
		txn.commit();
		em.close();
	}
}
