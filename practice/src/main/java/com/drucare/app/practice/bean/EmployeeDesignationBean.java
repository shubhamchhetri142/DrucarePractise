package com.drucare.app.practice.bean;

public class EmployeeDesignationBean {
	private Long empDesignationId;
	private Long designationId;
	private String designationNm;
	private Integer orgId;
	
	
	
	public Integer getOrgId() {
		return orgId;
	}
	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}
	public Long getEmpDesignationId() {
		return empDesignationId;
	}
	public void setEmpDesignationId(Long empDesignationId) {
		this.empDesignationId = empDesignationId;
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
