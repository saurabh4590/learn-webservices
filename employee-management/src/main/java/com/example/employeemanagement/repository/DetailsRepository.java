package com.example.employeemanagement.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.employeemanagement.entity.Employee;

@Repository
@Transactional
public class DetailsRepository {

	@Autowired
	private EntityManager entityManager;

	public Employee getEmployee(int id) {
		return entityManager.find(Employee.class, id);
	}

	public Employee createEmployee(Employee employee) {
		entityManager.persist(employee);
		return employee;
	}

	public void deleteById(int id) {
		Employee employee = getEmployee(id);
		entityManager.remove(employee);
	}
}