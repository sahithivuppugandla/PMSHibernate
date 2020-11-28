package com.wellsfargo.batch5.pms.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wellsfargo.batch5.pms.exception.PortfolioException;
import com.wellsfargo.batch5.pms.model.CompanyModel;
import com.wellsfargo.batch5.pms.model.StockModel;
import com.wellsfargo.batch5.pms.service.CompanyService;
import com.wellsfargo.batch5.pms.service.StockService;



@Controller
@RequestMapping("/stocks")
public class StockController {

	@Autowired
	private StockService stockService;
	
	@Autowired
	private CompanyService companyService;
	
	@GetMapping
	public ModelAndView stocksAction() throws PortfolioException {
		return new ModelAndView("stocks/stocks-page","stocks",stockService.getAll());
	}
	
	@GetMapping("/byCompany")
	public ModelAndView stocksByCompanyAction(@RequestParam("cid")int companyCode) throws PortfolioException {
		CompanyModel company = companyService.get(companyCode); 
		return new ModelAndView("stocks/stocks-page","stocks",stockService.getAll(company));
	}
	
	@GetMapping("/new")
	public ModelAndView newBookAction() {
		ModelAndView mv = new ModelAndView("stocks/stock-form-page","stock",new StockModel());
		mv.addObject("isNew",true);
		return mv;
	}
	
	@PostMapping("/add")
	public ModelAndView addBookAction(
			@ModelAttribute("stock") @Valid StockModel stock,
			BindingResult result) throws PortfolioException {
		ModelAndView mv=null;
		
		if(result.hasErrors()) {
			mv = new ModelAndView("stocks/stock-form-page","stock",stock);	
			mv.addObject("isNew",true);
		}else {
			stockService.add(stock);
			mv = new ModelAndView("redirect:/stocks");
		}
		return mv;
	}
	
	@ModelAttribute("companies")
	public List<CompanyModel> allCompanies() throws PortfolioException{
		return companyService.getAll();
	}
}
