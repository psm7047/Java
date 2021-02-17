package ch04homework;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택> ");
			
			String input = scanner.nextLine();
			int temp = 0;
			
			switch(input) {
			case "1" :
				System.out.print("예금액> ");
				temp = Integer.parseInt(scanner.nextLine());
				balance += temp;
				System.out.println();
				break;
			case "2" :
				System.out.print("출금액> ");
				temp = Integer.parseInt(scanner.nextLine());
				balance -= temp;
				System.out.println();
				break;
			case "3" :
				System.out.print("잔고> " + balance);
				System.out.println();
				break;
			case "4" :
				System.out.println();
				System.out.println("프로그램 종료");
				return;
			}
		}

	}

}
