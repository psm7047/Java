package ch07.exam10;

public class Example {

	public static void main(String[] args) {
		
		
		Parent parent = new Child();	//자동 형변환(강제형변환을 위해 필요함)
		parent.field1 = 5;
		parent.method1();
		parent.method2();	//child method2(오버라이딩)
		
		Child child = (Child) parent;		//강제 형변환
		
		child.field1=5;
		child.field2=5;
		child.method1();
		child.method2();
		child.method3();

	
	}

}
