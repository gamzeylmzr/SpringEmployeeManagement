package com.gamze.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gamze.dao.EmployeeDao;
import com.gamze.model.Employee;
import com.gamze.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;
	
	@Transactional
	public void add(Employee employee) {
		employeeDao.add(employee);

	}

	@Transactional
	public void edit(Employee employee) {
		employeeDao.edit(employee);

	}

	@Transactional
	public void delete(int employee_no) {
		employeeDao.delete(employee_no);

	}

	@Transactional
	public Employee getEmployee(int employee_no) {
		return employeeDao.getEmployee(employee_no);
	}

	@Transactional
	public List getAllEmployee() {
		return employeeDao.getAllEmployee();
	}

}
