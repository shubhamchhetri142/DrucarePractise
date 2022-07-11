package com.drucare.serviceemployee.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.drucare.serviceemployee.bean.InsertOrUpdateEmployeeReq;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	//	@Override
	//	public Long insertOrUpdateEmployeeReq(InsertOrUpdateEmployeeReq insertOrUpdateEmployeeReq) {
	//
	//		KeyHolder holder = new GeneratedKeyHolder();
	//		long result;
	//		String queryForInsertEmployee = "INSERT INTO employees.employees_history_info_ref (emp_id,first_nm,middle_nm,last_nm,gender,mobile_no,alter_mobile_no,salary,email_id,emp_code,address_line1,address_line2,state_nm,city_nm,country_nm,pin_code,qualification,experience,blood_group,is_active) SELECT emp_id,first_nm,middle_nm,last_nm,gender,mobile_no,alter_mobile_no,salary,email_id,emp_code,address_line1,address_line2,state_nm,city_nm,country_nm,pin_code,qualification,experience,blood_group,is_active FROM employees.employees_info_ref WHERE is_active=true and emp_id=:empId";
	//
	//			
	//			result=namedParameterJdbcTemplate.update(queryForInsertEmployee,
	//					new BeanPropertySqlParameterSource(insertOrUpdateEmployeeReq), holder);
	//					Long Key = holder.getKey().longValue();
	//					insertOrUpdateEmployeeReq.setEmpId(Key);
	//
	//			String queryForUpdateEmployee = "UPDATE employees.employees_info_ref SET first_nm=:firstNm,middle_nm=:middleNm,last_nm=:lastNm,mobile_no=:mobileNo,email_id=:emailId,address_line1=:addressLine1,address_line2=:addressLine2 WHERE emp_id=:empId and is_active=true";
	//			 result=namedParameterJdbcTemplate.update(queryForUpdateEmployee,
	//					new BeanPropertySqlParameterSource(insertOrUpdateEmployeeReq));
	//		return result;
	//	}

	@Override
	public Long insertEmployeeDetails(InsertOrUpdateEmployeeReq insertOrUpdateEmployeeReq) {
//		KeyHolder holder = new GeneratedKeyHolder();
		long result;
		String queryInsertEmployeeDetails = "INSERT INTO employees.employees_info_ref(first_nm,middle_nm,last_nm,gender,mobile_no,alter_mobile_no,salary,email_id,emp_code,address_line1,address_line2,state_nm,city_nm,country_nm,pin_code,qualification,experience,blood_group,is_active) values(:firstNm,:middleNm,:lastNm,:gender,:mobileNo,:alterMobileNo,:salary,:emailId,:empCode,:addressLine1,:addressLine2,:stateNm,:cityNm,:countryNm,:pinCode,:qualification,:experience,:bloodGroup,:isActive)";

//		Long Key = holder.getKey().longValue();
		
		result = namedParameterJdbcTemplate.update(queryInsertEmployeeDetails,
				new BeanPropertySqlParameterSource(insertOrUpdateEmployeeReq));
		
//		insertOrUpdateEmployeeReq.setEmpId(Key);
//		Long tempKey= insertOrUpdateEmployeeReq.getEmpId();
//		result=namedParameterJdbcTemplate.update(queryInsertEmployeeDetails, new BeanPropertySqlParameterSource(tempKey));
		return result;
		
	}

	@Override
	public Long updateEmployeeDetails(InsertOrUpdateEmployeeReq insertOrUpdateEmployeeReq) {
		KeyHolder holder = new GeneratedKeyHolder();
		Long Key = holder.getKey().longValue();
		Long result;
		EmployeeDaoImpl empDao=new EmployeeDaoImpl();
		result=empDao.insertEmployeeDetails(insertOrUpdateEmployeeReq);
		String queryForUpdateEmployeeDetails = "UPDATE employees.employees_info_ref SET first_nm=:firstNm,middle_nm=:middleNm,last_nm=:lastNm,mobile_no=:mobileNo,email_id=:emailId,address_line1=:addressLine1,address_line2=:addressLine2 WHERE emp_id=:empId and is_active=true";
		insertOrUpdateEmployeeReq.setEmpId(Key);
		namedParameterJdbcTemplate.update(queryForUpdateEmployeeDetails,
				new BeanPropertySqlParameterSource(insertOrUpdateEmployeeReq),holder, new String[] {"emp_id"});
		
		return result;
	}
}
