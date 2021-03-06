package ch11.exam05;

import java.util.Arrays;

public class String01 {
	public static void main(String[] args) throws Exception{
		byte[] arr1 = {65, 66, 67};		//a,b,c => 문자셋 번호
		String str1 = new String(arr1);		//String 메소드 중 바이트 배열을 문자열로 바꿈
		System.out.println(str1);
		
		String str2 = "ABC";
		byte[] arr2 = str2.getBytes();
		System.out.println(Arrays.toString(arr2));
		
		
		String str3 = "가나다";
		byte[] arr31 = str3.getBytes("EUC-KR");
		byte[] arr32 = str3.getBytes("UTF-8");
		System.out.println(Arrays.toString(arr31));
		System.out.println(Arrays.toString(arr32));
		
		String str4 = new String(arr31,"EUC-KR");		//글자로 다시 복원
		String str5 = new String(arr32,"UTF-8");		//글자로 다시 복원
		
		System.out.println(str4);
		System.out.println(str5);
	}
}
