package com.wellsfargo.batch5.portfolio.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.wellsfargo.batch5.portfolio.entities.UserLogin;
import com.wellsfargo.batch5.portfolio.util.JpaUtil;

public class UserLoginApp {

	public static void main(String[] args) {
		
		UserLogin investor = new UserLogin("Karthik","pword3","Investor");
		UserLogin su = new UserLogin("Pavani","pword1","Admin");
		UserLogin BOR = new UserLogin("alex","pword2","BackOfficeUser");
		EntityManager em = JpaUtil.getEntityManager();
		
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		
		em.persist(su);
		em.persist(BOR);
		em.persist(investor);
		
		txn.commit();
		
		em.close();
	}

}
