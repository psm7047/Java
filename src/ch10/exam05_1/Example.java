package ch10.exam05_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example {

	public static void main(String[] args) {
		
		try {
			method("C:/file.txt");
		}catch(FileNotFoundException e) {
			System.out.println("������ �������� ����.");
		}

	}
	//ȣ���� ������ ����ó�� (throws)
	public static void method(String path) throws FileNotFoundException{
		FileInputStream fs = new FileInputStream(path);
	}

}
