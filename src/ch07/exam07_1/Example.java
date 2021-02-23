package ch07.exam07_1;

public class Example {

	public static void main(String[] args) {
		
		//메소드 override
		Child child = new Child();
		child.method1();	//Parent method1
		child.method2();	//재정의 된 Child method2
		child.method3();	//Child method3
		
		Parent parent = child;
		//Parent parent = new Child();
		
		parent.method1();
		parent.method2();		//재정의 된 child method2 호출
	
	}

}
