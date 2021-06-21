package com.cognizant.transactionservice.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

import com.cognizant.transactionservice.exception.MinimumBalanceException;
import com.cognizant.transactionservice.feign.AccountFeign;
import com.cognizant.transactionservice.feign.RulesFeign;
import com.cognizant.transactionservice.models.Transaction;
import com.cognizant.transactionservice.repository.TransactionRepository;
import com.cognizant.transactionservice.util.AccountInput;
import com.cognizant.transactionservice.util.TransactionInput;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class TransactionServiceTest {

	
	
	@InjectMocks
	TransactionService consumerService;
	
	@Mock
	private AccountFeign accountFeign;

	@Mock
	private TransactionRepository transactionRepository;

	@Mock
	private RulesFeign ruleFeign;


	
	@Test
	 public void getConsumerBusinessTest1() throws Exception {
		
		TransactionInput inp=new TransactionInput();
		inp.setSourceAccount(new AccountInput(10054546,1000.0));
		inp.setTargetAccount(new AccountInput(10054546,1000.0));
		inp.setAmount(1000.0);
		inp.setReference("TRANSFER");
		assertThrows( Exception.class, ()->consumerService.makeTransfer("tokrn", inp));

	}
	

}
