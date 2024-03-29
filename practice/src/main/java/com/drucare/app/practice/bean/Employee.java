package com.drucare.app.practice.bean;

import java.util.List;

public class Employee {
	private Integer orgId;
	private Long empId;
	private String firstNm;
	private String middleNm;
	private String lastNm;
	private String gender;
	private String mobileNo;
	private String alterMobileNo;
	private Double salary;
	private String emailId;
	private String empCode;
	private String addressLine1;
	private String addressLine2;
	private String stateNm;
	private String cityNm;
	private String countryNm;
	private String pinCode;
	private String qualification;
	private String experience;
	private String bloodGroup;
	private Boolean isActive;
	private List<EmployeeDeptBean> departmentList;
	private List<EmployeeDesignationBean> designationList;
	public Integer getOrgId() {
		return orgId;
	}
	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getFirstNm() {
		return firstNm;
	}
	public void setFirstNm(String firstNm) {
		this.firstNm = firstNm;
	}
	public String getMiddleNm() {
		return middleNm;
	}
	public void setMiddleNm(String middleNm) {
		this.middleNm = middleNm;
	}
	public String getLastNm() {
		return lastNm;
	}
	public void setLastNm(String lastNm) {
		this.lastNm = lastNm;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAlterMobileNo() {
		return alterMobileNo;
	}
	public void setAlterMobileNo(String alterMobileNo) {
		this.alterMobileNo = alterMobileNo;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getEmpCode() {
		return empCode;
	}
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getStateNm() {
		return stateNm;
	}
	public void setStateNm(String stateNm) {
		this.stateNm = stateNm;
	}
	public String getCityNm() {
		return cityNm;
	}
	public void setCityNm(String cityNm) {
		this.cityNm = cityNm;
	}
	public String getCountryNm() {
		return countryNm;
	}
	public void setCountryNm(String countryNm) {
		this.countryNm = countryNm;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public List<EmployeeDeptBean> getDepartmentList() {
		return departmentList;
	}
	public void setDepartmentList(List<EmployeeDeptBean> departmentList) {
		this.departmentList = departmentList;
	}
	public List<EmployeeDesignationBean> getDesignationList() {
		return designationList;
	}
	public void setDesignationList(List<EmployeeDesignationBean> designationList) {
		this.designationList = designationList;
	}	
}
