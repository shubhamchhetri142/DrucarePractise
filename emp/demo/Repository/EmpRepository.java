package com.emp.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.emp.demo.Model.Employees;

public interface EmpRepository extends CrudRepository<Employees,Integer>{

}
