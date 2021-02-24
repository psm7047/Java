package ch10.exam06_1;

//일반 예외 사용자 정의 예외
public class BalanceLackException extends Exception{

	//생성자
	public BalanceLackException() {
		
	}
	//예외 메시지를 보내주기 위한 생성자
	public BalanceLackException(String message) {
		super(message);
	}
	
	
}
