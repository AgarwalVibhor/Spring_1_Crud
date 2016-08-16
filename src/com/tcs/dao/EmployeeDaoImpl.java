package com.tcs.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tcs.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDaoInterface {
	
	@Autowired
	private SessionFactory sf;
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeDaoImpl.class);

	@Override
	public int addEmployee(Employee employee) {
		
		Session session = sf.getCurrentSession();
		Transaction t = session.beginTransaction();
		int result = (Integer) session.save(employee);
		t.commit();
		logger.info("Employee saved successfully. Employee Details : " + employee);
		return result;
	}

	@Override
	public Employee validEmployee(int employeeId, String email) {
		
		Employee emp = null;
		
		Session session = sf.getCurrentSession();
		Transaction t = session.beginTransaction();
		String hql = "from Employee where employeeId = ? and email = ?";
		Query q = session.createQuery(hql);
		q.setInteger(0, employeeId);
		q.setString(1, email);
		emp = (Employee) q.uniqueResult();
		t.commit();
		if(emp == null)
		{
			System.out.println("Such employee does not exist.");
			return null;
		}
		else
		{
			System.out.println("An employee with employee id :" + employeeId + " exists.");
			return emp;
		}
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		
		Session session = sf.getCurrentSession();
		Transaction t = session.beginTransaction();
		String hql = "update Employee set fname=?, lname=?, dob=?, email=?, mobile=?," +
				"address=?, salary=?, password=? where employeeId=?";
		Query q = session.createQuery(hql);
		q.setString(0, employee.getFname());
		q.setString(1, employee.getLname());
		q.setDate(2, employee.getDob());
		q.setString(3, employee.getEmail());
		q.setString(4, employee.getMobile());
		q.setString(5, employee.getAddress());
		q.setDouble(6, employee.getSalary());
		q.setString(7, employee.getPassword());
		q.setInteger(8, employee.getEmployeeId());
		
		int affect = q.executeUpdate();
		t.commit();
		
		if(affect == 1)
		{
			System.out.println("Updation successful.");
			return true;
		}
		else
		{
			System.out.println("Employee not updated.");
			return false;
		}
		
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
		
		Session session = sf.getCurrentSession();
		Transaction t = session.beginTransaction();
		String hql = "delete Employee where employeeId = ?";
		Query q = session.createQuery(hql);
		q.setInteger(0, employeeId);
		
		int affect = q.executeUpdate();
		t.commit();
		
		if(affect == 1)
		{
			System.out.println("Deletion successful.");
			return true;
		}
		else
		{
			System.out.println("Deletion not successful.");
			return false;
		}
	}

	@Override
	public Employee checkId(int employeeId) {
		
		Session session = sf.getCurrentSession();
		Transaction t = session.beginTransaction();
		
		String hql = "from Employee where id = ?";
		Query q = session.createQuery(hql);
		q.setInteger(0, employeeId);
		
		Employee emp = (Employee) q.uniqueResult();
		t.commit();
		
		
		return emp;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployees() {
		
		Session session = sf.getCurrentSession();
		Transaction t = session.beginTransaction();
		String hql = "from Employee";
		Query q = session.createQuery(hql);
		List<Employee> employees = q.list();
		t.commit();
		return employees;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getEmployeesByFname(String fname) {
		
		Session session = sf.getCurrentSession();
		Transaction t = session.beginTransaction();
		String hql = "from Employee where fname = :fname";
		/*
		 * The positional parameters have been deprecated. Give the name of the variable with :fname
		 */
		Query q = session.createQuery(hql);
		q.setString("fname", fname);
		List<Employee> employees = q.list();
		t.commit();
		return employees;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getEmployeesByDob(Date dob) {
		
		Session session = sf.getCurrentSession();
		Transaction t = session.beginTransaction();
		String hql = "from Employee where dob = :dob";
		Query q = session.createQuery(hql);
		q.setDate("dob", dob);
		List<Employee> employees = q.list();
		t.commit();
		return employees;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getEmployeesBySalary(double salary) {
		
		Session session = sf.getCurrentSession();
		Transaction t = session.beginTransaction();
		String hql = "from Employee where salary = :salary";
		Query q = session.createQuery(hql);
		q.setDouble("salary", salary);
		List<Employee> employees = q.list();
		t.commit();
		return employees;
	}
	
	

}
