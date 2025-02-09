package com.xoriant.bank.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.bank.dao.util.UserDTO;
import com.xoriant.bank.service.UserService;

@RestController
@RequestMapping("/api/user")
@RefreshScope
@CrossOrigin
public class UserResource {

	@Autowired
	UserService userService;
	
	@PutMapping("/changePassword")
	public String changePassword(@RequestBody UserDTO userDTO) {
		 String result=userService.changePassword(userDTO);
		 return result;
	}
}
