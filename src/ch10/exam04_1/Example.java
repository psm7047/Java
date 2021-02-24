package ch10.exam04_1;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[3];
		
		while(true) {
			try {
				System.out.print("저장위치 : ");
				//NumberFormatException 
				int index = Integer.parseInt(sc.nextLine());
				System.out.print("저장할 값 : ");
				//ArrayOutOfIndexException
				arr[index] = sc.nextLine();
			} catch(NumberFormatException e) {
				System.out.println("숫자만 가능합니다.");
			}// NumberFormatException이 아닌 모든 Exception
			catch(Exception e) {
				System.out.println("0~" + (arr.length-1) + "까지 가능합니다");
			}
			finally {
				System.out.println("다시 입력하세요.");
			}
		}

	}

}
