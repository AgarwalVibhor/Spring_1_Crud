package com.tcs.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

/*
 * Entity bean with JPA annotations.
 * Hibernate provides JPA implementation
 */
@Entity
@Table(name = "employee_table")
public class Employee {
	
	
	@Id
	@Column(name = "employee_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// Only MySql is having support for Identity
	private int employeeId;
	
	@Column(name = "first_name")
	@NotEmpty(message = "Please enter your first name !")
	private String fname;
	
	@Column(name = "last_name")
	@NotEmpty(message = "Please enter your last name !")
	private String lname;
	
	@Column(name = "date_of_birth")
	@NotNull(message = "Please enter your date of birth !")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	@Past(message = "Your date of birth cannot be a future date !")
	private Date dob;
	
	@Column(name = "email")
	@NotEmpty(message = "Please enter your email !")
	@Email(message = "Please enter a valid email !")
	private String email;
	
	@NotEmpty(message = "Please enter your mobile number !")
	@Size(min = 10, max = 10, message = "Mobile number should have exactly 10 digits !")
	@Pattern(regexp  = "[7-9][0-9]{9}", message = "Mobile number starting digit should be either 7, 8 or 9")
	private String mobile;
	
	@NotEmpty(message = "Please enter an address !")
	@Size(min = 10, max = 100, message = "Address can have only between 10 and 100 characters !")
	private String address;
	
	@NotNull(message = "Please enter your salary !")
	@NumberFormat(style = org.springframework.format.annotation.NumberFormat.Style.CURRENCY)
	@Max(value = 40000, message = "Salary cannot be more than 40000")
	private double salary;
	
	@NotEmpty(message = "Please enter a password !")
	@Size(min = 6, max = 15, message = "Password must be between 6 and 15 characters !")
	private String password;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", fname=" + fname
				+ ", lname=" + lname + ", dob=" + dob + ", email=" + email
				+ ", mobile=" + mobile + ", address=" + address + ", salary="
				+ salary + ", password=" + password + "]";
	}
	
	

}
