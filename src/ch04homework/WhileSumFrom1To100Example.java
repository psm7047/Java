package ch04homework;

public class WhileSumFrom1To100Example {

	//WhileSumFrom1To100Example
	public static void main(String[] args) {
		
		//while������ 1~100������ ��
		int sum = 0;
		
		int i=1;
		
		while(i<=100) {
			sum +=i;
			i++;
		}
		
		System.out.println("1~" + (i-1) + " �� : " + sum);
		
		

	}

}