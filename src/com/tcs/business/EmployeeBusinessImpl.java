package com.tcs.business;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.dao.EmployeeDaoInterface;
import com.tcs.model.Employee;

@Service
public class EmployeeBusinessImpl implements EmployeeBusinessInterface {
	
	@Autowired
	private EmployeeDaoInterface dao;

	@Override
	public int addEmployee(Employee employee) {
		
		return dao.addEmployee(employee);
	}

	@Override
	public Employee validEmployee(int employeeId, String email) {
		
		return dao.validEmployee(employeeId, email);
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		
		return dao.updateEmployee(employee);
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
		
		return dao.deleteEmployee(employeeId);
	}

	@Override
	public Employee checkId(int employeeId) {
		
		return dao.checkId(employeeId);
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return dao.getAllEmployees();
	}

	@Override
	public List<Employee> getEmployeesByFname(String fname) {
		
		return dao.getEmployeesByFname(fname);
	}

	@Override
	public List<Employee> getEmployeesByDob(Date dob) {
		
		return dao.getEmployeesByDob(dob);
	}

	@Override
	public List<Employee> getEmployeesBySalary(double salary) {
		
		return dao.getEmployeesBySalary(salary);
	}

}
