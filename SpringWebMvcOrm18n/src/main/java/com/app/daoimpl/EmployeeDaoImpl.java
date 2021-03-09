package com.app.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.EmployeeDao;
import com.app.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private HibernateTemplate ht;
	
	@Override
	public int saveEmployee(Employee emp) {
		return (int) ht.save(emp);
	}

	@Override
	public void updateEmployee(Employee emp) {
		ht.update(emp);
	}

	@Override
	public void deleteEmployee(int empId) {
		ht.delete(new Employee(empId));
	}

	@Override
	public Employee getEmployeeById(int empId) {
		return ht.get(Employee.class, empId);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return ht.loadAll(Employee.class);
	}

}
