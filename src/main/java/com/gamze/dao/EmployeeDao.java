package com.gamze.dao;

import java.util.List;

import com.gamze.model.Employee;

public interface EmployeeDao {
	
	public void add(Employee employee);
	public void edit(Employee employee);
	public void delete(int employee_no);
	public Employee getEmployee(int employee_no);
	public List getAllEmployee();

}
