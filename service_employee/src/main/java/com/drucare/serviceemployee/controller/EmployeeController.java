package com.drucare.serviceemployee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.drucare.serviceemployee.bean.EmpFetchFieldsReq;
import com.drucare.serviceemployee.bean.FetchEmployeeDto;
import com.drucare.serviceemployee.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/fetchEmployeeNameByEmpIdUsingObject")
	String fetchEmployeeNameByEmpIdUsingObject(@RequestBody EmpFetchFieldsReq fetchEmployeeRequest) {
		return employeeService.fetchEmployeeNameByEmpIdUsingObject(fetchEmployeeRequest);
	}

	@GetMapping("/fetchEmployeeNameByEmpIdUsingMap")
	public FetchEmployeeDto fetchEmployeeNameByEmpIdUsingMap(@RequestBody EmpFetchFieldsReq fetchEmployeeRequest) {
		return employeeService.fetchEmployeeNameByEmpIdUsingMap(fetchEmployeeRequest);
	}

	@GetMapping("/fetchAllEmployeesUsingList")
	public List<FetchEmployeeDto> fetchAllEmployeesUsingList(@RequestBody EmpFetchFieldsReq fetchEmployeeRequest) {
		return employeeService.fetchAllEmployeesUsingList(fetchEmployeeRequest);
	}

	@GetMapping("/fetchAllEmployeeDetails")
	public List<FetchEmployeeDto> fetchAllEmployeeDetails(@RequestBody EmpFetchFieldsReq fetchEmployeeRequest) {
		return employeeService.fetchAllEmployeeDetails(fetchEmployeeRequest);
	}
	
	@GetMapping("/fetchEmployeeDetails")
	public List<FetchEmployeeDto> fetchEmployeeDetails(@RequestBody EmpFetchFieldsReq fetchEmployeeRequest){
		return employeeService.fetchEmployeeDetails(fetchEmployeeRequest);
	}
	
}
