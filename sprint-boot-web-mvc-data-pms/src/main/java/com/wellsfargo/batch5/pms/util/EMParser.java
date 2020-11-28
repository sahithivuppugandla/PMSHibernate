package com.wellsfargo.batch5.pms.util;

import com.wellsfargo.batch5.pms.entity.CompanyEntity;
import com.wellsfargo.batch5.pms.entity.StockEntity;
import com.wellsfargo.batch5.pms.model.CompanyModel;
import com.wellsfargo.batch5.pms.model.StockModel;

public class EMParser {

	public static CompanyModel parse(CompanyEntity source) {
		CompanyModel target = new CompanyModel();
		
		target.setCompanyCode(source.getCompanyCode());
		target.setCompanyTitle(source.getCompanyTitle());
		target.setCompanyOperations(source.getCompanyOperations());
		target.setShareCount(source.getShareCount());
		target.setOpenSharePrice(source.getOpenSharePrice());
		target.setSector(source.getSector());
		target.setCurrency(source.getCurrency());
		target.setTurnover(source.getTurnover());
				
		return target;
	}
	
	public static StockModel parse(StockEntity source) {
		StockModel target = new StockModel();
		
		target.setStockId(source.getStockId());
		target.setStockExchange(source.getStockExchange());
		target.setCurrentPrice(source.getCurrentPrice());
		target.setDate(source.getDate());
		target.setTime(source.getTime());
		target.setCompany(parse(source.getCompany()));
		
		
		return target;
		
	}
	
	public static CompanyEntity parse(CompanyModel source) {
		
		CompanyEntity target = new CompanyEntity();
		
		target.setCompanyCode(source.getCompanyCode());
		target.setCompanyTitle(source.getCompanyTitle());
		target.setCompanyOperations(source.getCompanyOperations());
		target.setShareCount(source.getShareCount());
		target.setOpenSharePrice(source.getOpenSharePrice());
		target.setSector(source.getSector());
		target.setCurrency(source.getCurrency());
		target.setTurnover(source.getTurnover());
				
		return target;
	}
	
	public static StockEntity parse(StockModel source) {
		StockEntity target = new StockEntity();
		
		target.setStockId(source.getStockId());
		target.setStockExchange(source.getStockExchange());
		target.setCurrentPrice(source.getCurrentPrice());
		target.setDate(source.getDate());
		target.setTime(source.getTime());
		target.setCompany(parse(source.getCompany()));
		
		
		return target;
		
	}
	
}
