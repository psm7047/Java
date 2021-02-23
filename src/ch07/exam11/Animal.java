package ch07.exam11;

public abstract class Animal {
	//추상 클래스 : 자식 클래스가 가지는 공통적인 필드와 메소드를 따로 선언
	public String name;
	public String kind;
	
	public void sleep() {
		System.out.println("잠을 잡니다.");
	}
	public void eat() {
		System.out.println("먹습니다.");
	}
	//추상메소드
	public abstract void sound(); 
}
