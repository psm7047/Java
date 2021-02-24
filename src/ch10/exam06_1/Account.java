package ch10.exam06_1;

public class Account {

	//메소드거 호출된 곳에서 예외처리 => throws 
	//예외 발생 코드 => throw
	public void deposit(String account, int money) throws NoAccountException {
		
		if(account == null) {
			//예외 발생 코드
			throw new NoAccountException("입금 계좌가 없습니다.");
		}
		System.out.println("입금 성공");
	}
	//사용자 정의 예외처리, 메소드가 호출된 곳에서 예외 처리
	public void withdraw(String account , int money) 
			throws NoAccountException,BalanceLackException {
		int balance = 10000;
		if(account == null) {
			throw new NoAccountException("출금 계좌가 없습니다.");
		}
		else if(money>balance){
			throw new BalanceLackException("잔고가 부족합니다.");
		}else {
			System.out.println("출금 성공");
		}
	}
}
