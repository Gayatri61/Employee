package com.gayatri.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gayatri.employee.model.Employee;

public interface EmployeeService {

	public List<Employee> getEmployees();

	public void create(Employee employee);

	public List<Object> getEmployeeCountGroupByDept();
	
}
