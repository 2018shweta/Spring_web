package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.LoginUserBean;
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

	public void deleteuser(int UserId) {
		
		stmt.update("delete from users where userId=?",UserId);
		
		
	}

	public UserBean getUserByUserId(int userId) {
		
		UserBean user=stmt.queryForObject("select * from users where userid=?",new BeanPropertyRowMapper<UserBean>(UserBean.class),new Object[] {userId});
		
		
		
		return user;
	}

	public  List<UserBean> getSearchUser(String name) {
	   System.out.print(name);	
      name=name+"%";
		List<UserBean> user=stmt.query("select * from users where firstname ilike ?",new BeanPropertyRowMapper<UserBean>(UserBean.class),new Object[] {name});
		System.out.println(user);
		
		return user;
	}

	public void updateUser(UserBean user) {
		stmt.update("update  users set firstName=?  where userid=?   ",user.getFirstName(),user.getUserId());
		
	}

	public UserBean authenticate(LoginUserBean loginBean) {
		
		UserBean user = null;

		try {
		user = stmt.queryForObject("select * from users where email = ? and password = ? ",
				new BeanPropertyRowMapper<UserBean>(UserBean.class),
				new Object[] { loginBean.getEmail(), loginBean.getPassword() });
		}catch(Exception e) {
			System.out.println("invalid email password");
		}
		return user;
	}
	
	
	
	
	
	
}
