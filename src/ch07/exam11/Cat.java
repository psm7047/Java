package ch07.exam11;

public class Cat extends Animal {

	@Override
	public void sound() {		//추상메소드이므로 자식 클래스에서 정의 해주어야함
		System.out.println("야옹");
	}
	public void scratch() {
		System.out.println("할켜요");
	}

}
