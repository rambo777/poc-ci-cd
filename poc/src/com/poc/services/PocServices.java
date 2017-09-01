package com.poc.services;

import com.poc.beans.EmployeeBean;
import com.poc.userexceptions.EmployeeDetailsNotFound;
import com.poc.userexceptions.ServicesNotAvailable;

public interface PocServices {

	EmployeeBean isValidUsernamePassword(EmployeeBean user) throws ServicesNotAvailable, EmployeeDetailsNotFound;

	

}
