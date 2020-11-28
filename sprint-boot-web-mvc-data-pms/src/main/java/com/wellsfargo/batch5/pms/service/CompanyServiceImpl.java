package com.wellsfargo.batch5.pms.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wellsfargo.batch5.pms.exception.PortfolioException;
import com.wellsfargo.batch5.pms.model.CompanyModel;
import com.wellsfargo.batch5.pms.repo.CompanyRepo;
import com.wellsfargo.batch5.pms.util.EMParser;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyRepo companyRepo;
	
	@Transactional
	@Override
	public CompanyModel add(CompanyModel company) throws PortfolioException {
		if(company!=null)
		{
			if(companyRepo.existsById(company.getCompanyCode())) {
				throw new PortfolioException("Company " + company.getCompanyCode() +" already exists");
			}
			
			company = EMParser.parse(companyRepo.save(EMParser.parse(company)));
		}
		return company;
	}

	@Transactional
	@Override
	public CompanyModel update(CompanyModel company) throws PortfolioException {
		if(company!=null)
		{
			if(!companyRepo.existsById(company.getCompanyCode())) {
				throw new PortfolioException("Company " + company.getCompanyCode() +" does not exists");
			}
			
			company = EMParser.parse(companyRepo.save(EMParser.parse(company)));
		}
		return company;
	}

	@Override
	public CompanyModel get(int companyCode) throws PortfolioException {
		if(!companyRepo.existsById(companyCode)) {
			throw new PortfolioException("Company " + companyCode +" does not exists");
		}
			
		return EMParser.parse(companyRepo.findById(companyCode).get());
	}

	@Override
	public List<CompanyModel> getAll() throws PortfolioException {
		return companyRepo.findAll().stream().map(e->EMParser.parse(e)).collect(Collectors.toList());
	}

}
