package com.wellsfargo.batch5.pms.service;

import java.util.List;

import com.wellsfargo.batch5.pms.exception.PortfolioException;
import com.wellsfargo.batch5.pms.model.CompanyModel;

public interface CompanyService {
	
	CompanyModel add(CompanyModel company) throws PortfolioException;
	CompanyModel update(CompanyModel company) throws PortfolioException;
	CompanyModel get(int companyCode) throws PortfolioException;
	List<CompanyModel> getAll() throws PortfolioException;
}
