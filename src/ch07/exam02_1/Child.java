package ch07.exam02_1;

public class Child extends Parent{

	//field
	//constructor	
	public Child(String firstName) {
		super("김",firstName);		//부모객체의 생성자가 매개변수를 가지고 있을 경우 super사용
		System.out.println("Child 객체 생성");
	}
	//method
	public void method2() {
		System.out.println("method2()실행");
	}
	
	
	
}
