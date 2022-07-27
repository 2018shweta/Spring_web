package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.UserBean;

@Repository
public class UserDao {
@Autowired
	JdbcTemplate stmt;

	public void addUser(UserBean user) {
		stmt.update("insert into users (firstname,email,password,usertype) values (?,?,?,?)",
				user.getFirstName(), user.getEmail(), user.getPassword(),
				user.getUserType());
	}

	public List<UserBean> getAllUsers() {
		
		
		List<UserBean> users =stmt.query("select * from users", new BeanPropertyRowMapper<UserBean>(UserBean.class));
		
		
		return users;
	}
	
	
	
	
	
}