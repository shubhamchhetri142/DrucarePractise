package com.drucare.serviceemployee.bean;

public class EmployeeDeptXref {
	private Long empDeptId;
	private Long deptId;
	private Long orgId;
	private Boolean isactive;
	
	public Long getEmpDeptId() {
		return empDeptId;
	}
	public void setEmpDeptId(Long empDeptId) {
		this.empDeptId = empDeptId;
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
