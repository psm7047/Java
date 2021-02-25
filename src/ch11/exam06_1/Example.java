package ch11.exam06_1;

import java.util.regex.Pattern;

public class Example {

	public static void main(String[] args) {
		//전화번호 체크		정규식 표현
		String regExp = "010-\\d{3,4}-\\d{4}";
		String data = "010-23-1234";
		boolean result = Pattern.matches(regExp, data);	//pattern 메소드
		if(result) {
			System.out.println("유효한 데이터");
		}else {
			System.out.println("잘못된 데이터");
		}
		
		//특수문자, 문자, 숫자가 들어간 8~15글자
		String regExp2 = ".*(?=^.{8,15}$)(?=.*\\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*";
		String passwd = "a#123456";
		boolean result2 = Pattern.matches(regExp2, passwd);
		System.out.println(result2);
		
	}

}
