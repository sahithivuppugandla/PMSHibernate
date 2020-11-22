package com.wellsfargo.batch5.portfolio.ui;

import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.wellsfargo.batch5.portfolio.entities.Company;
import com.wellsfargo.batch5.portfolio.entities.Investor;
import com.wellsfargo.batch5.portfolio.entities.Stock;
import com.wellsfargo.batch5.portfolio.util.JpaUtil;

public class InvestoSample {

	public static void main(String[] args) {
		
		Investor invest=new Investor("WellsFargo", "test@gmail.com",980765123,"Hyderabad","DHUP1234",2500.50,500.45,1000.50);
		//invest.setCompany(new TreeSet<Company>());
		
		//invest.getCompany().add(new Company(101,"BankStocks","banking",12,150.50,"BANKING","USD",10));
		
		EntityManager em = JpaUtil.getEntityManager();
		
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		
		em.persist(invest);
		
		txn.commit();
		System.out.println("Investor Saved!");
		em.close();
	}

	
}
