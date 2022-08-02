package com.drucare.app.practice.bean;

public class EmployeeDesignationXref {
	private Long empDesignationId;
    private Long designationId;
    private String designationNm;
    private Long empId;
    private Long orgId;
    private Boolean isactive;
    
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
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public Long getOrgId() {
		return orgId;
	}
	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}
	public Boolean getIsactive() {
		return isactive;
	}
	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}
}
