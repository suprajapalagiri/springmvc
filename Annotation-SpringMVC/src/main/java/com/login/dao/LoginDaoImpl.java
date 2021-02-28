package com.login.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public boolean loginCheck(String Username, String Password) {
		int count = jdbcTemplate.queryForObject("select count(*) from user_table where username=? and password=?",
				Integer.class, Username, Password);
		if (count == 1) {
			return true;
		} else {
			return false;
		}
	}
}
