package com.deloitte.expense.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.deloitte.expense.model.EmploymentHistory;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<EmploymentHistory> findHistory(Integer id) {
		return jdbcTemplate.query("Select* from employment_history where emp_id=?", new BeanPropertyRowMapper<EmploymentHistory>(EmploymentHistory.class), id);
	}

}
