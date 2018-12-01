package com.huangsreservationsystem.filter;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.zip.GZIPOutputStream;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.filters.AddDefaultCharsetFilter.ResponseWrapper;

public class GzipFilter implements Filter {

	private FilterConfig config;

	public GzipFilter() {
	};

	public void init(FilterConfig filterConfig) throws ServletException {
		this.config = filterConfig;
	}

//	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
//			throws IOException, ServletException {
//		System.out.println("Inside of doFilter method of GzipFilter");
//		PrintWriter out;
//		
//		if(isGzipSupported((HttpServletRequest)req)) {
//			System.out.println("Gzip is supported");
//			out = getGzipWriter((HttpServletResponse) res);
//			((HttpServletResponse) res).setHeader("Content-Encoding", "gzip");
//			ResponseWrapper wrapper = new ResponseWrapper((HttpServletResponse) res, null);
//			chain.doFilter(req, wrapper);
//			out.print(wrapper.toString());
//			out.close();
//		} else {
//			chain.doFilter(req, res);
//		}
//		
//		System.out.println("Existing Gzip Filter");
//	}
//	
//	private PrintWriter getGzipWriter(HttpServletResponse res) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public boolean isGzipSupported(HttpServletRequest request) {
//		String encodings = request.getHeader("Accept-Encoding");
//		//return ((encodings != null) && (encoding.indexOf("gzip")!=-1));
//		return true;
//	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;

		System.out.println("Inside the dofilter at the GzipFilter");
		if (acceptsGZipEncoding(httpRequest)) {
			System.out.println("Do the Gziping");
			httpResponse.addHeader("Content-Encoding", "gzip");
			GZipServletResponseWrapper gzipResponse = new GZipServletResponseWrapper(httpResponse);
			chain.doFilter(request, gzipResponse);
			gzipResponse.close();
			
		} else {
			chain.doFilter(request, response);
		}
		System.out.println("Existing the GzipFilter");
	}

	private boolean acceptsGZipEncoding(HttpServletRequest httpRequest) {
		String acceptEncoding = httpRequest.getHeader("Accept-Encoding");

		return acceptEncoding != null && acceptEncoding.indexOf("gzip") != -1;
	}

}
