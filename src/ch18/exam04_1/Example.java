package ch18.exam04_1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Example {

	public static void main(String[] args) {
		
		String filePath = "D:\\MyProjects\\Java\\src\\ch18\\exam04\\data.txt";
		//파일을 생성(쓰기)
		try {
			OutputStream os = new FileOutputStream(filePath);
			os.write(65);
			os.write(66);
			os.write(67);
			//버퍼에 잔류하는 모든 문자열 출력
			os.flush();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
