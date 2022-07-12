package com.drucare.serviceemployee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.drucare.serviceemployee.bean.InsertEmployee;
import com.drucare.serviceemployee.bean.InsertOrUpdateEmployeeReq;
import com.drucare.serviceemployee.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/insertOrUpdate")
	public Boolean insertOrUpdateEmployeeReq(@RequestBody InsertOrUpdateEmployeeReq insertOrUpdateEmployeeReq) {
		return employeeService.insertOrUpdateEmployeeReq(insertOrUpdateEmployeeReq);
	}
	
	@PostMapping("/insertEmployeeList")
	public Boolean insertEmployeeList(@RequestBody InsertEmployee insertEmployee) {
		return employeeService.insertEmployeeList(insertEmployee);
	}
}
