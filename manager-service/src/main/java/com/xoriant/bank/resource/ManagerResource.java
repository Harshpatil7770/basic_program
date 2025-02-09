package com.xoriant.bank.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.bank.model.Branch;
import com.xoriant.bank.model.PersonInfo;
import com.xoriant.bank.service.ManagerService;

@RestController
@RequestMapping("/api/manager")
@CrossOrigin
@RefreshScope
public class ManagerResource {

	@Autowired
	ManagerService managerService;
	
	@PostMapping
	public Branch addNewBranch(@RequestBody Branch branch) {
		return managerService.addNewBranch(branch);
	}
	
	@PostMapping("/addNewPerson")
	public PersonInfo addNewPerson(@RequestBody PersonInfo personInfo) {
		return managerService.addNewPerson(personInfo);
	}
	
	@PutMapping("/updatePerson")
	public int updateCustomer(int accountNumber,PersonInfo personInfo) {
		return managerService.updateCustomer(accountNumber, personInfo);
	}
}
