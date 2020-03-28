package com.example.employeemanagement.service;

import java.util.List;

import com.example.employeemanagement.entity.Employee;

public interface DetailsService {
	List<Employee> getAllEmployees();

	Employee getEmployeeByid(int id);

	Employee createEmployee(Employee employee);
}
