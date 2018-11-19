package com.huangsreservationsystem.service;

public class ServiceLoadException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8301611654664633538L;

	public ServiceLoadException(final String inputMessage,final Throwable exception) {
		super(inputMessage,exception);
	}

}
