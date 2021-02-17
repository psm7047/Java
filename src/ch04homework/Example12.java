package ch04homework;

public class Example12 {

	//ForSumFrom1To100Example
	public static void main(String[] args) {
		
		int sum = 0;
		
		int i = 0;
		for(i=1; i<=100; i++) {		
			sum +=i;
		}		// i == 101
		
		System.out.println("1~" +(i-1)+"гу :"+ sum);

	}

}
