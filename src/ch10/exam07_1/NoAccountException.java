package ch10.exam07_1;
//사용자 정의 예외 처리
public class NoAccountException extends RuntimeException{

	public NoAccountException() {
	}
	public NoAccountException(String message) {
		super(message);
	}
}
