package com.turing.employeeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turing.employeeservice.entity.Employee;
import com.turing.employeeservice.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
@Autowired	
private EmployeeServiceImpl service;

@PostMapping("/save")	
public Employee create(@RequestBody Employee employee) {
	 return service.save(employee);
}
//@GetMapping("/get")
//@PostMapping("/get")
//@DeleteMapping("/get")
//@PutMapping("/get")
@PatchMapping("/get")
public List<Employee> getAll(){
	return service.findByAll();
  } 

}
