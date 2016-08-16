package com.tcs.controllers;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tcs.business.EmployeeBusinessInterface;
import com.tcs.model.Employee;

@Controller
public class SearchEmployees {
	
	@Autowired
	private EmployeeBusinessInterface business;
	
	@RequestMapping(value = "/fname.spring", method = RequestMethod.GET)
	public ModelAndView displaySearchFnameStart(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView model = new ModelAndView("searchFnameStart");
		return model;
	}
	
	@RequestMapping(value = "/fname.spring", method = RequestMethod.POST)
	public ModelAndView executeSearchFnameStart(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(required = true) String fname)
	{	
		ModelAndView model = null;
		
		if(fname.equals(""))
		{
			/*
			 * When no string value is given, it is taken to be empty string ""
			 */
			model = new ModelAndView("searchFnameStart", "message", "Please enter the first name !");
			return model;
		}
		else
		{
			List<Employee> employees = business.getEmployeesByFname(fname);
			
			if(employees.size() > 0)
			{
				model = new ModelAndView("searchFname", "employees", employees);
				return model;
			}
			else
			{
				model = new ModelAndView("searchFnameStart", "message", "No employees found in the database with first name : " + fname);
				return model;
			}
		}
	}
	
	@RequestMapping(value = "/dob.spring", method = RequestMethod.GET)
	public ModelAndView displaySearchDobStart(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView model = new ModelAndView("searchDobStart");
		return model;
	}
	
	@RequestMapping(value = "/dob.spring", method = RequestMethod.POST)
	public ModelAndView executeSearchDobStart(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value = "dob", required = true) String dob)
	{
		/*
		 * It is always better to get the String date from the user and then parse it to the UTIL Date
		 * using SimpleDateFormat class.
		 */
		ModelAndView model = null;
		
		if(dob.equals(""))
		{
			/*
			 * Since dob is string, checking will be in the form of an empty string.
			 */
			model = new ModelAndView("searchDobStart", "message", "Please enter date of birth !");
			return model;
		}
		else
		{
			DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			Date date = null;
			try {
				date = format.parse(dob);
			} catch (ParseException e) {
				System.out.println("Some error occured in parsing the date.");
			}
			
			List<Employee> employees = business.getEmployeesByDob(date);
			
			if(employees.size() > 0)
			{
				model = new ModelAndView("searchDob", "employees", employees);
				return model;
			}
			else
			{
				model = new ModelAndView("searchDobStart", "message", "No emplyee exists in the database with" +
						"date of birth : " + dob + " . The format of the date should be DD/MM/YYYY");
				return model;
			}
		}
	}
	
	@RequestMapping(value = "/salary.spring", method = RequestMethod.GET)
	public ModelAndView displaySearchSalaryStart(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView model = new ModelAndView("searchSalaryStart");
		return model;
	}
	
	@RequestMapping(value = "/salary.spring", method = RequestMethod.POST)
	public ModelAndView executeSearchSalaryStart(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(required = true) Double salary)
	{
		ModelAndView model = null;
		
		if(salary == null)
		{
			model = new ModelAndView("searchSalaryStart", "message", "Please enter salary amount !");
			return model;
		}
		else
		{
			List<Employee> employees = business.getEmployeesBySalary(salary);
			
			if(employees.size() > 0)
			{
				model = new ModelAndView("searchSalary", "employees", employees);
				return model;
			}
			else
			{
				model = new ModelAndView("searchSalaryStart", "message", "No employees are present in the database" +
						"with salary amount : " + salary);
				return model;
			}
		}
	}

}
