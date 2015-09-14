package com.sfa.ghs.bar.exception;

public class BarServiceException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	private String messageKey;
	private String[] messageArgs;

	public BarServiceException() {
		super();
	}

	public BarServiceException(String message) {
		super(message);
	}

	public BarServiceException(Throwable throwable) {
		super(throwable);
	}

	public BarServiceException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public BarServiceException(String messageKey, String message) {
		super(message);
		this.messageKey = messageKey;
	}

	public BarServiceException(String messageKey, String messageArgs,
			String message) {
		super(message);
		this.messageKey = messageKey;
		this.messageArgs = new String[] { messageArgs };
	}

	public BarServiceException(String messageKey, String[] messageArgs,
			String message) {
		super(message);
		this.messageKey = messageKey;
		this.messageArgs = messageArgs;
	}

	public String getMessageKey() {
		return messageKey;
	}

	public String[] getMessageArgs() {
		return messageArgs;
	}
}
