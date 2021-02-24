package ch10.exam06_1;

//실행 예외 사용자 정의 메소드
public class NoAccountException extends RuntimeException{

	//기본 생성자
	public NoAccountException() {
	}
	//예외 메시지를 전달하기 위한 생성자
	public NoAccountException(String message) {
		super(message);
	}
}
