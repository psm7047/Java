package ch04homework;

public class Exercise03 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i =100 ; i>0; i--) {
			if(i%3 == 0) {
				sum += i;
			}
		}
		
		System.out.println("3�� ����� ��: "+sum);
		

	}

}
