package ch12.exam01_1;

public class Example {
	
	public static void main(String[] args) {
		//��Ƽ������
		System.out.println("���� ������ ����");
		
		//��Ʈ��ũ �۾��� �ϴ� ������ ������ ����
		Thread thread1 = new Thread(new NetworkTest());
		thread1.start();
		
		//���� �۾��� �ϴ� ������ ������ ����
		Thread thread2 = new Thread(new MusicTask());
		thread2.start();
		
		//ä�� �۾��� �ϴ� ������ ������ ����		//runnable ������ Ŭ���� ���� �� ��ü ����
				Thread thread3 = new Thread() {
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
				};	 //	=>	�͸� �ڽ� ��ü
				thread3.start();
				
				while(true) {
					System.out.println("���� ������ ����");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
					}
				}
		
	}

}
