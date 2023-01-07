package org.abstrac;

public class AgeInvaliException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2470210446459733447L;

	@Override
	public String getMessage() {

		String message = "Age is not in Range";
		return message;
		
	}
}
