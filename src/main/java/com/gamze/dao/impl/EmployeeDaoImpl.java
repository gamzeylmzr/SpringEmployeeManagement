package com.gamze.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gamze.dao.EmployeeDao;
import com.gamze.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(Employee employee) {
		session.getCurrentSession().save(employee);

	}

	@Override
	public void edit(Employee employee) {
		session.getCurrentSession().update(employee);

	}

	@Override
	public void delete(int employee_no) {
		session.getCurrentSession().delete(getEmployee(employee_no));

	}

	@Override
	public Employee getEmployee(int employee_no) {
		return (Employee)session.getCurrentSession().get(Employee.class, employee_no);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List getAllEmployee() {
		
		return session.getCurrentSession().createQuery("from Employee").list();
	}

}
