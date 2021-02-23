package ch07.exam03_1;

public class Example {

	public static void main(String[] args) {
		
		
		Child child = new Child("길동");
		System.out.println(child.firstName);
		System.out.println(child.lastName);
		child.sound();			//자식 객체에서 재정의된 메소드 실행 -> 싫어요~~~

	}

}
