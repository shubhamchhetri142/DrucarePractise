package com.drucare.employees.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drucare.employees.bean.Employees;
import com.drucare.employees.dao.EmployeeDao;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
		@Autowired
		EmployeeDao employeeDao;

		@Override
		public Boolean insertEmployeeDetails(Employees insertEmployeeReq) {
			return employeeDao.insertEmployeeDetails(insertEmployeeReq);
		}

		@Override
		public Boolean insertEmployeeDetailsByUsingMapSql(Employees insertEmployeeMapSqlReq) {
			return employeeDao.insertEmployeeDetails(insertEmployeeMapSqlReq);
		}

		@Override
		public Boolean insertEmployeeDetailsByBeanProperty(Employees insertEmployeeBeanPropertyReq) {
			return employeeDao.insertEmployeeDetailsByBeanProperty(insertEmployeeBeanPropertyReq);
		}
}
