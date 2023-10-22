package com.turing.employeeservice.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.turing.employeeservice.entity.Employee;

public interface EmployeeRepository extends JpaRepositoryImplementation<Employee, Integer> {
//Employee updateEmployeeById(Integer id, Employee employee);
}
