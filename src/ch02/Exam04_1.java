package ch02;

public class Exam04_1 {

	public static void main(String[] args) {
		
		//문자열 => 숫자(정수, 실수)
		
		//문자열은 String 타입 변수에 저장한다.
		String var1 = "10";	
		
		//문자열과 숫자가 + 되면 문자열로 결합
		String var2 = var1 + 5;		//105
		
		//문자열을 정수로 변경해서 연산
		int var3 = Integer.parseInt(var2) + 10;	//115
		
		//문자열을 실수로 변경해서 연산
		double var4 = Double.parseDouble(var2);	//105.0
		double var5 = Double.parseDouble(var2) + 1.2;	//106.2
		
		//숫자 => 문자열
		int var6 = 10;
		//방법1
		String var7 = ""+var6;
		
		//방법2
		String var8 = String.valueOf(var6);

	}

}
