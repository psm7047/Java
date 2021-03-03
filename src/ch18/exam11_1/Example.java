package ch18.exam11_1;

import java.io.IOException;
import java.io.InputStream;

public class Example {

	public static void main(String[] args) {
		
		//System.in => InputStream타입 , read()
		
		try {
			InputStream is = System.in;
			while(true) {
				//한글 입력 x : 자음 + 모음이기 때문에 한개의 문자로 읽지 못함
				int keyCode = is.read();
				System.out.println(keyCode);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
