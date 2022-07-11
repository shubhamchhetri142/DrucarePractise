package com.drucare.serviceemployee.dao;

import org.springframework.stereotype.Repository;

import com.drucare.serviceemployee.bean.InsertOrUpdateEmployeeReq;

@Repository
public interface EmployeeDao {

	public Long insertEmployeeDetails(InsertOrUpdateEmployeeReq insertOrUpdateEmployeeReq);
	public Long updateEmployeeDetails(InsertOrUpdateEmployeeReq insertOrUpdateEmployeeReq);
}
