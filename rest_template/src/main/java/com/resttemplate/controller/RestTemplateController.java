package com.resttemplate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.resttemplate.bean.EmpFetchFieldsReq;
import com.resttemplate.bean.Employee;
import com.resttemplate.service.RestTemplateService;

@RestController
public class RestTemplateController {
	@Autowired
	RestTemplateService restTemplateService;
	
	@PostMapping("/insertEmployeeDetailsUsingMap")
	Boolean insertEmployeeDetailsUsingMap(@RequestBody Employee insertEmployeeRequest) {
		return restTemplateService.insertEmployeeDetailsUsingMap(insertEmployeeRequest);
	}
	
	@PutMapping("/updateEmployeeDetailsUsingSqlParameterSource")
	public Boolean updateEmployeeDetailsUsingSqlParameterSource(@RequestBody Employee updateEmployeeRequest) {
		return restTemplateService.updateEmployeeDetailsUsingSqlParameterSource(updateEmployeeRequest);
	}

	@PostMapping("/fetchEmployeeNameByEmpIdUsingMap")
	public Employee fetchEmployeeNameByEmpIdUsingMap(@RequestBody EmpFetchFieldsReq empFetchFieldsReq) {
		return restTemplateService.fetchEmployeeNameByEmpIdUsingMap(empFetchFieldsReq);
	}

	@PostMapping("/fetchEmployeeNameByEmpIdObject")
	public String fetchEmployeeNameByEmpIdUsingObject(@RequestBody EmpFetchFieldsReq empFetchFieldsReq) {
		return restTemplateService.fetchEmployeeNameByEmpIdUsingObject(empFetchFieldsReq);
	}
}
