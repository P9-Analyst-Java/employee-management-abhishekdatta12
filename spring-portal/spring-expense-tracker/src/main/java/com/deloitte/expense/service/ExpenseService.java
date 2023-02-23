package com.deloitte.expense.service;

import java.util.List;
import java.util.Optional;

import com.deloitte.expense.model.Employee;
//import com.deloitte.expense.model.Expense;
import com.deloitte.expense.model.EmploymentHistory;

public interface ExpenseService {

	List<Employee> findAll();
	void save(Employee employee);
	Employee findById(Integer id);
	void delete(Integer id);
	List<Employee> search(Long id, String name);
}