package com.drucare.serviceemployee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drucare.serviceemployee.bean.EmpFetchFieldsReq;
import com.drucare.serviceemployee.bean.FetchEmployeeDto;
import com.drucare.serviceemployee.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public String fetchEmployeeNameByEmpIdUsingObject(EmpFetchFieldsReq fetchEmployeeRequest) {
		return employeeDao.fetchEmployeeNameByEmpIdUsingObject(fetchEmployeeRequest);
	}

	@Override
	public FetchEmployeeDto fetchEmployeeNameByEmpIdUsingMap(EmpFetchFieldsReq fetchEmployeeRequest) {
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

	@Override
	public List<FetchEmployeeDto> fetchEmployeeDetails(EmpFetchFieldsReq fetchEmployeeRequest) {
		return employeeDao.fetchEmployeeDetails(fetchEmployeeRequest);
	}

}