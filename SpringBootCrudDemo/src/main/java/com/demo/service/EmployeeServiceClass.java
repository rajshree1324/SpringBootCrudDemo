package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Employee;
import com.demo.repository.EmpolyeeRepository;

@Service
public class EmployeeServiceClass implements EmployeeServiceInterface{

	@Autowired
	EmpolyeeRepository empolyeeRepository;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		
		empolyeeRepository.save(employee);
		
		return null;
	}
 
	@Override
	public List<Employee> getAllEmployee() {
		
		return empolyeeRepository.findAll();
	}

	@Override
	public Employee updateEmpolyee(Employee employee) {
		
		return empolyeeRepository.saveAndFlush(employee);
	}

	@Override
	public void deleteEmployee(int empid) {
		
		empolyeeRepository.deleteById(empid);
	}

}
