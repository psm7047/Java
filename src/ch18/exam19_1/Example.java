package ch18.exam19_1;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

public class Example {

	public static void main(String[] args) throws Exception {
		
		String filePath = "D:\\Team4Projects\\Java\\src\\ch18\\exam19\\data.txt";
		OutputStream os = new FileOutputStream(filePath);
		
		String data1 = "�ȳ��ϼ���.";
		String data2 = "���� ���Ŀ�.";
		/*
		os.write(data1.getBytes());
		os.write("\n".getBytes());
		os.write(data2.getBytes());
		os.flush();

		os.close();*/
		
		//������ ���ϰ� ����ϱ� ���� Print ���	//���ڷ� �����
		PrintWriter out = new PrintWriter(os);	//Stream, Writer �� �� �� ����
		out.println(data1);
		out.println(data2);		
		out.flush();
		
		out.close();
	}
}
