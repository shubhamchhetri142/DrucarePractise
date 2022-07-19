package com.drucare.serviceemployee.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.drucare.serviceemployee.bean.EmpFetchFieldsReq;
import com.drucare.serviceemployee.bean.Employee;
import com.drucare.serviceemployee.bean.EmployeeDepartmentsXref;
import com.drucare.serviceemployee.bean.EmployeeDesignationXref;
import com.drucare.serviceemployee.bean.FetchEmployeeDto;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

//	@Override
//	public Boolean insertEmployeeDetails(InsertOrUpdateEmployeeReq insertOrUpdateEmployeeReq) {
//		boolean result = false;
//		KeyHolder holder = new GeneratedKeyHolder();
//		String queryInsertEmployeeDetails = "INSERT INTO employees.employees_info_ref(emp_id,first_nm,middle_nm,last_nm,gender,mobile_no,alter_mobile_no,salary,email_id,emp_code,address_line1,address_line2,state_nm,city_nm,country_nm,pin_code,qualification,experience,blood_group,is_active) values(:empId,:firstNm,:middleNm,:lastNm,:gender,:mobileNo,:alterMobileNo,:salary,:emailId,:empCode,:addressLine1,:addressLine2,:stateNm,:cityNm,:countryNm,:pinCode,:qualification,:experience,:bloodGroup,:isActive)";
//		Long key = holder.getKey().longValue();
//
//		result = namedParameterJdbcTemplate.update(queryInsertEmployeeDetails,
//				new BeanPropertySqlParameterSource(insertOrUpdateEmployeeReq), holder, new String[] { "emp_id" }) > 0;
//				insertOrUpdateEmployeeReq.setEmpId(key);
//				return result;
//	}
//
//	@Override
//	public Boolean updateEmployeeDetails(InsertOrUpdateEmployeeReq insertOrUpdateEmployeeReq) {
//		boolean result = false;
//		String queryForInsertEmployeeDetails = "INSERT INTO employees.employees_history_info_ref(emp_id,first_nm,middle_nm,last_nm,gender,mobile_no,alter_mobile_no,salary,email_id,emp_code,address_line1,address_line2,state_nm,city_nm,country_nm,pin_code,qualification,experience,blood_group,is_active) values(:empId,:firstNm,:middleNm,:lastNm,:gender,:mobileNo,:alterMobileNo,:salary,:emailId,:empCode,:addressLine1,:addressLine2,:stateNm,:cityNm,:countryNm,:pinCode,:qualification,:experience,:bloodGroup,:isActive)";
//		String queryForUpdateEmployeeDetails = "UPDATE employees.employees_info_ref SET first_nm=:firstNm,middle_nm=:middleNm,last_nm=:lastNm,mobile_no=:mobileNo,email_id=:emailId,address_line1=:addressLine1,address_line2=:addressLine2 WHERE emp_id=:empId and is_active=true";
//		result = namedParameterJdbcTemplate.update(queryForInsertEmployeeDetails,
//				new BeanPropertySqlParameterSource(insertOrUpdateEmployeeReq)) > 0;
//
//				result = namedParameterJdbcTemplate.update(queryForUpdateEmployeeDetails,
//						new BeanPropertySqlParameterSource(insertOrUpdateEmployeeReq)) > 0;
//						return result;
//	}
//
//	@Override
//	public Long insertEmployee(EmployeeBean employeeBean) {
//		String queryForInsertEmployee = "INSERT INTO employees.employees_info_ref(first_nm,middle_nm,last_nm,gender,mobile_no,alter_mobile_no,salary,email_id,emp_code,address_line1,address_line2,state_nm,city_nm,country_nm,pin_code,qualification,experience,blood_group,is_active) values(:firstNm,:middleNm,:lastNm,:gender,:mobileNo,:alterMobileNo,:salary,:emailId,:empCode,:addressLine1,:addressLine2,:stateNm,:cityNm,:countryNm,:pinCode,:qualification,:experience,:bloodGroup,:isActive)";
//		long empId = 0;
//		try {
//
//			KeyHolder holder = new GeneratedKeyHolder();
//
//			namedParameterJdbcTemplate.update(queryForInsertEmployee, new BeanPropertySqlParameterSource(employeeBean),
//					holder, new String[] { "emp_id" });
//
//			empId = holder.getKey().longValue();
//			employeeBean.setEmpId(empId);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return empId;
//	}
//
//	@Override
//	public Boolean updateEmployee(EmployeeBean employeeBean) {
//		boolean result = false;
//		String queryForInsertEmployeeDataIntoHistory = "INSERT INTO employees.employees_history_info_ref(first_nm,middle_nm,last_nm,gender,mobile_no,alter_mobile_no,salary,email_id,emp_code,address_line1,address_line2,state_nm,city_nm,country_nm,pin_code,qualification,experience,blood_group,is_active) values(:firstNm,:middleNm,:lastNm,:gender,:mobileNo,:alterMobileNo,:salary,:emailId,:empCode,:addressLine1,:addressLine2,:stateNm,:cityNm,:countryNm,:pinCode,:qualification,:experience,:bloodGroup,:isActive)";
//		String queryForUpdateEmployee = "UPDATE employees.employees_info_ref SET first_nm=:firstNm,middle_nm=:middleNm,last_nm=:lastNm,mobile_no=:mobileNo,email_id=:emailId,address_line1=:addressLine1,address_line2=:addressLine2 WHERE emp_id=:empId and is_active=true";
//		try {
//			result = namedParameterJdbcTemplate.update(queryForInsertEmployeeDataIntoHistory,
//					new BeanPropertySqlParameterSource(employeeBean)) > 0;
//
//					result = namedParameterJdbcTemplate.update(queryForUpdateEmployee,
//							new BeanPropertySqlParameterSource(employeeBean)) > 0;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return result;
//	}
//
//	@Override
//	public Boolean insertEmployeeDepartments(MapSqlParameterSource parameters) {
//		boolean result = false;
//		String queryForInsertEmployeeDepartments = "INSERT INTO employees.employee_dept_xref(org_id,isactive) VALUES (:orgId,:isactive)";
//		try {
//			result = namedParameterJdbcTemplate.update(queryForInsertEmployeeDepartments, parameters) > 0;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return result;
//	}
//
//	@Override
//	public Boolean insertEmployeeDesignation(MapSqlParameterSource parameters) {
//		boolean result = false;
//		String queryForInsertEmployeeDesignation = "INSERT INTO employees.employee_designation_xref(org_id,isactive) VALUES (:orgId,:isactive)";
//		try {
//			result = namedParameterJdbcTemplate.update(queryForInsertEmployeeDesignation, parameters) > 0;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return result;
//	}

	@Override
	public Boolean insertEmployeeInBatch(Employee insertEmployeeRequest) {
		String queryToInsertEmployeeDetails = "INSERT INTO employees.employees_info_ref(first_nm,middle_nm,last_nm,gender,mobile_no,alter_mobile_no,salary,email_id,emp_code,address_line1,address_line2,state_nm,city_nm,country_nm,pin_code,qualification,experience,blood_group,is_active) values(:firstNm,:middleNm,:lastNm,:gender,:mobileNo,:alterMobileNo,:salary,:emailId,:empCode,:addressLine1,:addressLine2,:stateNm,:cityNm,:countryNm,:pinCode,:qualification,:experience,:bloodGroup,:isActive)";
		KeyHolder holder = new GeneratedKeyHolder();
		int count = namedParameterJdbcTemplate.update(queryToInsertEmployeeDetails,
				new BeanPropertySqlParameterSource(insertEmployeeRequest), holder, new String[] { "emp_id" });
		long empId = holder.getKey().longValue();
		Boolean result = false;
		if (count > 0) {
			String queryForInsertEmployeeDepartments = "insert into employees.employee_dept_xref (emp_dept_id,dept_id,org_id,isactive) values(:empDeptId,:deptId,:orgId,true)";
			if (insertEmployeeRequest.getDepartmentList() != null
					&& insertEmployeeRequest.getDepartmentList().size() > 0)
				for (EmployeeDepartmentsXref empDepartmentsxRef : insertEmployeeRequest.getDepartmentList()) {

					MapSqlParameterSource map = new MapSqlParameterSource();
					map.addValue("empId", empId);
					map.addValue("empDeptId", empDepartmentsxRef.getEmpDeptId());
					map.addValue("deptId", empDepartmentsxRef.getDeptId());
					map.addValue("orgId", empDepartmentsxRef.getOrgId());
					map.addValue("IsActive", empDepartmentsxRef.getIsactive());
					result = namedParameterJdbcTemplate.update(queryForInsertEmployeeDepartments, map) > 0;
				}
			String queryForInsertEmployeeDesignation = "insert into employees.employee_designation_xref (emp_designation_id,designation_id,emp_id,org_id,isactive) values(:empDesignationId,:designationId,:empId,:orgId,true)";
			if (insertEmployeeRequest.getDesignationList() != null
					&& insertEmployeeRequest.getDesignationList().size() > 0)
				for (EmployeeDesignationXref empDesignationXref : insertEmployeeRequest.getDesignationList()) {
					MapSqlParameterSource map = new MapSqlParameterSource();
					map.addValue("empId", empId);
					map.addValue("empDesignationId", empDesignationXref.getEmpDesignationId());
					map.addValue("designationId", empDesignationXref.getDesignationId());
					map.addValue("orgId", empDesignationXref.getDesignationId());
					map.addValue("Isactive", empDesignationXref.getDesignationId());
					result = namedParameterJdbcTemplate.update(queryForInsertEmployeeDesignation, map) > 0;
				}
		}
		return result;
	}

	@Override
	public String fetchEmployeeNameByEmpIdUsingObject(EmpFetchFieldsReq fetchEmployeeRequest) {
		String queryForFetchEmployeeNmByEmpIdUsingObject = "SELECT concat(first_nm,' ',middle_nm,' ',last_nm) from drupractice.employees_info_ref  where emp_id=:empId and org_id=:orgId and isactive=:isactive";

		return namedParameterJdbcTemplate.queryForObject(queryForFetchEmployeeNmByEmpIdUsingObject,
				new BeanPropertySqlParameterSource(fetchEmployeeRequest), String.class);

	}

	@Override
	public FetchEmployeeDto fetchEmployeeNameByEmpIdUsingMap(EmpFetchFieldsReq fetchEmployeeRequest) {

		FetchEmployeeDto fetchEmployeeDto = new FetchEmployeeDto();
		String queryForFetchEmployeeNmByEmpIdUsingMap = "SELECT emp_id,first_nm,middle_nm,last_nm,gender,mobile_no,alter_mobile_no,salary,email_id,emp_code,address_line1,address_line2,state_nm,city_nm,country_nm,pin_code,qualification,experience,isactive,org_id from drupractice.employees_info_ref  where emp_id=:empId and org_id=:orgId and isactive=:isactive";
		Map<String, Object> map = namedParameterJdbcTemplate.queryForMap(queryForFetchEmployeeNmByEmpIdUsingMap,
				new BeanPropertySqlParameterSource(fetchEmployeeRequest));

		fetchEmployeeDto.setEmpId((Long) map.get("emp_id"));
		fetchEmployeeDto.setFirstNm((String) map.get("first_nm"));
		fetchEmployeeDto.setMiddleNm((String) map.get("middle_nm"));
		fetchEmployeeDto.setLastNm((String) map.get("last_nm"));
		fetchEmployeeDto.setGender((String) map.get("gender"));
		fetchEmployeeDto.setMobileNo((String) map.get("mobile_no"));
		fetchEmployeeDto.setAlterMobileNo((String) map.get("alter_mobile_no"));
		fetchEmployeeDto.setSalary((Double) map.get("salary"));
		fetchEmployeeDto.setEmailId((String) map.get("email_id"));
		fetchEmployeeDto.setEmpCode((String) map.get("emp_code"));
		fetchEmployeeDto.setAddressLine1((String) map.get("address_line1"));
		fetchEmployeeDto.setAddressLine2((String) map.get("address_line2"));
		fetchEmployeeDto.setStateNm((String) map.get("state_nm"));
		fetchEmployeeDto.setCityNm((String) map.get("city_nm"));
		fetchEmployeeDto.setCountryNm((String) map.get("country_nm"));
		fetchEmployeeDto.setPinCode((String) map.get("pin_code"));
		fetchEmployeeDto.setQualification((String) map.get("qualification"));
		fetchEmployeeDto.setExperience((String) map.get("experience"));
		fetchEmployeeDto.setIsActive((Boolean) map.get("isactive"));
		fetchEmployeeDto.setOrgId((Integer) map.get("org_id"));

		return fetchEmployeeDto;
	}

	@Override
	public List<FetchEmployeeDto> fetchAllEmployeesUsingList(EmpFetchFieldsReq fetchEmployeeRequest) {
		List<FetchEmployeeDto> fetchEmployeeList = new ArrayList<>();
		FetchEmployeeDto fetchEmployeeDto = null;

		String queryForFetchEmployeeNmByEmpIdUsingList = "SELECT emp_id,first_nm,middle_nm,last_nm,gender,alter_mobile_no,salary,email_id,emp_code,address_line1,address_line2,state_nm,city_nm,country_nm,pin_code,qualification,experience,isactive,org_id from drupractice.employees_info_ref";
		StringBuilder query = new StringBuilder(queryForFetchEmployeeNmByEmpIdUsingList);
		if ((StringUtils.isNoneBlank(fetchEmployeeRequest.getEmpNm()))) {
			query.append(
					" AND concat(first_nm,middle_nm,last_nm) ilike '%' ||:empId||'%' ");

		}

		if ((StringUtils.isNoneBlank(fetchEmployeeRequest.getMobileNo()))) {
			query.append("mobile_no=:mobileNo");
		}
		query.append("  order by emp_id desc ");
		List<Map<String, Object>> rows = namedParameterJdbcTemplate.queryForList(
				query.toString(), new BeanPropertySqlParameterSource(fetchEmployeeRequest));
		if (CollectionUtils.isNotEmpty(rows)) {
			for (Map<String, Object> row : rows) {
				fetchEmployeeDto = new FetchEmployeeDto();
				fetchEmployeeDto.setEmpId((Long) row.get("emp_id"));
				fetchEmployeeDto.setFirstNm((String) row.get("first_nm"));
				fetchEmployeeDto.setMiddleNm((String) row.get("middle_nm"));
				fetchEmployeeDto.setLastNm((String) row.get("last_nm"));
				fetchEmployeeDto.setGender((String) row.get("gender"));
				fetchEmployeeDto.setMobileNo((String) row.get("mobile_no"));
				fetchEmployeeDto.setAlterMobileNo((String) row.get("alter_mobile_no"));
				fetchEmployeeDto.setSalary((Double) row.get("salary"));
				fetchEmployeeDto.setEmailId((String) row.get("email_id"));
				fetchEmployeeDto.setEmpCode((String) row.get("emp_code"));
				fetchEmployeeDto.setAddressLine1((String) row.get("address_line1"));
				fetchEmployeeDto.setAddressLine2((String) row.get("address_line2"));
				fetchEmployeeDto.setStateNm((String) row.get("state_nm"));
				fetchEmployeeDto.setCityNm((String) row.get("city_nm"));
				fetchEmployeeDto.setCountryNm((String) row.get("country_nm"));
				fetchEmployeeDto.setPinCode((String) row.get("pin_code"));
				fetchEmployeeDto.setQualification((String) row.get("qualification"));
				fetchEmployeeDto.setExperience((String) row.get("experience"));
				fetchEmployeeDto.setIsActive((Boolean) row.get("isactive"));
				fetchEmployeeDto.setOrgId((Integer) row.get("org_id"));

				fetchEmployeeList.add(fetchEmployeeDto);

			}
			
		}
		return fetchEmployeeList;
	}

	@Override
	public List<FetchEmployeeDto> fetchAllEmployeeDetails(EmpFetchFieldsReq fetchEmployeeRequest) {
		String queryForFetchEmployeeNmByEmpIdUsingList = "SELECT emp_id,first_nm,middle_nm,last_nm,gender,mobile_no,alter_mobile_no,salary,email_id,emp_code,address_line1,address_line2,state_nm,city_nm,country_nm,pin_code,qualification,experience,isactive,org_id from drupractice.employees_info_ref ";
		return namedParameterJdbcTemplate.query(queryForFetchEmployeeNmByEmpIdUsingList, new BeanPropertySqlParameterSource(fetchEmployeeRequest), new BeanPropertyRowMapper<FetchEmployeeDto>(FetchEmployeeDto.class));
	}

}

