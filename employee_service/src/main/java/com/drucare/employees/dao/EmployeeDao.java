package com.drucare.employees.dao;

import org.springframework.stereotype.Repository;

import com.drucare.employees.bean.Employees;

@Repository
public interface EmployeeDao {
	public Boolean insertEmployeeDetails(Employees insertEmployeeReq);
	public Boolean insertEmployeeDetailsByUsingMapSql(Employees insertEmployeeMapSqlReq);
	public Boolean insertEmployeeDetailsByBeanProperty(Employees insertEmployeeBeanPropertyReq);
}
