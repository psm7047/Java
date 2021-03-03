package ch18.exam12;

import java.io.IOException;
import java.io.OutputStream;

public class Example {

	public static void main(String[] args) {

		//System.out => OutputStream타입 .err => 빨강색으로 출력
		try {
			OutputStream os = System.out;
			os.write(65);
			os.write(new byte[] {66,67,68});
			os.write(new byte[] {66,67,68}, 0 , 2);
			os.flush();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}

}
