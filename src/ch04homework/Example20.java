package ch04homework;

import java.util.Scanner;

//BreakOutterExample
public class Example20 {

	//Outter 반복문 종료
	public static void main(String[] args)  {

		Outter : for(char upper='A';upper<='Z';upper++) {
			for(char lower='a';lower<='z';lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break Outter;
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}

}
