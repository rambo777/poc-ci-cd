package com.poc.userexceptions;

public class ServicesNotAvailable extends Exception {
	

	public ServicesNotAvailable() {
		super();
	}

	public ServicesNotAvailable(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ServicesNotAvailable(String message, Throwable cause) {
		super(message, cause);
	}

	public ServicesNotAvailable(String message) {
		super(message);
	}

	public ServicesNotAvailable(Throwable cause) {
		super(cause);
	}

}
