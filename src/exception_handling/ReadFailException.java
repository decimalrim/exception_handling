package exception_handling;

/**
 *  파일을 읽을 수 없을 때 발생하는 예외
 */

public class ReadFailException extends RuntimeException {
	

	private static final long serialVersionUID = 2588425091797741407L;

	public ReadFailException(String message) {
		super(message);
	}
	
	public ReadFailException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
