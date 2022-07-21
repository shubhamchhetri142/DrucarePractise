package com.drucare.serviceemployee.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.drucare.serviceemployee.bean.EmpFetchFieldsReq;
import com.drucare.serviceemployee.bean.EmployeeDeptBean;
import com.drucare.serviceemployee.bean.EmployeeDesignationBean;
import com.drucare.serviceemployee.bean.FetchEmployeeDto;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public String fetchEmployeeNameByEmpIdUsingObject(EmpFetchFieldsReq fetchEmployeeRequest) {
		String queryForFetchEmployeeNmByEmpIdUsingObject = "SELECT concat(first_nm,' ',middle_nm,' ',last_nm,' ',salary,' ',city_nm,' ',email_id,' ',emp_code,' ',experience,' ',qualification) As empNm from drupractice.employees_info_ref  where emp_id=:empId and org_id=:orgId and isactive=:isactive";

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

		String queryForFetchEmployeeNmByEmpIdUsingList = "SELECT emp_id,first_nm,middle_nm,last_nm,gender,mobile_no,alter_mobile_no,salary,email_id,emp_code,address_line1,address_line2,state_nm,city_nm,country_nm,pin_code,qualification,experience,isactive,org_id from drupractice.employees_info_ref WHERE emp_id=:empId and org_id=:orgId and isactive=true";
		StringBuilder query = new StringBuilder(queryForFetchEmployeeNmByEmpIdUsingList);
		try {
			if ((StringUtils.isNoneBlank(fetchEmployeeRequest.getEmpNm()))) {
				query.append(
						" AND concat(first_nm,' ',middle_nm,' ',last_nm,' ',salary,' ',country_nm) ilike '%' ||:empNm||'%'");

			}

			if ((StringUtils.isNoneBlank(fetchEmployeeRequest.getMobileNo()))) {
				query.append(" And mobile_no=:mobileNo");
			}
			query.append("  order by emp_id desc ");
			List<Map<String, Object>> rows = namedParameterJdbcTemplate.queryForList(query.toString(),
					new BeanPropertySqlParameterSource(fetchEmployeeRequest));
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
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fetchEmployeeList;
	}

	@Override
	public List<FetchEmployeeDto> fetchAllEmployeeDetails(EmpFetchFieldsReq fetchEmployeeRequest) {
		String queryForFetchEmployeeNmByEmpIdUsingList = "SELECT emp_id,first_nm,middle_nm,last_nm,gender,mobile_no,alter_mobile_no,salary,email_id,emp_code,address_line1,address_line2,state_nm,city_nm,country_nm,pin_code,qualification,experience,isactive,org_id from drupractice.employees_info_ref WHERE org_id=:orgId and emp_id=:empId and isactive=true";
		return namedParameterJdbcTemplate.query(queryForFetchEmployeeNmByEmpIdUsingList,
				new BeanPropertySqlParameterSource(fetchEmployeeRequest),
				new BeanPropertyRowMapper<FetchEmployeeDto>(FetchEmployeeDto.class));
	}

	@Override
	public List<FetchEmployeeDto> fetchEmployeeDetails(EmpFetchFieldsReq fetchEmployeeRequest) {
		String queryForFetchEmployeeDetails = "SELECT eir.first_nm, eir.middle_nm, eir.last_nm, eir.gender, eir.emp_code, edp.emp_dept_id, eds.emp_designation_id, eds.emp_id, dr.dept_id, dr.dept_nm, dsr.designation_id, dsr.designation_nm FROM   drupractice.employees_info_ref eir INNER JOIN drupractice.employee_dept_xref edp ON eir.emp_id = edp.emp_id INNER JOIN drupractice.employee_designation_xref eds ON eir.emp_id = eds.emp_id INNER JOIN drupractice.departments_ref dr ON edp.dept_id = dr.dept_id INNER JOIN drupractice.designation_ref dsr ON eds.designation_id = dsr.designation_id";

		List<FetchEmployeeDto> empList = new ArrayList<>();

		List<Map<String, Object>> rows = namedParameterJdbcTemplate.queryForList(queryForFetchEmployeeDetails,new BeanPropertySqlParameterSource(fetchEmployeeRequest));
		FetchEmployeeDto fetchEmployeeDetailsDto = null;
		List<EmployeeDeptBean> empDeptList = null;
		List<EmployeeDesignationBean> empDesignationList = null;
		Set<Long> set = new HashSet<>();
		try {
			int count = 0;

			for (Map<String, Object> row : rows) {

				count++;

				if (set.add((Long) row.get("emp_id"))) {

					if (fetchEmployeeDetailsDto != null) {
						if (CollectionUtils.isNotEmpty(empDesignationList)) {

							fetchEmployeeDetailsDto.setEmpDesignationList(empDesignationList);

						}
					}

					// employee basic details

					fetchEmployeeDetailsDto = new FetchEmployeeDto();
					fetchEmployeeDetailsDto.setEmpId((Long) row.get("emp_id"));
					fetchEmployeeDetailsDto.setFirstNm((String) row.get("first_nm"));
					fetchEmployeeDetailsDto.setMiddleNm((String) row.get("middle_nm"));
					fetchEmployeeDetailsDto.setLastNm((String) row.get("last_nm"));
					fetchEmployeeDetailsDto.setMobileNo((String) row.get("mobile_no"));

					empList.add(fetchEmployeeDetailsDto);

					empDeptList = new ArrayList<>();

				}
				if (CollectionUtils.isNotEmpty(empDeptList)) {
					fetchEmployeeDetailsDto.setEmpDeptList(empDeptList);

				}

				if (row.get("dept_id") != null) {

					// department details

					EmployeeDeptBean employeeDeptBean = new EmployeeDeptBean();
					employeeDeptBean.setDeptId((Long) row.get("dept_id"));
					employeeDeptBean.setEmpDeptId((Long) row.get("emp_dept_id"));
					employeeDeptBean.setDeptNm((String) row.get("dept_nm"));
					empDeptList.add(employeeDeptBean);

					empDesignationList = new ArrayList<>();

				}

				if (row.get("designation_id") != null) {
					// designation details
					EmployeeDesignationBean empDesignationBean = new EmployeeDesignationBean();
					empDesignationBean.setDesignationId((Long) row.get("designation_id"));
					empDesignationBean.setEmpDesignationId((Long) row.get("emp_design_id"));
					empDesignationBean.setDesignationNm((String) row.get("designation_nm"));
					empDesignationList.add(empDesignationBean);

				}

			}
			if (count == rows.size() && fetchEmployeeDetailsDto != null) {

				if (CollectionUtils.isNotEmpty(empDeptList) && CollectionUtils.isNotEmpty(empDesignationList)) {

					// adding designationList and departmentList to EmployeeDetails

					fetchEmployeeDetailsDto.setEmpDeptList(empDeptList);
					fetchEmployeeDetailsDto.setEmpDesignationList(empDesignationList);
					// empList.add(fetchEmployeeDetailsDto);

				}

				empList.add(fetchEmployeeDetailsDto);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return empList;
	}
}