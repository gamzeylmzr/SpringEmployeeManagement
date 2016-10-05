package com.gamze.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;



@Entity
@Table(name="employees")
public class Employee {
	
	@Id
	@Column(name="employee_no")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int employee_no;
	@Column
	private String first_name;
	@Column
	private String last_name;
	@Column
	//@Value("${new java.text.SimpleDateFormat(\"yyyyMMdd\").parse(\"${PROP_DATE}\")}")
	private Date birth_date;
	@Column
	//@Value("${new java.text.SimpleDateFormat(\"yyyyMMdd\").parse(\"${PROP_DATE}\")}")
	private Date hire_date;
	@Column
	private String gender;
	
	public Employee(){}
	
	public Employee(int employee_no, String first_name, String last_name,
			Date birth_date, Date hire_date, String gender) {
		super();
		this.employee_no = employee_no;
		this.first_name = first_name;
		this.last_name = last_name;
		this.birth_date = birth_date;
		this.hire_date = hire_date;
		this.gender = gender;
	}

	public int getEmployee_no() {
		return employee_no;
	}

	public void setEmployee_no(int employee_no) {
		this.employee_no = employee_no;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}

	public Date getHire_date() {
		return hire_date;
	}

	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
}
 