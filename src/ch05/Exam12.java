package ch05;

public class Exam12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Season nowSeason = Season.WINTER;
		if(nowSeason == Season.SUMMER) {
			System.out.println("맞습니다.");
		}else {
			System.out.println("아닙니다.");
		}
		System.out.println(nowSeason);

		//가독성 높임, 오타로 인한 오류 줄임
		LoginResult loginResult = LoginResult.FAILURE_ID;
		if(loginResult == LoginResult.SUCCESS) {
			System.out.println("로그인 성공했군요.");
		}else if(loginResult == LoginResult.FAILURE_ID) {
			System.out.println("아이디를 다시 입력하세요.");
		}else {
			System.out.println("패스워드가 틀립니다.");

		}
	}
}