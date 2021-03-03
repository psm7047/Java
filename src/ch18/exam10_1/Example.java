package ch18.exam10_1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Example {
	
	public static void main(String[] args) {

		//Reader => �߻�Ŭ���� : ����� ���� �ڽ�Ŭ������ ���ؼ��� �ϼ��� �� �ִ�.
		String filePath1 = "D:\\Team4Projects\\Java\\src\\ch18\\exam10_1\\data.txt";
		String filePath2 = "D:\\Team4Projects\\Java\\src\\ch18\\exam10_1\\data2.txt";
		//data�� �о�� data2�� ����
		try {
			Reader reader = new FileReader(filePath1);
			Writer writer = new FileWriter(filePath2);
			
			char[] data = new char[1024];
			int readNum = -1;
			while((readNum = reader.read(data)) != -1) {
				writer.write(data,0,readNum);
				
			}
			writer.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}