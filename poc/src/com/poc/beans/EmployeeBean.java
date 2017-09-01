package com.poc.beans;
import java.io.Serializable;
public class EmployeeBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1434844701923123323L;
	String userId,userName,userType,emailAddress,empFirstName,empLastName,password;
	int empId;
	public EmployeeBean() {}
	public EmployeeBean(String userId, String password) {
		this.userId=userId;
		this.password=password;
	}
	/*public EmployeeBean(String userName, String userType, String emailAddress,
			String empFirstName, String empLastName) {
		this.userName = userName;
		this.userType = userType;
		this.emailAddress = emailAddress;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
	}*/
	
	public EmployeeBean(String userId, String userName, String userType,
			String emailAddress, String empFirstName, String empLastName) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userType = userType;
		this.emailAddress = emailAddress;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((emailAddress == null) ? 0 : emailAddress.hashCode());
		result = prime * result
				+ ((empFirstName == null) ? 0 : empFirstName.hashCode());
		result = prime * result
				+ ((empLastName == null) ? 0 : empLastName.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
		result = prime * result
				+ ((userType == null) ? 0 : userType.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeBean other = (EmployeeBean) obj;
		if (emailAddress == null) {
			if (other.emailAddress != null)
				return false;
		} else if (!emailAddress.equals(other.emailAddress))
			return false;
		if (empFirstName == null) {
			if (other.empFirstName != null)
				return false;
		} else if (!empFirstName.equals(other.empFirstName))
			return false;
		if (empLastName == null) {
			if (other.empLastName != null)
				return false;
		} else if (!empLastName.equals(other.empLastName))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userType == null) {
			if (other.userType != null)
				return false;
		} else if (!userType.equals(other.userType))
			return false;
		return true;
	}*/
	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userName=" + userName
				+ ", userType=" + userType + ", emailAddress=" + emailAddress
				+ ", empFirstName=" + empFirstName + ", empLastName="
				+ empLastName + ", password=" + password + "]";
	}

}