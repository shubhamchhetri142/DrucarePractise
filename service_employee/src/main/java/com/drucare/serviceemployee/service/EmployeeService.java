package com.drucare.serviceemployee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.drucare.serviceemployee.bean.EmpFetchFieldsReq;
import com.drucare.serviceemployee.bean.Employee;
import com.drucare.serviceemployee.bean.FetchEmployeeDto;

@Service
public interface EmployeeService {

//	public Boolean insertOrUpdateEmployeeReq(InsertOrUpdateEmployeeReq insertOrUpdateEmployeeReq);

//	public Boolean insertEmployeeList(InsertEmployeeReq insertEmployeeReq);
	
	Boolean insertEmployeeInBatch(Employee insertEmployeeRequest);
	
	String fetchEmployeeNameByEmpIdUsingObject(EmpFetchFieldsReq fetchEmployeeRequest);
	FetchEmployeeDto fetchEmployeeNameByEmpIdUsingMap(EmpFetchFieldsReq fetchEmployeeRequest);
	List<FetchEmployeeDto> fetchAllEmployeesUsingList(EmpFetchFieldsReq fetchEmployeeRequest);
	List<FetchEmployeeDto> fetchAllEmployeeDetails(EmpFetchFieldsReq fetchEmployeeRequest);
	
}
