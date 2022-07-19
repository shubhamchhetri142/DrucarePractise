package com.drucare.serviceemployee.bean;

public class EmployeeDepartmentsXref {
	private Long empDeptId;
	private Long empId;
	private Long deptId;
	private Long orgId;
	private Boolean isactive;
	
	public Long getEmpDeptId() {
		return empDeptId;
	}
	public void setEmpDeptId(Long empDeptId) {
		this.empDeptId = empDeptId;
	}
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public Long getDeptId() {
		return deptId;
	}
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
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
