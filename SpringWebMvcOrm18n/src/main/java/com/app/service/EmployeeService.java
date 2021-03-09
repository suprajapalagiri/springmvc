package com.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.model.Employee;

@Service
public interface EmployeeService {
	
	public int saveEmployee(Employee emp);
	public void updateEmployee(Employee emp);
	public void deleteEmployee(int empId);
	public Employee getEmployeeById(int empId);
	public List<Employee> getAllEmployees();
}
