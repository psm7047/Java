package ch04homework;

import java.util.Scanner;

//ContinueExample
public class Example21 {

	//continue 사용한 for문
	public static void main(String[] args)  {

		for(int i =1; i<=10; i++) {
			if(i%2 != 0) {
				continue;	//홀수면 건너뜀
			}
			System.out.println(i);
		}
		
	}

}
