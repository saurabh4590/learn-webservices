package com.example.employeemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeemanagement.entity.Employee;
import com.example.employeemanagement.service.DetailsService;

@RestController
public class EmployeeDetailsController {

	@Autowired
	private DetailsService detailsService;

	@GetMapping("/details/{id}")
	public ResponseEntity<Employee> getAllEmployees(@PathVariable("id") int id) {
		Employee employee = detailsService.getEmployeeByid(id);
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}
}
