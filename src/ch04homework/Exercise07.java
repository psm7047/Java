package ch04homework;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("------------------------------");
			System.out.print("����> ");
			
			String input = scanner.nextLine();
			int temp = 0;
			
			switch(input) {
			case "1" :
				System.out.print("���ݾ�> ");
				temp = Integer.parseInt(scanner.nextLine());
				balance += temp;
				System.out.println();
				break;
			case "2" :
				System.out.print("��ݾ�> ");
				temp = Integer.parseInt(scanner.nextLine());
				balance -= temp;
				System.out.println();
				break;
			case "3" :
				System.out.print("�ܰ�> " + balance);
				System.out.println();
				break;
			case "4" :
				System.out.println();
				System.out.println("���α׷� ����");
				return;
			}
		}

	}

}
