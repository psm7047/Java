package ch04;

public class Exam08 {

	public static void main(String[] args) {

		int sum = 0;
		int i = 1;
		
		for(; i<=10; i++) {		
			int value = i;		//for문 안에서만 사용 가눙
			sum += i;
		
		}
		System.out.println("1~" + i + " : " + sum);
	}

}
