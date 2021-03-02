package ch18.exam01_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Example {

	public static void main(String[] args) {

		String filePath = "D:\\MyProjects\\Java\\src\\ch18\\exam01\\data.txt";

		//颇老 佬绢坷扁
		try {
			InputStream is = new FileInputStream(filePath);

			//规过1
			/*while(true) {
				int data = is.read();
				if(data == -1) {
					break;
				}
				System.out.println(data);
			}*/

			//规过2
			int data = -1;
			while((data = is.read()) != -1) {
				System.out.println(data);
			}

			is.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
