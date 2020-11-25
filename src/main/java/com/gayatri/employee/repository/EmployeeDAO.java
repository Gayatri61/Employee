package com.gayatri.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gayatri.employee.model.Employee;

@Repository
public interface EmployeeDAO extends JpaRepository<Employee, Integer>{
	
	@Query("SELECT e.dept, COUNT(e) FROM Employee e GROUP BY dept")
	List<Object> getEmployeeCountGroupByDept();
	
	

}
