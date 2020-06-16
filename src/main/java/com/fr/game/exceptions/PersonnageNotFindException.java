package com.fr.game.exceptions;

public class PersonnageNotFindException extends ApplicationException {
	/**
	 * Constructor
	 *
	 */
	public PersonnageNotFindException() {
		super();
	}

	/**
	 * Constructor
	 *
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public PersonnageNotFindException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * Constructor
	 *
	 * @param message
	 * @param cause
	 */
	public PersonnageNotFindException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Constructor
	 *
	 * @param message
	 */
	public PersonnageNotFindException(String message) {
		super(message);
	}

	/**
	 * Constructors
	 *
	 * @param cause
	 */
	public PersonnageNotFindException(Throwable cause) {
		super(cause);
	}
}
