package ch07.exam;

public class Child extends Parent{

	//field
	public int field2;
	//constructor
	public Child() {
		super();	//자동 
		System.out.println("Child 객체 생성");
	}
	//method
	public void method2() {
		System.out.println("method2()실행");
	}
	
	
	
}
