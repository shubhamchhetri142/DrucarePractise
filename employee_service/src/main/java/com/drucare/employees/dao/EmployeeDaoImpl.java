package com.drucare.employees.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.drucare.employees.bean.Employees;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public Boolean insertEmployeeDetails(Employees insertEmployeeReq) {
		boolean result = false;
		String queryInsertEmployeeDetails = "INSERT INTO employees.employees_info_ref(first_nm,middle_nm,last_nm,gender,mobile_no,alter_mobile_no,salary,email_id,emp_code,address_line1,address_line2,state_nm,city_nm,country_nm,pin_code,qualification,experience,blood_group,is_active) values(:firstNm,:middleNm,:lastNm,:gender,:mobileNo,:alterMobileNo,:salary,:emailId,:empCode,:addressLine1,:addressLine2,:stateNm,:cityNm,:countryNm,:pinCode,:qualification,:experience,:bloodGroup,:isActive)";
		try {
			Map<String, Object> map = new HashMap<>();
			map.put("firstNm", insertEmployeeReq.getFirstNm());
			map.put("middleNm", insertEmployeeReq.getMiddleNm());
			map.put("lastNm", insertEmployeeReq.getLastNm());
			map.put("gender", insertEmployeeReq.getGender());
			map.put("mobileNo", insertEmployeeReq.getMobileNo());
			map.put("alterMobileNo", insertEmployeeReq.getAlterMobileNo());
			map.put("salary", insertEmployeeReq.getSalary());
			map.put("emailId", insertEmployeeReq.getEmailId());
			map.put("empCode", insertEmployeeReq.getEmpCode());
			map.put("addressLine1", insertEmployeeReq.getAddressLine1());
			map.put("addressLine2", insertEmployeeReq.getAddressLine2());
			map.put("stateNm", insertEmployeeReq.getStateNm());
			map.put("cityNm", insertEmployeeReq.getCityNm());
			map.put("countryNm", insertEmployeeReq.getCountryNm());
			map.put("pinCode", insertEmployeeReq.getPinCode());
			map.put("qualification", insertEmployeeReq.getQualification());
			map.put("experience", insertEmployeeReq.getExperience());
			map.put("bloodGroup", insertEmployeeReq.getBloodGroup());
			map.put("isActive", insertEmployeeReq.getIsActive());

			result = namedParameterJdbcTemplate.update(queryInsertEmployeeDetails, map) > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public Boolean insertEmployeeDetailsByUsingMapSql(Employees insertEmployeeMapSqlReq) {
		boolean result=false;
		String queryInsertEmployeeDetails = "INSERT INTO employees.employees_info_ref(first_nm,middle_nm,last_nm,gender,mobile_no,alter_mobile_no,salary,email_id,emp_code,address_line1,address_line2,state_nm,city_nm,country_nm,pin_code,qualification,experience,blood_group,is_active) values(:firstNm,:middleNm,:lastNm,:gender,:mobileNo,:alterMobileNo,:salary,:emailId,:empCode,:addressLine1,:addressLine2,:stateNm,:cityNm,:countryNm,:pinCode,:qualification,:experience,:bloodGroup,:isActive)";
		try {
			MapSqlParameterSource mapSql = new MapSqlParameterSource();
			mapSql.addValue("firstNm", insertEmployeeMapSqlReq.getFirstNm());
			mapSql.addValue("middleNm", insertEmployeeMapSqlReq.getMiddleNm());
			mapSql.addValue("lastNm", insertEmployeeMapSqlReq.getLastNm());
			mapSql.addValue("gender", insertEmployeeMapSqlReq.getGender());
			mapSql.addValue("mobileNo", insertEmployeeMapSqlReq.getMobileNo());
			mapSql.addValue("alterMobileNo", insertEmployeeMapSqlReq.getAlterMobileNo());
			mapSql.addValue("salary", insertEmployeeMapSqlReq.getSalary());
			mapSql.addValue("emailId", insertEmployeeMapSqlReq.getEmailId());
			mapSql.addValue("empCode", insertEmployeeMapSqlReq.getEmpCode());
			mapSql.addValue("addressLine1", insertEmployeeMapSqlReq.getAddressLine1());
			mapSql.addValue("addressLine2", insertEmployeeMapSqlReq.getAddressLine2());
			mapSql.addValue("stateNm", insertEmployeeMapSqlReq.getStateNm());
			mapSql.addValue("cityNm", insertEmployeeMapSqlReq.getCityNm());
			mapSql.addValue("countryNm", insertEmployeeMapSqlReq.getCountryNm());
			mapSql.addValue("pinCode", insertEmployeeMapSqlReq.getPinCode());
			mapSql.addValue("qualification", insertEmployeeMapSqlReq.getQualification());
			mapSql.addValue("experience", insertEmployeeMapSqlReq.getExperience());
			mapSql.addValue("bloodGroup", insertEmployeeMapSqlReq.getBloodGroup());
			mapSql.addValue("isActive", insertEmployeeMapSqlReq.getIsActive());
			
			result = namedParameterJdbcTemplate.update(queryInsertEmployeeDetails, mapSql)>0;
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Boolean insertEmployeeDetailsByBeanProperty(Employees insertEmployeeBeanPropertyReq) {
		boolean result=false;
		String queryInsertEmployeeDetails = "INSERT INTO employees.employees_info_ref(first_nm,middle_nm,last_nm,gender,mobile_no,alter_mobile_no,salary,email_id,emp_code,address_line1,address_line2,state_nm,city_nm,country_nm,pin_code,qualification,experience,blood_group,is_active) values(:firstNm,:middleNm,:lastNm,:gender,:mobileNo,:alterMobileNo,:salary,:emailId,:empCode,:addressLine1,:addressLine2,:stateNm,:cityNm,:countryNm,:pinCode,:qualification,:experience,:bloodGroup,:isActive)";
		try {
			result=namedParameterJdbcTemplate.update(queryInsertEmployeeDetails, new BeanPropertySqlParameterSource(insertEmployeeBeanPropertyReq))>0;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
