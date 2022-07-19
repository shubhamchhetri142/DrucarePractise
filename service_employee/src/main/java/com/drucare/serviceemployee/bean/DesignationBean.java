package com.drucare.serviceemployee.bean;

import java.util.List;

public class DesignationBean {
	private Long designationId;
	private String designationNm;
	private List<EmployeeDesignationXref> employeeDesignationList;
	
	public List<EmployeeDesignationXref> getEmployeeDesignationList() {
		return employeeDesignationList;
	}
	public void setEmployeeDesignationList(List<EmployeeDesignationXref> employeeDesignationList) {
		this.employeeDesignationList = employeeDesignationList;
	}
	public Long getDesignationId() {
		return designationId;
	}
	public void setDesignationId(Long designationId) {
		this.designationId = designationId;
	}
	public String getDesignationNm() {
		return designationNm;
	}
	public void setDesignationNm(String designationNm) {
		this.designationNm = designationNm;
	}
}
