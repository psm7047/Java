package ch06.exam10;

public class Example {

	public static void main(String[] args) {
		
		Changer ch = new Changer();
		
		//call by value(값을 복사해서 호출)
		int v1 = 1;
		ch.change(v1);
		System.out.println(v1);
		
		//call by reference(번지를 복사해서 호출) 바뀌지 않음 
		String v3 = "A";
		ch.change(v3);
		System.out.println(v3);
		
		//call by reference(번지를 복사해서 호출) 바뀜
		int[] arr1 = {0,0,0};
		ch.change(arr1); 
		System.out.println(arr1[0]);
		
		String[] arr3 = {"A","B","C"};
		ch.change(arr3);
		System.out.println(arr3[0]);
		
		//call by reference(번지를 복사해서 호출) 바뀜
		Member m1 = new Member();
		System.out.println(m1.age);
		ch.change(m1);
		System.out.println(m1.age);

	}

}
