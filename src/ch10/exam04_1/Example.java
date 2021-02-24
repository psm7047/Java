package ch10.exam04_1;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[3];
		
		while(true) {
			try {
				System.out.print("������ġ : ");
				//NumberFormatException 
				int index = Integer.parseInt(sc.nextLine());
				System.out.print("������ �� : ");
				//ArrayOutOfIndexException
				arr[index] = sc.nextLine();
			} catch(NumberFormatException e) {
				System.out.println("���ڸ� �����մϴ�.");
			}// NumberFormatException�� �ƴ� ��� Exception
			catch(Exception e) {
				System.out.println("0~" + (arr.length-1) + "���� �����մϴ�");
			}
			finally {
				System.out.println("�ٽ� �Է��ϼ���.");
			}
		}

	}

}
