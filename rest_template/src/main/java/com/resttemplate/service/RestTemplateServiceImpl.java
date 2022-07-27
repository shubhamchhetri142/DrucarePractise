package com.resttemplate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.resttemplate.bean.EmpFetchFieldsReq;
import com.resttemplate.bean.Employee;

@Service
public class RestTemplateServiceImpl implements RestTemplateService{
	
	@Autowired
	RestTemplate restTemplate;

	@Override
	public Boolean insertEmployeeDetailsUsingMap(Employee insertEmployeeRequest) {
		return restTemplate.postForObject("http://localhost:9000/insertEmployeeDetailsReq",insertEmployeeRequest,Boolean.class);
	}

	@Override
	public Boolean updateEmployeeDetailsUsingSqlParameterSource(Employee updateEmployeeRequest) {
		restTemplate.put("http://localhost:9000/updateEmployeeDetailsByEmployeeIdMapSqlReq",updateEmployeeRequest);
		return true;
	}

	@Override
	public Employee fetchEmployeeNameByEmpIdUsingMap(EmpFetchFieldsReq empFetchFieldsReq) {
		return restTemplate.postForObject("http://localhost:9000/fetchEmployeeNameByEmpIdUsingMap",empFetchFieldsReq,Employee.class);
	}

	@Override
	public String fetchEmployeeNameByEmpIdUsingObject(EmpFetchFieldsReq empFetchFieldsReq) {
		return restTemplate.postForObject("http://localhost:9000/fetchEmployeeNameByEmpIdUsingObject",empFetchFieldsReq,String.class);
	}
}
