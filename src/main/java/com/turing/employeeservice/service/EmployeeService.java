package com.turing.employeeservice.service;

import java.util.List;

import com.turing.employeeservice.entity.Employee;

public interface EmployeeService {
Employee save(Employee employee);
List<Employee> findByAll();
//Employee updateEmployeeById(Integer id, Employee employee);
}
