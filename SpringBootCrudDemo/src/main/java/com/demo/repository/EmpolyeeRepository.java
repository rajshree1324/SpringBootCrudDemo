package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Employee;

@Repository
public interface EmpolyeeRepository extends JpaRepository<Employee, Integer>{

	// All methods here from JPA repository
	
}
