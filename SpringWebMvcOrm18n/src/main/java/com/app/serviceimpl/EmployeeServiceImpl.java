package com.app.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.EmployeeDao;
import com.app.model.Employee;
import com.app.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao dao;

	@Override 
	@Transactional
	public int saveEmployee(Employee emp) {
		return dao.saveEmployee(emp);
	}

	@Override
	@Transactional
	public void updateEmployee(Employee emp) {
		dao.updateEmployee(emp);
	}

	@Override
	@Transactional
	public void deleteEmployee(int empId) {
		dao.deleteEmployee(empId);
	}

	@Override
	@Transactional
	public Employee getEmployeeById(int empId) {
		return dao.getEmployeeById(empId);
	}

	@Override
	@Transactional
	public List<Employee> getAllEmployees() {
		return dao.getAllEmployees();
	}

}
