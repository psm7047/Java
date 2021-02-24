package ch10.exam02_1;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {
			try {
				//value 타입에 맞지 않은 입력이 들어올 때
				int value = Integer.parseInt(sc.nextLine());
				System.out.println("value : " + value);
			}catch(NumberFormatException e){
				System.out.println("숫자만 가능합니다.");
				System.out.println("프로그램을 종료합니다.");
				return;
			}finally {
				//finally문 : catch에서 오류를 잡고 return을 해도 실행됨
				System.out.println("다시 입력하세요.");
			}
		}

	}

}
