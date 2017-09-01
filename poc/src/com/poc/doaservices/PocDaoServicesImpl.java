package com.poc.doaservices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;




import java.sql.SQLException;

import com.poc.beans.EmployeeBean;



public class PocDaoServicesImpl implements PocDaoServices {
	private Connection con;
	public PocDaoServicesImpl() {
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			con=DriverManager.getConnection(  
			"jdbc:mysql://dbii.ci01tzeksium.ap-south-1.rds.amazonaws.com:3306/pocdb","root","black517");  
			System.out.println("connection build successfully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	@Override
	public EmployeeBean getUserTypeAunthentication(EmployeeBean user) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
			pstmt = con.prepareStatement("select password from userdetails where userId=?");
			pstmt.setString(1,user.getUserId().toLowerCase());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				String password = rs.getString(1);
					if(password.matches(user.getPassword())){
						user.setUserType("valid");
					}else user.setUserType("notvalid");
			}
			
			return user;	
		}finally{
			pstmt.close();
			rs.close();
			con.close();
		}
	}

}