// @Override
// public Boolean insertEmployeeDepartments(EmployeeBean employeeBean) {
// String queryForInsertEmployeeDepartments = "Insert INTO
// employees.employee_dept_xref (emp_id,org_id,dept_id) values (?,?,?)";
// int[] count = jdbcTemplate.batchUpdate(queryForInsertEmployeeDepartments, new
// BatchPreparedStatementSetter() {
//
// @Override
// public void setValues(PreparedStatement ps, int i) throws SQLException {
//
// DeptBean deptObj = employeeBean.getDeptList().get(i);
//
// ps.setLong(1, employeeBean.getEmpId());
// ps.setInt(2, employeeBean.getOrgId());
// ps.setLong(3, deptObj.getDeptId());
// }
//
// @Override
// public int getBatchSize() {
// return employeeBean.getDeptList().size();
// }
// });
// return count.length==employeeBean.getDeptList().size()?true:false;
// }
//
// @Override
// public Boolean insertEmployeeDesignation(EmployeeBean employeeBean) {
// String queryForInsertEmployeeDesignation = "INSERT INTO
// employees.employee_designation_xref(emp_designation_id,emp_id,designation_id,org_id,isactive)
// VALUES (:empDesignationId,:empId,:designationId,:isactive)";
// int[] count = jdbcTemplate.batchUpdate(queryForInsertEmployeeDesignation, new
// BatchPreparedStatementSetter() {
// @Override
// public void setValues(PreparedStatement ps, int i) throws SQLException {
//
// DesignationBean desigantionObj = employeeBean.getDesignationList().get(i);
//
// ps.setLong(1, employeeBean.getEmpId());
// ps.setInt(2, employeeBean.getOrgId());
// ps.setLong(3,desigantionObj.getDesignationId());
// }
//
// @Override
// public int getBatchSize() {
// return employeeBean.getDesignationList().size();
// }
// });
// return count.length==employeeBean.getDesignationList().size()?true:false;
// }

