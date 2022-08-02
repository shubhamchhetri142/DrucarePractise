package com.drucare.app.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drucare.app.practice.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/EmployeeDetails")
	public Boolean insertOrUpdateInBatch(SqlParameterSource[] sqlParameterSource) {
		return employeeService.insertOrUpdateInBatch(sqlParameterSource);
				
	}
	
}
