package com.gamze.service;

import java.util.List;

import com.gamze.model.Employee;

public interface EmployeeService {
	
	public void add(Employee employee);
	public void edit(Employee employee);
	public void delete(int employee_no);
	public Employee getEmployee(int employee_no);
	@SuppressWarnings("rawtypes")
	public List getAllEmployee();

}
