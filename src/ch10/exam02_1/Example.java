package ch10.exam02_1;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {
			try {
				//value Ÿ�Կ� ���� ���� �Է��� ���� ��
				int value = Integer.parseInt(sc.nextLine());
				System.out.println("value : " + value);
			}catch(NumberFormatException e){
				System.out.println("���ڸ� �����մϴ�.");
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}finally {
				//finally�� : catch���� ������ ��� return�� �ص� �����
				System.out.println("�ٽ� �Է��ϼ���.");
			}
		}

	}

}
