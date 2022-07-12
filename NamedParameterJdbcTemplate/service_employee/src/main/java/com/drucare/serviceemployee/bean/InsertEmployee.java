package com.drucare.serviceemployee.bean;

import java.util.List;

public class InsertEmployee {
	private Integer orgId;
	private List<EmployeeBean> empList;
	
	public Integer getOrgId() {
		return orgId;
	}
	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}
	public List<EmployeeBean> getEmpList() {
		return empList;
	}
	public void setEmpList(List<EmployeeBean> empList) {
		this.empList = empList;
	}
}
