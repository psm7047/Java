package ch18.exam13_1;

import java.io.Console;
//cmd���� ����
public class Example {

	public static void main(String[] args) {
	
		Console console = System.console();
		
		System.out.print("���̵� : " );
		String id = console.readLine();
		
		System.out.print("��й�ȣ : ");
		String password = new String(console.readPassword());
		
		System.out.println(id);
		System.out.println(password);
		

	}

}
