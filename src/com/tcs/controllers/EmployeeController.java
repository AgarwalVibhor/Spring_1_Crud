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
import org.springframework.web.servlet.ModelAndView;

import com.tcs.business.EmployeeBusinessInterface;
import com.tcs.model.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeBusinessInterface business;
	
	@RequestMapping(value = "/create.spring", method = RequestMethod.GET)
	public ModelAndView displayCreateEmployee(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView model = new ModelAndView("createEmployee");
		Employee employee = new Employee();
		model.addObject("employeeForm", employee);
		return model;
	}
	
	@RequestMapping(value = "/create.spring", method = RequestMethod.POST)
	public ModelAndView executeCreateEmployee(HttpServletRequest request, HttpServletResponse response,
			@Valid @ModelAttribute("employeeForm") Employee employee, BindingResult result)
	{
		ModelAndView model = null;
		int addResult = 0;
		if(result.hasErrors())
		{
			model = new ModelAndView("createEmployee");
		}
		else
		{
			addResult = business.addEmployee(employee);
			if(addResult > 0)
			{
				System.out.println("Inside if...");
				model = new ModelAndView("createSuccess", "employeeId", employee.getEmployeeId());
			}
			else
			{
				System.out.println("Inside else...");
				model = new ModelAndView("createEmployee");
				model.addObject("employeeForm", employee);
			}
		}
		return  model;
	}

}
