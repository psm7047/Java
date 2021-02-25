package ch11.exam05_1;

import java.util.Arrays;

public class String1 {

	public static void main(String[] args) throws Exception{
		byte[] arr1 = {65,66,67};
		String str1 = new String(arr1);	//String 메소드 중 바이트 배열을 문자열로 바꿈
		System.out.println(str1);
		
		String str2 = "ABC";
		byte[] arr2 = str2.getBytes();	//바이트 배열로 바꿈
		System.out.println(Arrays.toString(arr2));	//배열 내용 출력
		
		String str3 = "가나다";
		byte[] arr31 = str3.getBytes("EUC-KR");	//바이트 배열로 바꿈
		byte[] arr32 = str3.getBytes("UTF-8");	
		System.out.println(Arrays.toString(arr31));
		System.out.println(Arrays.toString(arr32));
		
		String str4 = new String(arr31,"EUC-KR");	//글자로 다시 복원
		String str5 = new String(arr32,"UTF-8");
		
		System.out.println(str4);
		System.out.println(str5);
		
		

	}

}
