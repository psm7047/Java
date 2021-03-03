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

		//Reader => 추상클래스 : 상속을 통해 자식클래스에 의해서만 완성될 수 있다.
		String filePath = "D:\\Team4Projects\\Java\\src\\ch18\\exam09\\data.txt";
		try {

			//한글 : 2byte
			Writer writer = new FileWriter(filePath);

			writer.write(new char[] {'A','한'});
			writer.write(new char[] {'B','글','C','D'}, 0, 2);
			writer.write("오늘은 날씨가 화창합니다.");
			writer.flush();

			writer.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		} 


	}

}
