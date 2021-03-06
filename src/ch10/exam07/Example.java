package ch10.exam07;

public class Example {

	public static void main(String[] args) {
		try {
		method();
		}catch(Exception e){
			//예외 메시지별로 예외 처리를 할 때 사용
			String message = e.getMessage();
			System.out.println(message);
			//디버깅할 때 사용할 수 있는 예외 정보
			System.out.println(e.toString());
			e.printStackTrace();
			
			//예외 발생 코드에 따라 처리
			if(message.contains("0001")) {
				//....
			}else {
				//....
			}
		}


	}
	//호출된 곳에서 예외처리
	public static void method() throws NoAccountException{
		//예외 발생 코드
		throw new NoAccountException("0001 입금 계좌가 없음");

	}

}