// @Override
// public Boolean insertemployeeDepartments(EmployeeBean employeeBean) {
// boolean result = false;
// String queryForInsertEmployeeDepartments = "INSERT INTO
// employees.employee_dept_xref(emp_dept_id,emp_id,dept_id,org_id,isactive)
// VALUES (:empDeptId,:empId,:deptId,:orgId,:isactive)";
// KeyHolder holder=new GeneratedKeyHolder();
// List<EmployeeDeptXref> empDeptXref = new ArrayList<>();
// SqlParameterSource[] parameters =
// SqlParameterSourceUtils.createBatch(empDeptXref.toArray());
// namedParameterJdbcTemplate.batchUpdate(queryForInsertEmployeeDepartments,
// parameters);
// Long keys = holder.getKey().longValue();
// employeeBean.setEmpId(keys);
// return result;
// }
//	@Override
//	public Boolean insertEmployeeDesignation(EmployeeBean employeeBean) {
//		boolean result = false;
//		String queryForInsertEmployeeDesignation = "INSERT INTO employees.employee_designation_xref(emp_designation_id,emp_id,designation_id,org_id,isactive) VALUES (:empDesignationId,:empId,:designationId,:isactive)";
//		KeyHolder holder = new GeneratedKeyHolder();
//		List<EmployeeDesignationXref> empDesignationRef = new ArrayList<>();
//		SqlParameterSource[] values = SqlParameterSourceUtils.createBatch(empDesignationRef.toArray());
//		namedParameterJdbcTemplate.batchUpdate(queryForInsertEmployeeDesignation, values);
//		Long Key = holder.getKey().longValue();
//		employeeBean.setEmpId(Key);
//		return result;
//	}
