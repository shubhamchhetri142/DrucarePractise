package com.drucare.app.practice.dao;

import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.drucare.app.practice.bean.Employee;

@Repository
public interface EmployeeDao {

	Long insertEmployeeDetails(Employee employeeObj);

	Boolean updateEmployeeDetails(Employee employeeObj);

	Boolean insertEmployeeDepartments(SqlParameterSource[] sqlParameterSource);

	Boolean insertEmployeeDesignation(SqlParameterSource[] sqlParameterSource);


}
