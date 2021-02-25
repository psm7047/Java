package ch11.exam02_1;

import java.util.Date;
//toString()
public class Example {

	public static void main(String[] args) {
		
		Object var1 = new Object();
		System.out.println(var1.toString());	//var1의 정보
		
		Date var2 = new Date();
		System.out.println(var2.toString());	//현재 시간
		
		String var3 = "abc";
		System.out.println(var3.toString());	//abc
		
		Member m1 = new Member("Spring", "벚꽃");
		System.out.println(m1.toString());		//id,name (재정의)
		
		String result = m1 + " => Summer : 바다";
		System.out.println(result);

	}

}
