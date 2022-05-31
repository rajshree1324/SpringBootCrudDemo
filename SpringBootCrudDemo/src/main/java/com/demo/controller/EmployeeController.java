package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;
import com.demo.service.EmployeeServiceInterface;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeServiceInterface employeeServiceInterface;

	@PostMapping("employee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		
		return employeeServiceInterface.saveEmployee(employee);
	}
	
	@GetMapping(value="employee")
	public List<Employee> getAllEmployee(){
		return employeeServiceInterface.getAllEmployee();
	}
	
	@PutMapping("employee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		
		return employeeServiceInterface.updateEmpolyee(employee);
	}
	
	@DeleteMapping("employee/{empid}")
	public void deleteEmployee(@PathVariable int empid) {
		employeeServiceInterface.deleteEmployee(empid);
	}

}
