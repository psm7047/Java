package ch11.exam02_1;

import java.util.Date;
//toString()
public class Example {

	public static void main(String[] args) {
		
		Object var1 = new Object();
		System.out.println(var1.toString());	//var1�� ����
		
		Date var2 = new Date();
		System.out.println(var2.toString());	//���� �ð�
		
		String var3 = "abc";
		System.out.println(var3.toString());	//abc
		
		Member m1 = new Member("Spring", "����");
		System.out.println(m1.toString());		//id,name (������)
		
		String result = m1 + " => Summer : �ٴ�";
		System.out.println(result);

	}

}
