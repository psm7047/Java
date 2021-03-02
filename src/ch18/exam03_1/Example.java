package ch18.exam03_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

public class Example {

	public static void main(String[] args) {

		String filePath = "D:\\MyProjects\\Java\\src\\ch18\\exam02\\data.txt";
		try {
			InputStream is = new FileInputStream(filePath);

			byte[] data = new byte[8];
			int readNum = -1;
			//data에 index 2부터 3개의 데이터 읽어옴
			while((readNum = is.read(data, 2, 3)) != -1) {
				System.out.println(readNum + " : " + Arrays.toString(data));
			}
			
			is.close();
		} catch (Exception e) {

			e.printStackTrace();
		}


	}

}
