package com.drucare.serviceemployee.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.drucare.serviceemployee.bean.EmpFetchFieldsReq;
import com.drucare.serviceemployee.bean.FetchEmployeeDto;

@Repository
public interface EmployeeDao {

	public String fetchEmployeeNameByEmpIdUsingObject(EmpFetchFieldsReq fetchEmployeeRequest);

	public FetchEmployeeDto fetchEmployeeNameByEmpIdUsingMap(EmpFetchFieldsReq fetchEmployeeRequest);

	public List<FetchEmployeeDto> fetchAllEmployeesUsingList(EmpFetchFieldsReq fetchEmployeeRequest);

	public List<FetchEmployeeDto> fetchAllEmployeeDetails(EmpFetchFieldsReq fetchEmployeeRequest);

	public List<FetchEmployeeDto> fetchEmployeeDetails(EmpFetchFieldsReq fetchEmployeeRequest);
}
