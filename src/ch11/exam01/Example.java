package ch11.exam01;

public class Example {

	public static void main(String[] args) {
		
		Member m1 = new Member("Winter","�ʰܿ�");
		Member m2 = new Member("Winter","�ʰܿ�");
	
		System.out.println(m1 == m2);
		System.out.println(m1.equals(m2));

	}

}
