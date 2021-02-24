package ch10.exam03_1;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] arr = new String[3];

		while(true) {
			try {
				System.out.print("저장 위치 : ");
				//index 타입과 다른 입력이 들어올때
				int index = Integer.parseInt(sc.nextLine());
				System.out.print("저장할 값 : ");
				//arr의 index보다 큰 숫자가 들어오면 ArrayIndexOutOfBoundsException 
				arr[index] = sc.nextLine();
			}catch(NumberFormatException e) {
				System.out.println("숫자를 입력하세요.");
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("0~" + (arr.length-1) + "까지의 숫자를 입력하세요.");
			}
			finally {
				System.out.println("다시 입력하세요.");
			}
		}

	}

}
