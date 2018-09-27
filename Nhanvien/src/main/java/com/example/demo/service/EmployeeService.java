package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Employee;

public interface EmployeeService {
	
	List<Employee> search(String q);
	
	void save(Employee contact);
	
	void delete(int id);

	Iterable<Employee> findAll();

	Optional<Employee> findOne(int id);

	
}
