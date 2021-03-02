package ch18.exam02_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

public class Example {

	public static void main(String[] args) {

		String filePath = "D:\\MyProjects\\Java\\src\\ch18\\exam02\\data.txt";
		try {
			InputStream is = new FileInputStream(filePath);

			byte[] data = new byte[3];
			
			//���1
			/*while(true) {
				//data ���̰� 3�̹Ƿ� 3�� �о��
				int readNum = is.read(data);
				if(readNum == -1) { break; }
				System.out.println(readNum + " : " + Arrays.toString(data));
			}*/
			
			//���2
			
			int readNum = -1;
			//data���̸�ŭ �о��
			while((readNum = is.read(data)) != -1) {
				System.out.println(readNum + " : " + Arrays.toString(data));
			}
			
			is.close();
		} catch (Exception e) {

			e.printStackTrace();
		}


	}

}
