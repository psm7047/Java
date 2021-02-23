package ch07.exam11;

public class Dog extends Animal{

	@Override
	public void sound() {		//추상메소드이므로 자식 클래스에서 정의 해주어야함
		System.out.println("멍멍");
	}
	public void keepHome() {
		System.out.println("방범 활동을 해요");
	}

}
