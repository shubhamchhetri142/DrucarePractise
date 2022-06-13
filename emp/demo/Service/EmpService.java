package com.emp.demo.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.demo.Model.Employees;
import com.emp.demo.Repository.EmpRepository;

@Service
public class EmpService {
	@Autowired
	EmpRepository empRepository;
	
	public List<Employees> employeesList=new ArrayList<>(Arrays.asList(
			new Employees(301,"Prince Mahesh Babu","SuperStar"),
			new Employees(302,"Aullu Arjun","StylistStar"),
			new Employees(303,"Prabhas","Rebel Star")));


	public List<Employees> getAllEmployees() {
//		return employeesList;
		//List<Employees> employeesList=new ArrayList<>();
		empRepository.findAll().forEach(employeesList::add);
		return employeesList;
		
	}
	
	public Employees getEmployee(Integer id) {
//		return employeesList.stream().filter(f->f.getId().equals(id)).findFirst().get();
		return empRepository.findById(id).get();
		
	}

	public void createEmployee(Employees employees) {
//		employeesList.add(employees);
		empRepository.save(employees);
	}

	public void updateEmployee(Integer id, Employees employees) {
//		for(int i=0;i<employeesList.size();i++) {
//			if(employeesList.get(i).getId().equals(id)) {
//				employeesList.set(i, employees);
//			}
//		}
		empRepository.save(employees);
	}

	public void deleteEmployee(Integer id) {
//		employeesList.removeIf(r->r.getId().equals(id));
		empRepository.deleteById(id);
	}
}
