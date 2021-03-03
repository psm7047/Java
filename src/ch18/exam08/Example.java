package ch18.exam08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

public class Example {

	public static void main(String[] args) {

		//Reader => �߻�Ŭ���� : ����� ���� �ڽ�Ŭ������ ���ؼ��� �ϼ��� �� �ִ�.
		String filePath = "D:\\Team4Projects\\Java\\src\\ch18\\exam08\\data.txt";
		try {

			//�ѱ� : 2byte
			Reader reader = new FileReader(filePath);

			char[] data = new char[1024];
			int readNum = -1;
			String str = "";
			while((readNum = reader.read(data)) != -1) {
				//�׳� data�� ������ ���� '��' �� ��µ�
				str += new String(data,0,readNum);
			}
			System.out.println(str);

			reader.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		} 


	}

}
