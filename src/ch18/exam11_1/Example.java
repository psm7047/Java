package ch18.exam11_1;

import java.io.IOException;
import java.io.InputStream;

public class Example {

	public static void main(String[] args) {
		
		//System.in => InputStreamŸ�� , read()
		
		try {
			InputStream is = System.in;
			while(true) {
				//�ѱ� �Է� x : ���� + �����̱� ������ �Ѱ��� ���ڷ� ���� ����
				int keyCode = is.read();
				System.out.println(keyCode);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
