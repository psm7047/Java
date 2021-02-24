package ch10.exam01_1;

import java.io.FileInputStream;

public class Example {

	public static void main(String[] args) {

		int[] arr = null;
		//nullPointerException	=> 실행 예외( 컴파일러가 체크하지 않음, 개발자의 경험에 의해서 예외처리)
		
		arr[0] = 10;	// => arr 배열 선언x

		int[] arr1 = new int[3];
		arr1[0] = 10;
		
		System.out.println(arr1[0]);
		
		//FileNotFoundException  => 일반 예외 (컴파일러가 예외처리를 했는지 안했는지 체크, 컴파일 오류)
		//FileInputStream fs = new FileInputStream("C:/Temp/file.txt");

	}

}
