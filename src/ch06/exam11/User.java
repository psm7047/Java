package ch06.exam11;

public class User {

	//field
	String id;
	String name;
	String password;
	static String nation = "한국";	//static: 객체를 만들지 않아도 사용 가능
	
	//constructor 인스턴스 멤버x
	User(String name) {
		this.name = name;
	}
	//method
	
	static void info() {	//static: 객체가 없어도 사용할 수 있느 메소드
		
		System.out.println("모든 User는 한국인입니다.");
	}
	void login() {	//객체가 있어야 사용할 수 있는 메소드
		System.out.println(name + "님이 로그인합니다.");
	}
	
	void logout() {
		System.out.println(name + "님이 로그아웃합니다.");
	}
	
}
