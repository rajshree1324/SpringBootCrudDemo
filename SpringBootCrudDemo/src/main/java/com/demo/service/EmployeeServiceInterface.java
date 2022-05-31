package com.demo.service;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeServiceInterface {

	public Employee saveEmployee(Employee employee);
	
	public List<Employee> getAllEmployee();
	
	public Employee updateEmpolyee(Employee employee);
	
	public void deleteEmployee(int empid);
}
