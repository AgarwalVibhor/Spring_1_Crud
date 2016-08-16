package com.tcs.business;

import java.util.Date;
import java.util.List;

import com.tcs.model.Employee;

public interface EmployeeBusinessInterface {
	
	public int addEmployee(Employee employee);
	
	public Employee validEmployee(int employeeId, String email);
	
	public boolean updateEmployee(Employee employee);
	
	public boolean deleteEmployee(int employeeId);
	
	public Employee checkId(int employeeId);
	
	public List<Employee> getAllEmployees();
	
	public List<Employee> getEmployeesByFname(String fname);
	
	public List<Employee> getEmployeesByDob(Date dob);
	
	public List<Employee> getEmployeesBySalary(double salary);

}
