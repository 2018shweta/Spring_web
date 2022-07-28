package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.SecQueAnsBean;

@Repository
public class SecQueAnsDao {

	
	@Autowired
	JdbcTemplate stmt;

	public void addQuestion(SecQueAnsBean secQueAnsBean) {
		stmt.update("insert into secqueans (question,ans,userid) values (?,?,?)", secQueAnsBean.getQuestion(),
				secQueAnsBean.getAns(), secQueAnsBean.getUserId());
	}
	
}
