package com.xoriant.bank.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.bank.model.TransactionDetails;
import com.xoriant.bank.model.util.CustomerDTO;
import com.xoriant.bank.service.TransactionService;

@RestController
@RequestMapping("/api/transaction")
@RefreshScope
@CrossOrigin // application made server.port=9090 now i want to access from outside from machine 
public class TransactionResource {

	@Autowired
	TransactionService transactionSerivce;
	
	@GetMapping("/withdraw/{amount}/{accountNumber}/{description}/{transactionType}/{accountType}")
	public String withdrawMoney(@PathVariable double amount,@PathVariable int accountNumber,@PathVariable String description,
			@PathVariable String transactionType,@PathVariable String accountType) {
		CustomerDTO dto=new CustomerDTO();
		dto.setAmount(amount);
		dto.setAccountNumber(accountNumber);
		dto.setDescription(description);
		dto.setTransactionType(transactionType);
		dto.setAccountType(accountType);
		
		return transactionSerivce.withdrawMoney(dto);	
	}
	
	@GetMapping("/deposite/{amount}/{accountNumber}/{description}/{transactionType}/{accountType}")
		public String DepositeMoney(@PathVariable double amount,@PathVariable int accountNumber,
				@PathVariable String description,@PathVariable String transactionType,
				@PathVariable String accountType) {
	CustomerDTO dto=new CustomerDTO();
	dto.setAccountNumber(accountNumber);
	dto.setAccountType(accountType);
	dto.setAmount(amount);
	dto.setDescription(description);
	dto.setTransactionType(transactionType);
		return transactionSerivce.depositeMoney(dto);
				
	}
	
	@GetMapping("/ministatement/{accountNumber}")
	public List<TransactionDetails> miniStatement(@PathVariable int accountNumber){
		return transactionSerivce.miniStatement(accountNumber);
	}
	
	@GetMapping("/fundtransfer/{amount}/{accountNumber}/{description}/{transactionType}/{accountType}")
	public String fundTransfer(@PathVariable double amount,@PathVariable int accountNumber,@PathVariable String description,
			@PathVariable String transactionType,@PathVariable String accountType) {
		CustomerDTO dto=new CustomerDTO();
		dto.setAmount(amount);
		dto.setAccountNumber(accountNumber);
		dto.setDescription(description);
		dto.setTransactionType(transactionType);
		dto.setAccountType(accountType);
		
		return transactionSerivce.fundTransfer(dto);	
}
	@GetMapping("/checkBalance/{accountNumber}")
	public String checkBalance(@PathVariable int accountNumber) { 
		return transactionSerivce.checkBalance(accountNumber);
	}
}

