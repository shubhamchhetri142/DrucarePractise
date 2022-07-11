package com.drucare.serviceemployee.service;

import org.springframework.stereotype.Service;

import com.drucare.serviceemployee.bean.InsertOrUpdateEmployeeReq;

@Service
public interface EmployeeService {

	public Long insertOrUpdateEmployeeReq(InsertOrUpdateEmployeeReq insertOrUpdateEmployeeReq);
}
