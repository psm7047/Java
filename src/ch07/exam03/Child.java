package ch07.exam03;

public class Child extends Parent{

	//field
	//constructor
	public Child(String firstName) {
		super("±è",firstName);	//ÀÚµ¿ 
		System.out.println("Child °´Ã¼ »ý¼º");
	}
	//method
	public void method2() {
		System.out.println("method2()½ÇÇà");
	}
	
	@Override
	public void sound() {
		System.out.println("½È¾î¿ä~~~");
	}

}
