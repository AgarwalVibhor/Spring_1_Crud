package com.tcs.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tcs.business.EmployeeBusinessInterface;
import com.tcs.model.Employee;

@Controller
public class GetAllEmployees {
	
	@Autowired
	private EmployeeBusinessInterface business;
	
	@RequestMapping(value = "/listAll.spring", method = RequestMethod.GET)
	public ModelAndView displayListAllStart(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView model = new ModelAndView("listAllStart");
		return model;
	}
	
	@RequestMapping(value = "/listAll.spring", method = RequestMethod.POST)
	public ModelAndView executeListAllStart(HttpServletRequest request, HttpServletResponse response)
	{
		List<Employee> employees = business.getAllEmployees();
		ModelAndView model = null;
		
		if(employees.size() > 0)
		{
			System.out.println("We got all employees.");
			model = new ModelAndView("listAll", "employees", employees);
			return model;
		}
		else
		{
			model = new ModelAndView("listAllStart", "message", "Something went wrong. Please try again !!");
			return model;
		}

	}

}
