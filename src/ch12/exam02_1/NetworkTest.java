package ch12.exam02_1;
//Thread ��ü�� ���
public class NetworkTest extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("��Ʈ��ũ ����� �մϴ�.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}
	}
}
