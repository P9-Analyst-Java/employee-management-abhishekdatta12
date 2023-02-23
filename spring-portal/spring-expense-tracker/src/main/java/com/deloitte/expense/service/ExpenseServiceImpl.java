package com.deloitte.expense.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.expense.model.Employee;
import com.deloitte.expense.model.EmploymentHistory;
import com.deloitte.expense.repository.EmploymentHistoryRepository;
//import com.deloitte.expense.model.Expense;
import com.deloitte.expense.repository.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService{

	@Autowired
	ExpenseRepository employeeRepository;
	
	@Autowired
	EmploymentHistoryRepository employmentHistoryRepository;
	
	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	public void save(Employee employee) {
//		employee.setCreatedAt(System.currentTimeMillis());
		employeeRepository.save(employee);
	}

	@Override
	public Employee findById(Integer id) {
		if(employeeRepository.findById(Long.valueOf(id)).isPresent()) {
			return employeeRepository.findById(Long.valueOf(id)).get();
		}
		return null;
	}

	@Override
	public void delete(Integer id) {
		Employee employee = findById(id);
		employeeRepository.delete(employee);
	}

	@Override
	public List<Employee> search(Long id, String name) {
		List<Employee> employees = new ArrayList<>();
		if(id==null)
			employees = employeeRepository.findByFirstName(name);
		else {
			Optional<Employee> optEmp = employeeRepository.findById(id);
			if(optEmp.isPresent())
				employees.add(optEmp.get());
		}
		return employees;
	}

	

	
	
}
