package ch12.exam02;

public class Example {

	public static void main(String[] args) {

		System.out.println("���� ������ ����");

		//��Ʈ��ũ �۾��� �ϴ� ������ ������ ����
		Thread thread1 = new NetworkTest();	//������� ���� ��Ʈ��ũ ��ü�� �����尡 ��
		thread1.start();		//�����δ� run()����

		//���� �۾��� �ϴ� ������ ������ ����
		Thread thread2 = new MusicTask();//������� ���� ���� ��ü�� �����尡 ��
		thread2.start();
		
		//ä�� �۾��� �ϴ� ������ ������ ����		//runnable ������ Ŭ���� ���� �� ��ü ����
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					System.out.println("ä�� �۾��� �մϴ�.");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						//����� ȭ������~~ :-)
					}
				}
			}
		});	 //	=>	�͸� ���� ��ü
		thread3.start();

		while(true) {
			System.out.println("���� ������ ����");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				//����� ȭ������~~ :-)
			}
		}


	}

}
