package ch18.exam07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Example {

	public static void main(String[] args) {

		//Reader => �߻�Ŭ���� : ����� ���� �ڽ�Ŭ������ ���ؼ��� �ϼ��� �� �ִ�.
		String filePath = "D:\\Team4Projects\\Java\\src\\ch18\\exam07\\data.txt";
		try {
			//�ѱ� : 3byte
			/*FileInputStream fis = new FileInputStream(filePath);
			InputStreamReader reader = new InputStreamReader(fis,"UTF-8");*/

			//�ѱ� : 2byte
			Reader reader = new FileReader(filePath);

			//���1
			/*while(true) {
				int charCode = reader.read();
				if(charCode == -1) {
					break;
				}
				char charData = (char) charCode;
				System.out.println(charCode + " : " + charData);
			}*/
			
			//���2
			int charCode = -1;
			while((charCode = reader.read()) != -1) {
				char charData = (char) charCode;
				System.out.println(charCode + " : " + charData);
			}
			
			reader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		} 


	}

}
