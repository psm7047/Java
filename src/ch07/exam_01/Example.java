package ch07.exam_01;

public class Example {

	public static void main(String[] args) {
		
		//자식 객체는 부모 객체 모두 사용 가능
		Child ch = new Child();
		//부모 객체는 자식 객체 사용 X
		Parent pa = new Parent();
		
		ch.field1 = 10;
		ch.field2 = 10;
		ch.method();
		ch.method2();
	
	}

}
