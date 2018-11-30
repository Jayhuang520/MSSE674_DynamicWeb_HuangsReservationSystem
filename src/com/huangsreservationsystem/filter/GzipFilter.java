package com.huangsreservationsystem.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GzipFilter implements Filter{
	

	private FilterConfig config;
	
	public GzipFilter() {};

	public void init(FilterConfig filterConfig) throws ServletException{
		this.config = filterConfig;
	}
	
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Inside of doFilter method of GzipFilter");
		PrintWriter out;
		
		if(isGzipSupported((HttpServletRequest)req)) {
			System.out.println("Gzip is supported");
			out = getGzipWriter((HttpServletResponse) res);
			((HttpServletResponse) res).setHeader("Content-Encoding", "gzip");
			//ResponseWrapper wrapper = new ResponseWrapper((HttpServletResponse) res);
		}
	}
	
	private PrintWriter getGzipWriter(HttpServletResponse res) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isGzipSupported(HttpServletRequest request) {
		String encodings = request.getHeader("Accept-Encoding");
		//return ((encodings != null) && (encoding.indexOf("gzip")!=-1));
		return true;
	}

}
