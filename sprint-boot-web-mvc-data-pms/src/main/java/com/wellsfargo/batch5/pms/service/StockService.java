package com.wellsfargo.batch5.pms.service;

import java.util.List;

import com.wellsfargo.batch5.pms.exception.PortfolioException;
import com.wellsfargo.batch5.pms.model.CompanyModel;
import com.wellsfargo.batch5.pms.model.StockModel;



public interface StockService {

	StockModel add(StockModel stock) throws PortfolioException;
	StockModel get(int stockId) throws PortfolioException;
	List<StockModel> getAll() throws PortfolioException;
	List<StockModel> getAll(CompanyModel company) throws PortfolioException;
}
