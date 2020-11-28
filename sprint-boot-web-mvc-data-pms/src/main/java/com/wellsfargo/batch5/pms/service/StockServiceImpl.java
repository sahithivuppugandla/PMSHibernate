package com.wellsfargo.batch5.pms.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.wellsfargo.batch5.pms.exception.PortfolioException;
import com.wellsfargo.batch5.pms.model.CompanyModel;
import com.wellsfargo.batch5.pms.model.StockModel;
import com.wellsfargo.batch5.pms.repo.StockRepo;
import com.wellsfargo.batch5.pms.util.EMParser;


@Service
public class StockServiceImpl implements StockService {

	@Autowired
	private StockRepo stockRepo;
	
	@Transactional
	@Override
	public StockModel add(StockModel stock) throws PortfolioException {
		if(stock!=null)
		{
			if(stockRepo.existsById(stock.getStockId())) {
				throw new PortfolioException("Stock " + stock.getStockId() +" already exists");
			}
			
			stock = EMParser.parse(stockRepo.save(EMParser.parse(stock)));
		}
		return stock;
	}

	@Override
	public StockModel get(int stockId) throws PortfolioException {
		if(!stockRepo.existsById(stockId)) {
			throw new PortfolioException("Stock " + stockId +" does not exists");
		}
			
		return EMParser.parse(stockRepo.findById(stockId).get());
	}

	@Override
	public List<StockModel> getAll() throws PortfolioException {
		return stockRepo.findAll().stream().map(e->EMParser.parse(e)).collect(Collectors.toList());
	}

	@Override
	public List<StockModel> getAll(CompanyModel company) throws PortfolioException {
		return stockRepo.findAllByCompany(EMParser.parse(company))
				.stream().map(e->EMParser.parse(e)).collect(Collectors.toList());
	}
	
	

}
