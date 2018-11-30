package com.huangsreservationsystem.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TrackingFilter implements Filter{
	
	private ServletContext context;

	public void init(FilterConfig fConfig) throws ServletException {
		this.context = fConfig.getServletContext();
		this.context.log("AuthenticationFilter initialized");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)throws ServletException,IOException{
		System.out.println("Inside of the doFilter doFilter method");
		
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		String uri = req.getRequestURI();
		this.context.log("Requested Resource::"+uri);

		HttpSession session = req.getSession(false);

//		if(session == null && !(uri.endsWith("xhtml") || uri.endsWith("LoginController"
//		))){
//			System.out.println("Blocking access");
//			this.context.log("Unauthorized access request");
//			res.sendRedirect("jsf/index.xhtml");
//		}else{
//			// pass the request along the filter chain
//			chain.doFilter(request, response);
//		}
		
		if(uri.endsWith("index.xhtml")) {
			//pass the request
			chain.doFilter(request, response);
		}else {
			//deny access
			System.out.println("Deny access");
		}
		
		System.out.println("Exit the tracking filter.");
	}
	
	
}
