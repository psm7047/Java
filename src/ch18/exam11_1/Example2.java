package ch18.exam11_1;

import java.io.IOException;
import java.io.InputStream;

public class Example2 {

	public static void main(String[] args) {
		
		//System.in => InputStreamŸ�� , read()
		
		try {
			InputStream is = System.in;
			byte[] data = new byte[100];
			
			while(true) {
				int readNum = is.read(data);
				String str = new String(data, 0, readNum - 2);	//���� Ű�ڵ� 2�� ����
				System.out.println(str);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
