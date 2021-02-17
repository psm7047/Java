package ch04homework;

import java.util.Scanner;

public class BreakExample {

	//BreakExample
	//break 6나오면 while문 종료
	public static void main(String[] args)  {

		while(true) {
			int num = (int)(Math.random()*6) +1;	//1~6
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
		
	}

}
