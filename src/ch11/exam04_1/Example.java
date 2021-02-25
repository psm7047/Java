package ch11.exam04_1;

public class Example {

	public static void main(String[] args) {
		
		Class var1 = A.class;	//A가 로딩된 번지(Class)
		
		A a = new A();
		Class var2 = a.getClass();	
		}

}
