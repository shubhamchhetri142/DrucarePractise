package com.drucare.employees.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.drucare.employees.bean.Employees;
import com.drucare.employees.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("/insertEmployee")
	public Boolean insertEmployeeDetails(@RequestBody Employees insertEmployeeReq) {
		return employeeService.insertEmployeeDetails(insertEmployeeReq);
	}

	@PostMapping("/insertEmployeeDetails")
	public Boolean insertEmployeeDetailsByUsingMapSql(@RequestBody Employees insertEmployeeMapSqlReq) {
		return employeeService.insertEmployeeDetailsByUsingMapSql(insertEmployeeMapSqlReq);
	}

	@PostMapping("/insertEmployeeDetailsBeanProperty")
	public Boolean insertEmployeeDetailsByBeanProperty(@RequestBody Employees insertEmployeeBeanPropertyReq) {
		return employeeService.insertEmployeeDetailsByBeanProperty(insertEmployeeBeanPropertyReq);
	}
}
