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
			
			//방법1
			/*while(true) {
				//data 길이가 3이므로 3개 읽어옴
				int readNum = is.read(data);
				if(readNum == -1) { break; }
				System.out.println(readNum + " : " + Arrays.toString(data));
			}*/
			
			//방법2
			
			int readNum = -1;
			//data길이만큼 읽어옴
			while((readNum = is.read(data)) != -1) {
				System.out.println(readNum + " : " + Arrays.toString(data));
			}
			
			is.close();
		} catch (Exception e) {

			e.printStackTrace();
		}


	}

}
