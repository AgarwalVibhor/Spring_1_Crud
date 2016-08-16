package com.tcs.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tcs.business.EmployeeBusinessInterface;
import com.tcs.model.Employee;

@Controller
public class UpdateEmployee {
	
	@Autowired
	private EmployeeBusinessInterface business;
	
	@RequestMapping(value = "/updateStart.spring", method = RequestMethod.GET)
	public ModelAndView displayUpdateStart(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView model = new ModelAndView("updateStart");
		return model;
		
	}
	
	@RequestMapping(value = "/updateStart.spring", method = RequestMethod.POST)
	public ModelAndView executeUpdateStart(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value = "employeeId", required = true) Integer employeeId, 
			@RequestParam(value = "email", required = true) String email)
	{
		ModelAndView model = null;
		
		if((employeeId == null && email.equals("")) || (employeeId == null) || (email.equals("")))
		{
			/*
			 * 1. With Integer, the checking condition will be of null.
			 * 2. With String, the checking condition will be of empty string "".
			 */
			model = new ModelAndView("updateStart", "message", "Please enter the Employee Id and Email Id !!");
			return model;
		}
		else
		{
			Employee employee = business.validEmployee(employeeId, email);
			
			if(employee != null)
			{
				System.out.println("Employee found in controller");
				System.out.println(employee.getFname());
				System.out.println(employee.getEmployeeId());
				model = new ModelAndView("updateFound", "employeeForm", employee);
				return model;
			}
			else
			{
				System.out.println("Employee not found in controller");
				model = new ModelAndView("updateStart", "message", "Either employee id or email id is invalid !!");
				return model;
			}
		}
		
	}
	
	@RequestMapping(value = "/update.spring", method = RequestMethod.POST)
	public ModelAndView executeUpdate(@Valid @ModelAttribute("employeeForm") Employee employee,
			BindingResult result)
	{
		ModelAndView model = null;
		boolean update = false;
		if(result.hasErrors())
		{
			model = new ModelAndView("updateFound");
		}
		else
		{
			update = business.updateEmployee(employee);
			if(update == true)
			{
				model = new ModelAndView("updateSuccess", "employee", employee);
			}
			else
			{
				model = new ModelAndView("updateFailure", "employee", employee);
				model.addObject("message", "Please try again !!");
			}
		}
		return model;
	}

}
