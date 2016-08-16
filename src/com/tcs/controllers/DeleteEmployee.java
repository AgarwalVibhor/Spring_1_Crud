package com.tcs.controllers;

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
public class DeleteEmployee {
	
	@Autowired
	private EmployeeBusinessInterface business;
	
	@RequestMapping(value = "/deleteStart.spring", method = RequestMethod.GET)
	public ModelAndView displayDeleteStart(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView model = new ModelAndView("deleteStart");
		return  model;
	}
	
	@RequestMapping(value = "/deleteStart.spring", method = RequestMethod.POST)
	public ModelAndView executeDeleteStart(HttpServletRequest request, HttpServletResponse response, 
			@RequestParam(required = true) Integer employeeId,
			@RequestParam(required = true) String email)
	{
		ModelAndView model = null;
		
		if((employeeId == null && email.equals("")) || (employeeId == null) || email.equals(""))
		{
			model = new ModelAndView("deleteStart", "message", "Please enter Employee Id and Email Id !!");
			return model;
		}
		else
		{

			Employee employee = business.validEmployee(employeeId, email);
			
			if(employee != null)
			{
				System.out.println("Employee does exist.");
				model = new ModelAndView("deleteConfirm", "employeeId", employeeId);
				return model;
			}
			else
			{
				String message = "Either Employee Id or Email Id is invalid !! Please Try Again !";
				model = new ModelAndView("deleteStart", "message", message);
				return model;
			}
		}
	}
	
	@RequestMapping(value = "/delete.spring", method = RequestMethod.POST)
	public ModelAndView executeDeleteConfirm(HttpServletRequest request, HttpServletResponse response,
			@RequestParam int employeeId)
	{
		boolean result = business.deleteEmployee(employeeId);
		ModelAndView model = null;
		if(result == true)
		{
			model = new ModelAndView("deleteSuccess", "employeeId", employeeId);
			return model;
		}
		else
		{
			model = new ModelAndView("deleteStart", "message", "Something went wrong. Please try again !!");
			return model;
		}
	}

}
