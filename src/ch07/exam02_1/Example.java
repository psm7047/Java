package ch07.exam02_1;

public class Example {

	public static void main(String[] args) {
		
		//자식객체의 생성자에서 자동으로 부모 객체 생성
		Child child = new Child("길동");
		System.out.println(child.firstName);
		System.out.println(child.lastName);
		child.method();
		child.method2();

	}

}
