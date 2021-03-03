package ch18.exam09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;

public class Example {

	public static void main(String[] args) {

		//Reader => �߻�Ŭ���� : ����� ���� �ڽ�Ŭ������ ���ؼ��� �ϼ��� �� �ִ�.
		String filePath = "D:\\Team4Projects\\Java\\src\\ch18\\exam09\\data.txt";
		try {

			//�ѱ� : 2byte
			Writer writer = new FileWriter(filePath);

			writer.write(new char[] {'A','��'});
			writer.write(new char[] {'B','��','C','D'}, 0, 2);
			writer.write("������ ������ ȭâ�մϴ�.");
			writer.flush();

			writer.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		} 


	}

}
