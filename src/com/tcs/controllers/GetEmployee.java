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
public class GetEmployee {
	
	@Autowired
	private EmployeeBusinessInterface business;
	
	@RequestMapping(value = "/listSingleStart.spring", method = RequestMethod.GET)
	public ModelAndView displayListSingleStart(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView model = new ModelAndView("listSingleStart");
		/*
		 * Note "listSingleStart" is the name of the JSP page and it has nothing to do with 
		 * the URL "/listSingleStart"
		 */
		return  model;
	}
	
	@RequestMapping(value = "/listSingleStart.spring", method = RequestMethod.POST)
	public ModelAndView executeListSingleStart(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value = "employeeId", required = true) Integer employeeId)
	/*
	 * Integer request parameter should always be stored in Integer(as an object) and not in int(as a simple type)
	 */
	{
		ModelAndView model = null;
		
		if(employeeId == null)
		{
			model = new ModelAndView("listSingleStart", "message", "Please enter an Employee Id !");
			return model;
		}
		else
		{
			Employee employee = business.checkId(employeeId); //Integer is equivalent to int here
			
			if(employee != null)
			{
				model = new ModelAndView("listSingle", "employee", employee);
				return  model;
			}
			else
			{
				model = new ModelAndView("listSingleStart", "message", "No emplyee was found in the database with" +
						"Employee Id : " + employeeId);
				return model;
			}
		}
		
	}

}
