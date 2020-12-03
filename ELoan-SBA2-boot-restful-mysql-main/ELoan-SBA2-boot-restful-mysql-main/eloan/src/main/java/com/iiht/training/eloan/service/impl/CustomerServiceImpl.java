package com.iiht.training.eloan.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.training.eloan.dto.LoanDto;
import com.iiht.training.eloan.dto.LoanOutputDto;
import com.iiht.training.eloan.dto.UserDto;
import com.iiht.training.eloan.exception.CustomerNotFoundException;
import com.iiht.training.eloan.exception.LoanNotFoundException;
import com.iiht.training.eloan.repository.LoanRepository;
import com.iiht.training.eloan.repository.ProcessingInfoRepository;
import com.iiht.training.eloan.repository.SanctionInfoRepository;
import com.iiht.training.eloan.repository.UsersRepository;
import com.iiht.training.eloan.service.CustomerService;
import com.iiht.training.eloan.service.EMParser;


@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private UsersRepository usersRepository;
	
	@Autowired
	private LoanRepository loanRepository;
	
	@Autowired
	private ProcessingInfoRepository pProcessingInfoRepository;
	
	@Autowired
	private SanctionInfoRepository sanctionInfoRepository;
	
	@Override
	public UserDto register(UserDto userDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LoanOutputDto applyLoan(Long customerId, LoanDto loanDto) {
		if (loanDto != null) {
			if (!loanRepository.existsById(customerId)) {
				throw new CustomerNotFoundException("Customer" + customerId + "  does not exists");
			}
			loanDto = EMParser.parse(loanRepository.save(EMParser.parse(loanDto)));
		}
		
		LoanOutputDto loanOutputDto = new LoanOutputDto();
		loanOutputDto.setLoanDto(loanDto);
		return loanOutputDto;
		
		
	}

	@Override
	public LoanOutputDto getStatus(Long loanAppId) {
		if(!loanRepository.existsById(loanAppId)) {
			throw new LoanNotFoundException("Loan" + loanAppId + "  does not exists");
		}
		LoanDto loanDto = EMParser.parse(loanRepository.findById(loanAppId).get());
		
		LoanOutputDto loanOutputDto = new LoanOutputDto();
		loanOutputDto.setLoanDto(loanDto);
		return loanOutputDto;
		
		
	}

	@Override
	public List<LoanOutputDto> getStatusAll(Long customerId) {
		//return loanRepository.findAllById(customerId)
				//.stream().map(e->EMParser.parse(e)).collect(Collectors.toList());
		return null;
	}

}
