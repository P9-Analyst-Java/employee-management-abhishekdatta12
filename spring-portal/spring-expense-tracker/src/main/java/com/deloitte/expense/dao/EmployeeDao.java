package com.deloitte.expense.dao;

import java.util.List;

import com.deloitte.expense.model.EmploymentHistory;

public interface EmployeeDao {

	public List<EmploymentHistory> findHistory(Integer id);
	
}
