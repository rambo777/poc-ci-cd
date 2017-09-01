package com.poc.services;
import java.sql.SQLException;
import com.poc.beans.EmployeeBean;
import com.poc.doaservices.PocDaoServices;
import com.poc.doaservices.PocDaoServicesImpl;
import com.poc.userexceptions.EmployeeDetailsNotFound;
import com.poc.userexceptions.ServicesNotAvailable;
public class PocServicesImpl implements PocServices {

	@Override
	public EmployeeBean isValidUsernamePassword(EmployeeBean user) throws ServicesNotAvailable, EmployeeDetailsNotFound {
	      PocDaoServices daoServices=new PocDaoServicesImpl();
	      
	try{	
			
		EmployeeBean employeeBean=daoServices.getUserTypeAunthentication(user);
		if(employeeBean.getUserType()==null)throw new EmployeeDetailsNotFound("Employee details not available ");
		return employeeBean;
	}catch (SQLException e){
		e.printStackTrace();
		throw new ServicesNotAvailable("Services not available !!",e);
	}
	}

	
}
