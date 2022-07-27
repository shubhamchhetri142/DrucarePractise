package com.resttemplate.service;

import com.resttemplate.bean.EmpFetchFieldsReq;
import com.resttemplate.bean.Employee;

public interface RestTemplateService {

	Boolean insertEmployeeDetailsUsingMap(Employee insertEmployeeRequest);

	Boolean updateEmployeeDetailsUsingSqlParameterSource(Employee updateEmployeeRequest);

	Employee fetchEmployeeNameByEmpIdUsingMap(EmpFetchFieldsReq empFetchFieldsReq);

	String fetchEmployeeNameByEmpIdUsingObject(EmpFetchFieldsReq empFetchFieldsReq);

}
