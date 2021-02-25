package ch11.exam05_1;

import java.util.StringTokenizer;

public class String2 {

	public static void main(String[] args) {
		
		//어떤 위치에 문자 1개를 얻기
		String ssn = "123456-1234567";
		char sex = ssn.charAt(7);
		if(sex == '1' && sex =='3') {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
		//문자열 잘라내기 : 방법1
		String first = ssn.substring(0,6);	//0~5번째
		String second = ssn.substring(7);	//7번쨰부터 그 후
		System.out.println(first);
		System.out.println(second);
		
		//문자열 잘라내기 : 방법2
		String[] parts = ssn.split("-");
		System.out.println(parts[0]); 	//"-" 앞
		System.out.println(parts[1]);  	//"-" 뒤
		
		//문자열 분리하기 : 방법3
		StringTokenizer st = new StringTokenizer(ssn,"-");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		//포함 여부 : 방법1
		String content = "이것은 자바 책입니다.";
		boolean result = content.contains("자바");
		System.out.println(result);
		
		//포함 여부 : 방법2
		int index = content.indexOf("자바");
		if(index != -1) {
			System.out.println("자바 관련 책이군요");
		}else {
			System.out.println("자바 관련 책이 아니군여.");
		}
		
		//길이
		int length = content.length();
		System.out.println(length);
		
		//대치하기
		String content2 = content.replace("자바", "java");	//새로운 String에 저장
		System.out.println(content2);
		
		
		

	}

}
