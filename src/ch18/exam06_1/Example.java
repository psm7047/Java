package ch18.exam06_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
//COPY���α׷�
public class Example {

	public static void main(String[] args) {
		
		String filePath1 = "D:\\MyProjects\\Java\\src\\ch18\\exam06_1\\photo2.jpg";
		String filePath2 = "D:\\MyProjects\\Java\\src\\ch18\\exam06_1\\photo3.jpg";
		
		try {
			//�о��
			InputStream is = new FileInputStream(filePath1);
			OutputStream os = new FileOutputStream(filePath2);
			
			//data�� ũ�⸦ �÷��� while������ ���� ���ư��� �ʰ� �Ѵ�.
			byte[] data = new byte[1024];
			int readNum = -1;
			//is.read(data) => ������ �о�ͼ� data�� ���� 
			//readNum���� data�� ����� total number of bytes ����
			while((readNum = is.read(data)) != -1) {
				System.out.println(readNum);
				//data�� 0���� readNum���� ���Ͽ� ����.
				os.write(data,0,readNum);
			}
			os.flush();
			
			is.close();
			os.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
