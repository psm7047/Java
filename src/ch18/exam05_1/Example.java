package ch18.exam05_1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Example {

	public static void main(String[] args) {
		
		String filePath = "D:\\MyProjects\\Java\\src\\ch18\\exam05_1\\data.txt";
		try {
			OutputStream os = new FileOutputStream(filePath);
			byte[] arr = {65, 66, 67};
			//ABC
			os.write(arr);
			//arr배열의 index 0 부터 arr길이까지의 데이터를 쓴다. ABC
			os.write(arr,0,arr.length);
			os.flush();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
