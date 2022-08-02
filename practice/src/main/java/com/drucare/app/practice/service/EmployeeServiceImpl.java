package com.drucare.app.practice.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Service;

import com.drucare.app.practice.bean.Employee;
import com.drucare.app.practice.bean.EmployeeDeptBean;
import com.drucare.app.practice.bean.EmployeeDesignationBean;
import com.drucare.app.practice.bean.InsertEmployee;
import com.drucare.app.practice.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Boolean insertOrUpdateInBatch(SqlParameterSource[] sqlParameterSource) {

		boolean result = false;
		InsertEmployee insertEmployee = new InsertEmployee();

		for (Employee employeeObj : insertEmployee.getEmpList()) {
			employeeObj.setOrgId(insertEmployee.getOrgId());
			if (employeeObj.getEmpId() == null) {
				employeeDao.insertEmployeeDetails(employeeObj);
			} else {
				employeeDao.updateEmployeeDetails(employeeObj);
			}
			if (CollectionUtils.isNotEmpty(employeeObj.getDepartmentList())) {
				List<EmployeeDeptBean> saveDeptList = new ArrayList<>();
				List<EmployeeDeptBean> updateDeptList = new ArrayList<>();
				for (EmployeeDeptBean employeeDeptObj : employeeObj.getDepartmentList()) {
					employeeDeptObj.setEmpDeptId(employeeObj.getEmpId());
					employeeDeptObj.setOrgId(employeeObj.getOrgId());

					if (employeeDeptObj.getEmpDeptId() == null) {
						saveDeptList.add(employeeDeptObj);
					} else {
						updateDeptList.add(employeeDeptObj);
					}
				}
				if (CollectionUtils.isNotEmpty(saveDeptList)) {
					employeeDao.insertEmployeeDepartments(SqlParameterSourceUtils.createBatch(saveDeptList.toArray()));
				}
				if (CollectionUtils.isNotEmpty(updateDeptList)) {
					employeeDao
							.insertEmployeeDepartments(SqlParameterSourceUtils.createBatch(updateDeptList.toArray()));
				}
			}
			if (CollectionUtils.isNotEmpty(employeeObj.getDesignationList())) {
				List<EmployeeDesignationBean> saveDesignationList = new ArrayList<>();
				List<EmployeeDesignationBean> updateDesignationList = new ArrayList<>();
				for (EmployeeDesignationBean employeeDesignationObj : employeeObj.getDesignationList()) {
					employeeDesignationObj.setEmpDesignationId(employeeObj.getEmpId());
					employeeDesignationObj.setOrgId(employeeObj.getOrgId());
					
					if (employeeDesignationObj.getEmpDesignationId() == null) {
						saveDesignationList.add(employeeDesignationObj);
					} else {
						updateDesignationList.add(employeeDesignationObj);
					}
				}
				if(CollectionUtils.isNotEmpty(saveDesignationList)) {
					employeeDao.insertEmployeeDesignation(SqlParameterSourceUtils.createBatch(saveDesignationList.toArray()));
				}
				if(CollectionUtils.isNotEmpty(updateDesignationList)) {
					employeeDao.insertEmployeeDesignation(SqlParameterSourceUtils.createBatch(updateDesignationList.toArray()));
				}
			}
		}
		return result;
	}
}
