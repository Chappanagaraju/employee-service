package com.turing.employeeservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.turing.employeeservice.entity.Employee;
import com.turing.employeeservice.repository.EmployeeRepository;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;

	@Override
	public Employee save(Employee employee) {
		return repository.save(employee);
	}

	@Override
	public List<Employee> findByAll() {
		// TODO Auto-generated method stub
		return (List<Employee>) repository.findAll();
	}

	}


