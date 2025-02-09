package com.xoriant.bank.dao;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.xoriant.bank.dao.util.DBquries;
import com.xoriant.bank.dao.util.UserDTO;
import com.xoriant.bank.resource.MailSender;



@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	public MailSender sender;
	
	public String changePassword(UserDTO userDTO) {
	UserDTO dto=UserDTO.getUserDetails(userDTO.getCustomerId(),jdbcTemplate);
	if(dto.getPassword().equals(userDTO.getOldPassword()))
	{
		int status=jdbcTemplate.update(DBquries.UPDATE_PASSWORD,userDTO.getNewPassword(),userDTO.getCustomerId());	
		if(status!=0) {
		sender.changePasswordDetails(userDTO.getNewPassword());
		return 	"Password changed succesfully";
		}
	}
		return "===========Password not matched==========";
	}

}
