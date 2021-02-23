package ch07.exam10;

public class Child extends Parent{

	//field
	public int field2;
	//constructor

	//method
	@Override
	public void method2() {
		System.out.println("child: method2() 호출");
	}
	public void method3() {
		System.out.println("child: method3() 호출");
	}

}
