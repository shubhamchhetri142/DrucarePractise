package com.programpractice.practice;

public class EmployeeClass {
	private String empName;
	private Long empId;
	private Integer age;
	private Double salary;
	private String gender;
	private String department;
	
	
	@Override
	public String toString() {
		return "EmployeeClass [empName=" + empName + ", empId=" + empId + ", age=" + age + ", salary=" + salary
				+ ", gender=" + gender + ", department=" + department + "]";
	}
	public EmployeeClass(String empName, Long empId, Integer age, Double salary, String gender, String department) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
		this.department = department;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}
