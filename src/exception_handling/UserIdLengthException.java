package exception_handling;

/**
 * 8글자 미만의 아이디로 회원가입을 시도할 때 발생할 예외
 */

public class UserIdLengthException extends RuntimeException {
	

	private static final long serialVersionUID = 8610270869126757533L;

	public UserIdLengthException(String message) {
		super(message);
	}
	
	public UserIdLengthException(String message, Throwable cause) {
		super(message, cause);
	}

}
