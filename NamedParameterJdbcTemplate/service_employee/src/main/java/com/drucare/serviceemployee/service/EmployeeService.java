package com.drucare.serviceemployee.service;

import org.springframework.stereotype.Service;

import com.drucare.serviceemployee.bean.InsertEmployee;
import com.drucare.serviceemployee.bean.InsertOrUpdateEmployeeReq;

@Service
public interface EmployeeService {

	public Boolean insertOrUpdateEmployeeReq(InsertOrUpdateEmployeeReq insertOrUpdateEmployeeReq);

	public Boolean insertEmployeeList(InsertEmployee insertEmployee);
}
