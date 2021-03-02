package ch18.exam06_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
//COPY프로그램
public class Example {

	public static void main(String[] args) {
		
		String filePath1 = "D:\\MyProjects\\Java\\src\\ch18\\exam06_1\\photo2.jpg";
		String filePath2 = "D:\\MyProjects\\Java\\src\\ch18\\exam06_1\\photo3.jpg";
		
		try {
			//읽어옴
			InputStream is = new FileInputStream(filePath1);
			OutputStream os = new FileOutputStream(filePath2);
			
			//data의 크기를 늘려서 while문에서 많이 돌아가지 않게 한다.
			byte[] data = new byte[1024];
			int readNum = -1;
			//is.read(data) => 파일을 읽어와서 data에 저장 
			//readNum에는 data에 저장된 total number of bytes 저장
			while((readNum = is.read(data)) != -1) {
				System.out.println(readNum);
				//data의 0부터 readNum까지 파일에 쓴다.
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
