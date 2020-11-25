package com.gayatri.employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gayatri.employee.model.Employee;
import com.gayatri.employee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	
	@PostMapping("/employees")
	public void create(@RequestBody Employee employee ){
		employeeService.create(employee);
	}
	
	@PostMapping("/update/employees")
	public void update(@RequestBody Employee employee ){
		employeeService.create(employee);
	}
	
	@GetMapping( "/employees")
	public List<Employee> getAllEmployee(){
		return employeeService.getEmployees();
	}
	
	@GetMapping( "/employees/group/by/dept")
	public List<Object> getEmployeeCountGroupByDept(){
		return employeeService.getEmployeeCountGroupByDept();
	}
	
}
