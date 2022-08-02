package com.drucare.app.practice.bean;

import java.util.List;

public class InsertEmployee {
	private Integer orgId;
	private List<Employee> empList;
	public Integer getOrgId() {
		return orgId;
	}
	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	
	
}
