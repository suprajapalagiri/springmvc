package com.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.app.model.Employee;

@Repository
public interface EmployeeDao {
	public int saveEmployee(Employee emp);
	public void updateEmployee(Employee emp);
	public void deleteEmployee(int empId);
	public Employee getEmployeeById(int empId);
	public List<Employee> getAllEmployees();
}
