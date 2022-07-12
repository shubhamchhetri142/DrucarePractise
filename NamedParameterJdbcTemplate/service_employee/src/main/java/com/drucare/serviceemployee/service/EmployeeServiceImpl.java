package com.drucare.serviceemployee.service;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Service;

import com.drucare.serviceemployee.bean.DeptBean;
import com.drucare.serviceemployee.bean.DesignationBean;
import com.drucare.serviceemployee.bean.EmployeeBean;
import com.drucare.serviceemployee.bean.EmployeeDeptXref;
import com.drucare.serviceemployee.bean.EmployeeDesignationXref;
import com.drucare.serviceemployee.bean.InsertEmployee;
import com.drucare.serviceemployee.bean.InsertOrUpdateEmployeeReq;
import com.drucare.serviceemployee.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Boolean insertOrUpdateEmployeeReq(InsertOrUpdateEmployeeReq insertOrUpdateEmployeeReq) {
		if (insertOrUpdateEmployeeReq.getEmpId() == null) {
			return employeeDao.insertEmployeeDetails(insertOrUpdateEmployeeReq);
		} else {
			return employeeDao.updateEmployeeDetails(insertOrUpdateEmployeeReq);
		}
		//		return employeeDao.insertOrUpdateEmployeeReq(insertOrUpdateEmployeeReq);
	}

	@Override
	public Boolean insertEmployeeList(InsertEmployee insertEmployee) {
		Long empId = null;
		for (EmployeeBean employeeObj : insertEmployee.getEmpList()) {
			employeeObj.setOrgId(insertEmployee.getOrgId());
			if (employeeObj.getEmpId() == null) {
				empId = employeeDao.insertEmployee(employeeObj);
				employeeObj.setEmpId(empId);
			} else {
				employeeDao.updateEmployee(employeeObj);
			}
			if(CollectionUtils.isNotEmpty(employeeObj.getDeptList())) {
				for(DeptBean deptObj:employeeObj.getDeptList()) {
					MapSqlParameterSource parametrs=new MapSqlParameterSource();
					parametrs.addValue("orgId", insertEmployee.getOrgId());
					parametrs.addValue("empId", employeeObj.getEmpId());
					parametrs.addValue("deptId", deptObj.getDeptId());
				}
				employeeDao.insertemployeeDepartments(employeeObj);
			}
			
			if(CollectionUtils.isNotEmpty(employeeObj.getDesignationList())) {
				for(DesignationBean desigantionObj:employeeObj.getDesignationList()) {
					MapSqlParameterSource parametrs=new MapSqlParameterSource();
					parametrs.addValue("orgId", insertEmployee.getOrgId());
					parametrs.addValue("empId", employeeObj.getEmpId());
					parametrs.addValue("designationId", desigantionObj.getDesignationId());
					}
			}
			if(CollectionUtils.isNotEmpty(employeeObj.getEmployeeDeptXrefList())) {
				for(EmployeeDeptXref employeeDetpXrefObj:employeeObj.getEmployeeDeptXrefList()) {
					MapSqlParameterSource parametrs=new MapSqlParameterSource();
					parametrs.addValue("orgId", insertEmployee.getOrgId());
					parametrs.addValue("empId", employeeObj.getEmpId());
					parametrs.addValue("empDeptId", employeeDetpXrefObj.getDeptId());
				}
			}
			if(CollectionUtils.isNotEmpty(employeeObj.getEmployeeDesignationXrefList())) {
				for(EmployeeDesignationXref employeeDesignationXrefObj:employeeObj.getEmployeeDesignationXrefList()){
					MapSqlParameterSource parametrs=new MapSqlParameterSource();
					parametrs.addValue("orgId", insertEmployee.getOrgId());
					parametrs.addValue("empId", employeeObj.getEmpId());
					parametrs.addValue("empDesignationId", employeeDesignationXrefObj.getEmpDesignationId());
				}
			}
		}
		return true;
	}
}
