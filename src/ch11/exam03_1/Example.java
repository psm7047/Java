package ch11.exam03_1;

public class Example {
//System
	public static void main(String[] args) {
		
		long start = System.nanoTime();
		method();
		long end = System.nanoTime();
		
		System.out.println("method() ���� �ð� : " + (end - start) + "ns");

	}
	
	public static void method() {
		long sum = 0;
		for(int i =0; i< 1000000; i++) {
			sum+=i;
		}
	}

}
