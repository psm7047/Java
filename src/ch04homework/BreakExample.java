package ch04homework;

import java.util.Scanner;

public class BreakExample {

	//BreakExample
	//break 6������ while�� ����
	public static void main(String[] args)  {

		while(true) {
			int num = (int)(Math.random()*6) +1;	//1~6
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("���α׷� ����");
		
	}

}
