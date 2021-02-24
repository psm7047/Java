package ch10.exam03_1;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] arr = new String[3];

		while(true) {
			try {
				System.out.print("���� ��ġ : ");
				//index Ÿ�԰� �ٸ� �Է��� ���ö�
				int index = Integer.parseInt(sc.nextLine());
				System.out.print("������ �� : ");
				//arr�� index���� ū ���ڰ� ������ ArrayIndexOutOfBoundsException 
				arr[index] = sc.nextLine();
			}catch(NumberFormatException e) {
				System.out.println("���ڸ� �Է��ϼ���.");
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("0~" + (arr.length-1) + "������ ���ڸ� �Է��ϼ���.");
			}
			finally {
				System.out.println("�ٽ� �Է��ϼ���.");
			}
		}

	}

}
