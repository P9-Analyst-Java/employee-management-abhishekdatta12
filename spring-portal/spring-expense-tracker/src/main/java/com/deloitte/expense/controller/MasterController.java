package com.deloitte.expense.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import com.deloitte.expense.dao.EmployeeDao;
import com.deloitte.expense.model.Employee;
import com.deloitte.expense.model.EmploymentHistory;
//import com.deloitte.employee.model.Expense;
import com.deloitte.expense.service.ExpenseService;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;

import jakarta.servlet.http.HttpServletResponse;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MasterController {

	@Autowired
	ExpenseService employeeService;

	@Autowired
	private EmployeeDao eDao;

	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("message", "List of Employees");
		List<Employee> employees = employeeService.findAll();
		System.out.println(employees);
		mav.addObject("employees", employees);
		return mav;
	}

	@RequestMapping("/employee")
	public ModelAndView addExpense() {
		ModelAndView mav = new ModelAndView("employee");
		mav.addObject("employee", new Employee());
		return mav;
	}

	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public String save(@ModelAttribute("employee") Employee employee) {
		employeeService.save(employee);
		return "redirect:/";
	}

	@RequestMapping(value = "/employee/{id}")
	public ModelAndView edit(@PathVariable("id") Integer id) {
		ModelAndView mav = new ModelAndView("employee");
		Employee employee = employeeService.findById(id);
		mav.addObject("employee", employee);
		return mav;
	}

	@RequestMapping(value = "/{id}")
	public String delete(@PathVariable("id") Integer id) {
		employeeService.delete(id);
		return "redirect:/";
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public ModelAndView search(@Param("id") Long id, @Param("name") String name) {
		ModelAndView mav = new ModelAndView("home");
		List<Employee> employees;
//		if(id!=null) {
//			employees = employeeDao.search(id);
//		}
//		else {
//			employees= employeeDao.search(name);
//		}
//		mav.addObject("employees", employees);
		employees = employeeService.search(id, name);
		if (employees != null) {
			mav.addObject("employees", employees);
		}
		System.out.println(employees);
		return mav;
	}

	@RequestMapping("/history/{id}")
	public ModelAndView history(@PathVariable("id") Integer id) {
		ModelAndView mav = new ModelAndView("employment");
		mav.addObject("message", "Employee History of Employee#" + id);
		List<EmploymentHistory> employees = eDao.findHistory(id);
		System.out.println(employees);
		mav.addObject("employees", employees);
		return mav;
	}

//	@RequestMapping("/exportUsers")
//    public void exportCSV(HttpServletResponse response) throws Exception {
//
//        //set file name and content type
//        String filename = "employees.csv";
//
//        response.setContentType("text/csv");
//        response.setHeader(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + filename + "\"");
//
//        //create a csv writer
//        StatefulBeanToCsv<Employee> writer = new StatefulBeanToCsvBuilder<Employee>(response.getWriter())
//                .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
//                .withSeparator(CSVWriter.DEFAULT_SEPARATOR)
//                .withOrderedResults(false)
//                .build();
//
//        writer.write(employeeService.findAll());
//        
//                
//    }

	@RequestMapping(value = "/exportUsers", method = RequestMethod.GET)
	public void exportToCSV(HttpServletResponse response) throws IOException {
		response.setContentType("text/csv");
		DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
		String currentDateTime = dateFormatter.format(new Date());

		String headerKey = "Content-Disposition";
		String headerValue = "attachment; filename=Employee_" + currentDateTime + ".csv";
		response.setHeader(headerKey, headerValue);

		List<Employee> listUsers = employeeService.findAll();

		ICsvBeanWriter csvWriter = new CsvBeanWriter(response.getWriter(), CsvPreference.STANDARD_PREFERENCE);
		String[] csvHeader = { "Emp Id", "Name", "Doj", "Post", "Level", "Mobile", "Personal Mail", "Office Mail",
				"Dob", "Blood Group", "Pan no", "Aadhar no" };
		String[] nameMapping = { "id", "firstName", "doj", "postName", "empLevel", "mobileNum", "emailId", "officeMail",
				"dob", "bloodGroup", "panNum", "aadhaarNum" };

		csvWriter.writeHeader(csvHeader);

		for (Employee user : listUsers) {
			csvWriter.write(user, nameMapping);
		}

		csvWriter.close();

	}

}
