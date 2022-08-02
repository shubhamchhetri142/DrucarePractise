package com.drucare.app.practice.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.drucare.app.practice.bean.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public Long insertEmployeeDetails(Employee employeeObj) {
		String queryForInsertEmployee = "INSERT INTO employees.employees_info_ref(emp_id,first_nm,middle_nm,last_nm,gender,mobile_no,alter_mobile_no,salary,email_id,emp_code,address_line1,address_line2,state_nm,city_nm,country_nm,pin_code,qualification,experience,blood_group,is_active) values(:empId,:firstNm,:middleNm,:lastNm,:gender,:mobileNo,:alterMobileNo,:salary,:emailId,:empCode,:addressLine1,:addressLine2,:stateNm,:cityNm,:countryNm,:pinCode,:qualification,:experience,:bloodGroup,:isActive)";
		long empId=0;
		try {

			KeyHolder holder = new GeneratedKeyHolder();

			namedParameterJdbcTemplate.update(queryForInsertEmployee, new BeanPropertySqlParameterSource(employeeObj),
					holder, new String[] { "emp_id" });

			empId = holder.getKey().longValue();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return empId;
	}

	@Override
	public Boolean updateEmployeeDetails(Employee employeeObj) {
		boolean result=false;
		String queryForUpdateEmployee = "UPDATE employees.employees_info_ref SET first_nm=:firstNm,middle_nm=:middleNm,last_nm=:lastNm,mobile_no=:mobileNo,email_id=:emailId,address_line1=:addressLine1,address_line2=:addressLine2 WHERE emp_id=:empId and is_active=true";
		try {
			namedParameterJdbcTemplate.update(queryForUpdateEmployee,
					new BeanPropertySqlParameterSource(employeeObj));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Boolean insertEmployeeDepartments(SqlParameterSource[] sqlParameterSource) {
		boolean result=false;
		String queryForInsertEmployeeDepartments="Insert into department_ref(dept_id,dept_nm,isactive) values (:deptId,:deptNm,:isactive)";
		
		try {
			KeyHolder holder = new GeneratedKeyHolder();
			namedParameterJdbcTemplate.update(queryForInsertEmployeeDepartments,
					new BeanPropertySqlParameterSource(sqlParameterSource));
			holder.getKey().longValue();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Boolean insertEmployeeDesignation(SqlParameterSource[] sqlParameterSource) {
		boolean result=false;
		String queryForInsertEmployeeDesignation="Insert into designation_ref(designation_id,designation_nm,isactive) values (:designationId,:designationNm,:isactive)";
		try {
			KeyHolder holder = new GeneratedKeyHolder();
			namedParameterJdbcTemplate.update(queryForInsertEmployeeDesignation,
					new BeanPropertySqlParameterSource(sqlParameterSource));
			holder.getKey().longValue();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;	
	}

	
}
