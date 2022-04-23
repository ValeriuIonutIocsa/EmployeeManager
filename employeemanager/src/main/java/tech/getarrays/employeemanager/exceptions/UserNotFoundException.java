package tech.getarrays.employeemanager.exceptions;

public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(
            final String message) {
		super(message);
	}
}
