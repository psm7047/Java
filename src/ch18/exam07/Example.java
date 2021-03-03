package ch18.exam07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Example {

	public static void main(String[] args) {

		//Reader => 추상클래스 : 상속을 통해 자식클래스에 의해서만 완성될 수 있다.
		String filePath = "D:\\Team4Projects\\Java\\src\\ch18\\exam07\\data.txt";
		try {
			//한글 : 3byte
			/*FileInputStream fis = new FileInputStream(filePath);
			InputStreamReader reader = new InputStreamReader(fis,"UTF-8");*/

			//한글 : 2byte
			Reader reader = new FileReader(filePath);

			//방법1
			/*while(true) {
				int charCode = reader.read();
				if(charCode == -1) {
					break;
				}
				char charData = (char) charCode;
				System.out.println(charCode + " : " + charData);
			}*/
			
			//방법2
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
