package com.gamze.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gamze.model.Employee;
import com.gamze.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	@RequestMapping("/")
	public String setupForm(Map<String, Object> map){
		Employee employee=new Employee();
		map.put("employee", employee);
		map.put("employeeList", empService.getAllEmployee());
		return "employee";

	}
	
	@RequestMapping(value="/employee", method=RequestMethod.POST)
	public String doActions(@ModelAttribute Employee employee, BindingResult result, @RequestParam String action, Map<String, Object> map){
		Employee empResult = new Employee();
		switch(action.toLowerCase()){	
		case "add":
			empService.add(employee);
			empResult = employee;
			break;
		case "edit":
			empService.edit(employee);
			empResult = employee;
			break;
		case "delete":
			empService.delete(employee.getEmployee_no());
			empResult = new Employee();
			break;
		case "search":
			Employee searchedStudent = empService.getEmployee(employee.getEmployee_no());
			empResult = searchedStudent!=null ? searchedStudent : new Employee();
			break;
		}
		map.put("employee", empResult);
		map.put("employeeList", empService.getAllEmployee());
		return "employee";
	}
	
	
	

}
