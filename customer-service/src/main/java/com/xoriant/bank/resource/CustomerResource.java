package com.xoriant.bank.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.bank.dao.util.CustomerDTO;
import com.xoriant.bank.dao.util.UserDTO;
import com.xoriant.bank.model.AccountDetails;
import com.xoriant.bank.model.Address;
import com.xoriant.bank.model.TransactionDetails;
import com.xoriant.bank.service.CustomerService;

@RestController
@RequestMapping("/api/customer")
@RefreshScope
@CrossOrigin
public class CustomerResource {

	@Autowired
	CustomerService customerService;
	
	@PutMapping("/{customerId}")
	public Address editAddress(@RequestBody Address address,@PathVariable int customerId) {
		return customerService.editAddress(address, customerId);
	}
	
	@GetMapping("/{accountNumber}")
	public List<AccountDetails> findAccountDetails(@PathVariable int accountNumber ){ 
		return customerService.findAccountDetails(accountNumber);
	}
	
	@GetMapping("/withdraw")
	public String withdrawMoney(@RequestBody CustomerDTO customerDTO) {
		 String balance=customerService.withdrawMoney(customerDTO.getAmount(), customerDTO.getAccountNumber(),
				 customerDTO.getDescription(),customerDTO.getTransactionType(),customerDTO.getUserType(),customerDTO.getAccountType());
		 return  balance;
	
	}
	
	@GetMapping("/deposite")
	public String depositeMoney(@RequestBody CustomerDTO customerDTO) {
		String balance=customerService.depositeMoney(customerDTO.getAmount(), customerDTO.getAccountNumber(),
				customerDTO.getDescription(),customerDTO.getTransactionType(),customerDTO.getUserType(),customerDTO.getAccountType());
		return balance;
	}
	
	@GetMapping("/fundTransfer")
	public String fundTransfer(@RequestBody CustomerDTO customerDTO) {
		String balance=customerService.fundTransfer(customerDTO.getAmount(), customerDTO.getAccountNumber(), 
				customerDTO.getDescription(),customerDTO.getTransactionType(),customerDTO.getUserType(),customerDTO.getAccountType());
		return balance;
	}
	
	@GetMapping("/{accountNumber}")
	public List<TransactionDetails> miniStatement(@PathVariable int accountNumber){
		return customerService.miniStatement(accountNumber);
	}
	
	@GetMapping("/checkBalance/{accountNumber}")
	public String checkBalance(@PathVariable int accountNumber) {
		return customerService.checkBalance(accountNumber);
	}
	
	@GetMapping("/changePassword")
	public String changePassword(@RequestBody UserDTO userDTO) {
		return customerService.changePassword(userDTO);
	}
	
}
