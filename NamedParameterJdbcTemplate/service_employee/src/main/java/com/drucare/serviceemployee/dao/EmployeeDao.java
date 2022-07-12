package com.drucare.serviceemployee.dao;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import com.drucare.serviceemployee.bean.EmployeeBean;
import com.drucare.serviceemployee.bean.InsertOrUpdateEmployeeReq;

@Repository
public interface EmployeeDao {

	public Boolean insertEmployeeDetails(InsertOrUpdateEmployeeReq insertOrUpdateEmployeeReq);
	public Boolean updateEmployeeDetails(InsertOrUpdateEmployeeReq insertOrUpdateEmployeeReq);
	
	public Long insertEmployee(EmployeeBean employeeBean);
	public Boolean updateEmployee(EmployeeBean employeeBean);
	public Boolean insertEmployeeDepartments(MapSqlParameterSource parameters);
	public Boolean insertemployeeDepartments(EmployeeBean employeeBean);
	public Boolean insertEmployeeDesignation(MapSqlParameterSource parameters);
//	public Boolean insertEmployeeDepartmentsXref(MapSqlParameterSource parameter);
	
	
	
}
