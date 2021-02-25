package ch11.exam01_1;

public class Example {

	public static void main(String[] args) {
	
		Member m1 = new Member("Winter","늦겨울");
		Member m2 = new Member("Winter","늦겨울");
		
		System.out.println(m1 == m2); 	//false 번지 비교
		System.out.println(m1.equals(m2)); 	//true	id,name비교
	}

}
