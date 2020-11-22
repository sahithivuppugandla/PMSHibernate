package com.wellsfargo.batch5.portfolio.ui;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


import com.wellsfargo.batch5.portfolio.entities.Company;
import com.wellsfargo.batch5.portfolio.entities.Investor;
import com.wellsfargo.batch5.portfolio.entities.Stock;
import com.wellsfargo.batch5.portfolio.util.JpaUtil;

public class Sample {
	
	public static void main(String[] args) {
		Company c1 = new Company(205,"TCS","Software",4567,57.0,"IT","USD",987654);
		Company c2 = new Company(206,"Reliance","Telecommuniations",9304,957.0,"Telecom","USD",87654);
		c1.setStocks(new TreeSet<Stock>());
		
		c1.getStocks().add(new Stock(5,"BSA",900.0,LocalDate.now(),LocalTime.now(),c1));
		c1.getStocks().add(new Stock(6,"NSE",700.0,LocalDate.now(),LocalTime.now(),c1));
		c1.getStocks().add(new Stock(7,"NSE",600.0,LocalDate.now(),LocalTime.now(),c1));
		
		c2.setStocks(new TreeSet<Stock>());
		
		c2.getStocks().add(new Stock(8,"NSE",1000.0,LocalDate.now(),LocalTime.now(),c2));
		c2.getStocks().add(new Stock(9,"BSE",500.0,LocalDate.now(),LocalTime.now(),c2));
		EntityManager em = JpaUtil.getEntityManager();
		
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		em.persist(c1);
		em.persist(c2);
		txn.commit();
		em.close();
	}

}
