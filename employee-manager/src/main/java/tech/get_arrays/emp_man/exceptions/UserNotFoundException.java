package tech.get_arrays.emp_man.exceptions;

import java.io.Serial;

public class UserNotFoundException extends RuntimeException {

	@Serial
	private static final long serialVersionUID = -937755098003018337L;

	public UserNotFoundException(
			final String message) {

		super(message);
	}
}
