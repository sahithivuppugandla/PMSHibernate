package com.wellsfargo.batch5.pms.controller;

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
import com.wellsfargo.batch5.pms.service.CompanyService;

@Controller
@RequestMapping("/company")
public class CompanyController {

	@Autowired
	private CompanyService companyService;
	
	@GetMapping
	public ModelAndView companiesAction() throws PortfolioException {
		return new ModelAndView("company/companies-page","companies",companyService.getAll());
	}
	
	@GetMapping("/new")
	public ModelAndView newCompanyAction() {
		ModelAndView mv = new ModelAndView("company/company-form-page","company",new CompanyModel());
		mv.addObject("isNew",true);
		return mv;
	}
	
	@PostMapping("/add")
	public ModelAndView addBookAction(
			@ModelAttribute("company") @Valid CompanyModel company,
			BindingResult result) throws PortfolioException {
		ModelAndView mv=null;
		
		if(result.hasErrors()) {
			mv = new ModelAndView("company/company-form-page","company",company);	
			mv.addObject("isNew",true);
		}else {
			companyService.add(company);
			mv = new ModelAndView("redirect:/company");
		}
		return mv;
	}
	
	@GetMapping("/edit")
	public ModelAndView editBookAction(@RequestParam("cid")int companyCode) throws PortfolioException {	
		ModelAndView mv = new ModelAndView("company/company-form-page","company",companyService.get(companyCode));
		mv.addObject("isNew",false);
		return mv;
	}
	
	@PostMapping("/update")
	public ModelAndView updateBookAction(
			@ModelAttribute("company") @Valid CompanyModel company,
			BindingResult result) throws PortfolioException {
		ModelAndView mv=null;
		
		if(result.hasErrors()) {
			mv = new ModelAndView("company/company-form-page","company",company);	
			mv.addObject("isNew",false);
		}else {
			companyService.update(company);
			mv = new ModelAndView("redirect:/company");
		}
		return mv;
	}
}
