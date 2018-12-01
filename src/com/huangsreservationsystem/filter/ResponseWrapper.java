package com.huangsreservationsystem.filter;

import java.io.*;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class ResponseWrapper extends HttpServletResponseWrapper{
	StringWriter writer = new StringWriter();
	
	public ResponseWrapper(HttpServletResponse response) {
		super(response);
	}
	
	public PrintWriter getWriter() {
		return new PrintWriter(writer);
	}
	
	public String toString() {
		return writer.toString();
	}
}
