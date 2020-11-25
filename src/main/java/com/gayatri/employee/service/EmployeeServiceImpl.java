package com.gayatri.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gayatri.employee.model.Employee;
import com.gayatri.employee.repository.EmployeeDAO;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Override
	public List<Employee> getEmployees(){
		return employeeDAO.findAll();
	}

	@Override
	public void create(Employee employee) {
		employeeDAO.save(employee);
	}

	@Override
	public List<Object> getEmployeeCountGroupByDept() {
		return employeeDAO.getEmployeeCountGroupByDept();
	}
	
}
