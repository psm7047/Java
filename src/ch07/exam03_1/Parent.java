package ch07.exam03_1;

public class Parent {

	//field
	public String lastName;
	public String firstName;
	//constructor
	public Parent(String lastName, String firstName) {
		System.out.println("Parent 객체 생성");
		this.lastName = lastName;
		this.firstName = firstName;
				
	}
	//method
	public void sound() {
		System.out.println("공부해라~~");
	}
	
	
	
}
