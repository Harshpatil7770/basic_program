package com.xoriant.bank.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.xoriant.bank.model.TransactionDetails;

@FeignClient(name="transaction-service")
public interface TransactionServiceProxy {
	
	@GetMapping("/api/transaction/withdraw/{accountNumber}/{amount}/{description}/{userType}/{transactionType}/{accountType}")
	public String withdrawMoney(@PathVariable int accountNumber,@PathVariable double amount,@PathVariable String description,
			@PathVariable String userType,@PathVariable String accountType);

	@GetMapping("/api/transaction/deposite/{accountNumber}/{amount}/{description}/{userType}/{transactionType}/accountType}")
	public String depositeMoney(@PathVariable int accountNumber,@PathVariable double amount,@PathVariable String description,
			@PathVariable String userType,@PathVariable String transactionType,@PathVariable String accountType);
	
	@GetMapping("/api/transaction/fundTransfer/{accountNumber}/{amount}/{description}/{userType}/{transactionType}/{accountType}")
	public String fundTransfer(@PathVariable int accountNumber,@PathVariable double amount,@PathVariable String description,
	@PathVariable String userType,@PathVariable String transactionType,@PathVariable String accountType);
	
	@GetMapping("/api/transaction/ministatement/{accountNumber}")
	public List<TransactionDetails> miniStatement(@PathVariable int accountNumber);
	
	@GetMapping("/api/transaction/checkBalance/{accountNumber}")
	public String checkBalance(@PathVariable int accountNumber);
}
