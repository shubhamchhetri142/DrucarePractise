package com.drucare.serviceemployee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.drucare.serviceemployee.bean.EmpFetchFieldsReq;
import com.drucare.serviceemployee.bean.FetchEmployeeDto;

@Service
public interface EmployeeService {

	String fetchEmployeeNameByEmpIdUsingObject(EmpFetchFieldsReq fetchEmployeeRequest);

	FetchEmployeeDto fetchEmployeeNameByEmpIdUsingMap(EmpFetchFieldsReq fetchEmployeeRequest);

	List<FetchEmployeeDto> fetchAllEmployeesUsingList(EmpFetchFieldsReq fetchEmployeeRequest);

	List<FetchEmployeeDto> fetchAllEmployeeDetails(EmpFetchFieldsReq fetchEmployeeRequest);

	List<FetchEmployeeDto> fetchEmployeeDetails(EmpFetchFieldsReq fetchEmployeeRequest);
}
