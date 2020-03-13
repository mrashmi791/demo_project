package com.spring.exception;

public class MainException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MainException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

	public MainException(String arg0, Throwable arg1) {
		
		//save information in db ...
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public MainException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public MainException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

}

class MainExceptionExample {
	public static void main(String a[]) throws MainException {
		try {
			int x = 10 / 0;
		} catch (ArithmeticException e) {
			
			throw new MainException("Thsi is ocuur due to devide by zero..", e);
		}
	}
}