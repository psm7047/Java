package ch04;

import java.util.Scanner;

public class Exam15 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while(true) {

			//Ű���忡�� �Է��� ������ data ������ ����
			System.out.print("�Է�: ");
			String data = scanner.nextLine();

			//data ������ ���� ���
			System.out.println("���: " + data);
			
			//���� ����
			if(data.equals("���ɽð�")) {
				break;
			}
		}

	}

}
