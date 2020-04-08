package com.example.employeemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.employeemanagement.entity.Employee;
import com.example.employeemanagement.repository.DetailsRepository;

@Component
public class DetailsServiceImpl implements DetailsService {

	@Autowired
	private DetailsRepository detailsRepository;

	@Override
	public List<Employee> getAllEmployees() {
		return null;
	}

	@Override
	public Employee getEmployeeByid(int id) {
		return detailsRepository.getEmployee(id);
	}

	@Override
	public Employee createEmployee(Employee employee) {
		return detailsRepository.createEmployee(employee);
	}

	@Override
	public void deleteById(int id) {
		detailsRepository.deleteById(id);
	}
}
