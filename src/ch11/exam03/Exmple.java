package ch11.exam03;

public class Exmple {

	public static void main(String[] args) {
		
		long start = System.nanoTime();
		method();
		long end = System.nanoTime();
		
		System.out.println("����ð�: " + (end-start) + "ms");
		

	}
	
	public static void method() {
		long sum = 0;
		for(int i=0; i<1000000; i++) {
			sum+=i;
		}
	}

}
