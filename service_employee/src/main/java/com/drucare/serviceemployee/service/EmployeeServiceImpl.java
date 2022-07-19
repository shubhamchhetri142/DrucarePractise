package com.drucare.serviceemployee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drucare.serviceemployee.bean.EmpFetchFieldsReq;
import com.drucare.serviceemployee.bean.Employee;
import com.drucare.serviceemployee.bean.FetchEmployeeDto;
import com.drucare.serviceemployee.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

//	@Override
//	public Boolean insertOrUpdateEmployeeReq(InsertOrUpdateEmployeeReq insertOrUpdateEmployeeReq) {
//		if (insertOrUpdateEmployeeReq.getEmpId() == null) {
//			return employeeDao.insertEmployeeDetails(insertOrUpdateEmployeeReq);
//		} else {
//			return employeeDao.updateEmployeeDetails(insertOrUpdateEmployeeReq);
//		}
//	}

	@Override
	public Boolean insertEmployeeInBatch(Employee insertEmployeeRequest) {
		// TODO Auto-generated method stub
		return employeeDao.insertEmployeeInBatch(insertEmployeeRequest);
	}

@Override
public String fetchEmployeeNameByEmpIdUsingObject(EmpFetchFieldsReq fetchEmployeeRequest) {
	return employeeDao.fetchEmployeeNameByEmpIdUsingObject(fetchEmployeeRequest);
}

@Override
public FetchEmployeeDto fetchEmployeeNameByEmpIdUsingMap(EmpFetchFieldsReq fetchEmployeeRequest) {
	// TODO Auto-generated method stub
	return employeeDao.fetchEmployeeNameByEmpIdUsingMap(fetchEmployeeRequest);
}

@Override
public List<FetchEmployeeDto> fetchAllEmployeesUsingList(EmpFetchFieldsReq fetchEmployeeRequest) {
	return employeeDao.fetchAllEmployeesUsingList(fetchEmployeeRequest);
}

@Override
public List<FetchEmployeeDto> fetchAllEmployeeDetails(EmpFetchFieldsReq fetchEmployeeRequest) {
	return employeeDao.fetchAllEmployeeDetails(fetchEmployeeRequest);
}

	

//	@Override
//	public Boolean insertEmployeeList(InsertEmployeeReq insertEmployeeReq) {
//		Long empId = null;
//		for (EmployeeBean employeeObj : insertEmployeeReq.getEmpList()) {
//			employeeObj.setOrgId(insertEmployeeReq.getOrgId());
//			if (employeeObj.getEmpId() == null) {
//				empId = employeeDao.insertEmployee(employeeObj);
//				employeeObj.setEmpId(empId);
//			} else {
//				employeeDao.updateEmployee(employeeObj);
//			}
//			if (CollectionUtils.isNotEmpty(employeeObj.getDeptList())) {
//				for (DeptBean deptObj : employeeObj.getDeptList()) {
//					MapSqlParameterSource parameters = new MapSqlParameterSource();
//					parameters.addValue("orgId", insertEmployeeReq.getOrgId());
//					parameters.addValue("empId", employeeObj.getEmpId());
//					parameters.addValue("deptId", deptObj.getDeptId());
//					
//					if (CollectionUtils.isNotEmpty(deptObj.getEmployeeDeptXrefList())) {
//						for (EmployeeDeptXref employeeDeptXrefObj : deptObj.getEmployeeDeptXrefList()) {
//							parameters.addValue("orgId", insertEmployeeReq.getOrgId());
//							parameters.addValue("empDeptId", employeeDeptXrefObj.getEmpDeptId());
//							parameters.addValue("deptId", deptObj.getDeptId());
//						}
//					}
//				}
////				employeeDao.insertEmployeeDepartments(employeeObj);
//			}
//
//			if (CollectionUtils.isNotEmpty(employeeObj.getDesignationList())) {
//				for (DesignationBean designationObj : employeeObj.getDesignationList()) {
//					MapSqlParameterSource parameters = new MapSqlParameterSource();
//					parameters.addValue("orgId", insertEmployeeReq.getOrgId());
//					parameters.addValue("empId", employeeObj.getEmpId());
//					parameters.addValue("designationId", designationObj.getDesignationId());
//					
//					if (CollectionUtils.isNotEmpty(designationObj.getEmployeeDesignationList())) {
//						for (EmployeeDesignationXref employeeDesignationXrefObj : designationObj
//								.getEmployeeDesignationList()) {
//							parameters.addValue("orgId", insertEmployeeReq.getOrgId());
//							parameters.addValue("empDesignationId", employeeDesignationXrefObj.getEmpDesignationId());
//							parameters.addValue("designationId", designationObj.getDesignationId());
//							parameters.addValue("empId", employeeObj.getEmpId());
//						}
//					}
//				}
////				employeeDao.insertEmployeeDesignation(employeeObj);
//			}
//
//		}
//		return true;
//	}
	
}
