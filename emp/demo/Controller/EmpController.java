package com.emp.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.emp.demo.Model.Employees;
import com.emp.demo.Service.EmpService;

@RestController
public class EmpController {
	
	@Autowired
	EmpService empService;
	
	@RequestMapping("/getDetails")
	public List<Employees> getAllEmployees(){
		return empService.getAllEmployees();
	}
	@RequestMapping("/getDetails/{empId}")
	public Employees getEmployee(@PathVariable Integer empId) {
		return empService.getEmployee(empId);
	}
	@RequestMapping(method = RequestMethod.POST,value="/getDetails")
	public void createEmployee(@RequestBody Employees employees) {
		empService.createEmployee(employees);
	}
	@RequestMapping(method = RequestMethod.PUT,value="/getDetails/{id}")
	public void updateEmployee(@RequestBody Employees employees,@PathVariable Integer id) {
		empService.updateEmployee(id,employees);
	}
	@RequestMapping(method = RequestMethod.DELETE,value="/getDetails/{id}")
	public void deleteEmployee(@PathVariable Integer id) {
		empService.deleteEmployee(id);	
	}
}
