package com.drucare.app.practice.service;

import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {

	Boolean insertOrUpdateInBatch(SqlParameterSource[] sqlParameterSource);

}
