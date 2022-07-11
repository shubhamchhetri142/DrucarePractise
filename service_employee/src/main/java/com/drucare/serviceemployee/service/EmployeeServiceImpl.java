package com.drucare.serviceemployee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drucare.serviceemployee.bean.InsertOrUpdateEmployeeReq;
import com.drucare.serviceemployee.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Long insertOrUpdateEmployeeReq(InsertOrUpdateEmployeeReq insertOrUpdateEmployeeReq) {
		if(insertOrUpdateEmployeeReq.getEmpId()==null) {
			Long key=employeeDao.insertEmployeeDetails(insertOrUpdateEmployeeReq);
			return  key;
		}
		else {
			return employeeDao.updateEmployeeDetails(insertOrUpdateEmployeeReq);
		}
//		return employeeDao.insertOrUpdateEmployeeReq(insertOrUpdateEmployeeReq);
	}
}
