package com.xoriant.bank.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.xoriant.bank.dao.util.UserDTO;

@FeignClient(name="user-service")
public interface UserServiceProxy {

	@PutMapping("api/user/changePassword")
	public String changePassword(@RequestBody UserDTO userDTO);
}
