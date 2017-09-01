package com.poc.doaservices;

import java.sql.SQLException;

import com.poc.beans.EmployeeBean;

public interface PocDaoServices {

	EmployeeBean getUserTypeAunthentication(EmployeeBean user) throws SQLException;

}
