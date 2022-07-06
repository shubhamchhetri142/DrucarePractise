package com.drucare.employees.service;

import org.springframework.stereotype.Service;

import com.drucare.employees.bean.Employees;

@Service
public interface EmployeeService {
	public Boolean insertEmployeeDetails(Employees insertEmployeeReq);
	public Boolean insertEmployeeDetailsByUsingMapSql(Employees insertEmployeeMapSqlReq);
	public Boolean insertEmployeeDetailsByBeanProperty(Employees insertEmployeeBeanPropertyReq);
}
