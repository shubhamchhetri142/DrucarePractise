package com.drucare.serviceemployee.bean;

import java.util.List;

public class DeptBean {
	private Long deptId;
	private String deptNm;
	private List<EmployeeDeptXref> employeeDeptXrefList;
	
	
	public List<EmployeeDeptXref> getEmployeeDeptXrefList() {
		return employeeDeptXrefList;
	}
	public void setEmployeeDeptXrefList(List<EmployeeDeptXref> employeeDeptXrefList) {
		this.employeeDeptXrefList = employeeDeptXrefList;
	}
	public Long getDeptId() {
		return deptId;
	}
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
	public String getDeptNm() {
		return deptNm;
	}
	public void setDeptNm(String deptNm) {
		this.deptNm = deptNm;
	}
}
