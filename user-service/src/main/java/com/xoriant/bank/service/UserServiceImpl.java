package com.xoriant.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.bank.dao.UserDao;
import com.xoriant.bank.dao.util.UserDTO;
import com.xoriant.bank.model.UserLoginDetails;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	@Override
	public String changePassword(UserDTO userDTO) {
		// TODO Auto-generated method stub
		return userDao.changePassword(userDTO);
	}

}
