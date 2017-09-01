package com.poc.controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.poc.beans.EmployeeBean;
import com.poc.services.PocServices;
import com.poc.services.PocServicesImpl;
import com.poc.userexceptions.EmployeeDetailsNotFound;
import com.poc.userexceptions.ServicesNotAvailable;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginServlet() {  super();  }
	public void init(ServletConfig config) throws ServletException { }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		EmployeeBean user=(EmployeeBean)request.getAttribute("user");
		session.setAttribute("user", user);
		RequestDispatcher dispatcher;
		PocServices services=new PocServicesImpl();
		try {
			user = services.isValidUsernamePassword(user);
			session.setAttribute("user",user);
			if(user.getUserType().matches("valid")){	
				dispatcher=request.getRequestDispatcher("welcomePage.html");
				dispatcher.forward(request, response);
			}else{
				request.setAttribute("error","Username or Password is wrong !!");
				request.getRequestDispatcher("loginPage.jsp").forward(request, response);
			}
		} catch (ServicesNotAvailable e){
			request.setAttribute("error",e.getMessage());
			request.getRequestDispatcher("loginPage.jsp").forward(request, response);
		} catch (EmployeeDetailsNotFound e) {
			request.setAttribute("error",e.getMessage());
			request.getRequestDispatcher("loginPage.jsp").forward(request, response);
		}
	}
}
