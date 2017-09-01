package com.poc.filter;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.poc.beans.EmployeeBean;
@WebFilter("/LoginServlet")
public class LoginFilter implements Filter {
      public LoginFilter() {   }
      public void destroy() {	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request2=(HttpServletRequest)request;
		HttpServletResponse response2=(HttpServletResponse)response;
		RequestDispatcher dispatcher;
		String password,userId;
		password=request.getParameter("password");
		userId=request.getParameter("userId");
		if(request2.getMethod().equalsIgnoreCase("POST")){
			
			if(userId.length()<6||userId.length()>6){
				request.setAttribute("error","Follow login credential  devops !!");
				dispatcher=request2.getRequestDispatcher("loginPage.jsp");
				dispatcher.forward(request2, response2);
			}else if(password.matches("")){
				request.setAttribute("error"," Enter the Password  !!");//
				dispatcher=request2.getRequestDispatcher("loginPage.jsp");
				dispatcher.forward(request2, response2);
			}
			else{
				EmployeeBean user=new EmployeeBean(userId, password);
				request.setAttribute("user",user);
				chain.doFilter(request, response);	
			}	
		}else request2.getRequestDispatcher("loginPage.jsp").forward(request2, response2);
		
	}
	public void init(FilterConfig fConfig) throws ServletException {	}


}
