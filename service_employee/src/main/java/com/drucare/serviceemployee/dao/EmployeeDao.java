package com.drucare.serviceemployee.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.drucare.serviceemployee.bean.EmpFetchFieldsReq;
import com.drucare.serviceemployee.bean.Employee;
import com.drucare.serviceemployee.bean.FetchEmployeeDto;

@Repository
public interface EmployeeDao {

	//	public Boolean insertEmployeeDetails(InsertOrUpdateEmployeeReq insertOrUpdateEmployeeReq);
	//	public Boolean updateEmployeeDetails(InsertOrUpdateEmployeeReq insertOrUpdateEmployeeReq);
	//	
	//	public Long insertEmployee(EmployeeBean employeeBean);
	//	public Boolean updateEmployee(EmployeeBean employeeBean);
	//	
	//	public Boolean insertEmployeeDepartments(MapSqlParameterSource parametrs);
	//	public Boolean insertEmployeeDesignation(MapSqlParameterSource parametrs);

	public Boolean insertEmployeeInBatch(Employee insertEmployeeRequest);

	public String fetchEmployeeNameByEmpIdUsingObject(EmpFetchFieldsReq fetchEmployeeRequest);
	public FetchEmployeeDto fetchEmployeeNameByEmpIdUsingMap(EmpFetchFieldsReq fetchEmployeeRequest);
	public List<FetchEmployeeDto> fetchAllEmployeesUsingList(EmpFetchFieldsReq fetchEmployeeRequest);
	public List<FetchEmployeeDto> fetchAllEmployeeDetails(EmpFetchFieldsReq fetchEmployeeRequest);

	//	public Boolean insertEmployeeDepartments(EmployeeBean employeeBean);
	//	public Boolean insertEmployeeDesignation(EmployeeBean employeeBean);
}
