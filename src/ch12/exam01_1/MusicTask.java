package ch12.exam01_1;

public class MusicTask implements Runnable{
	@Override
	public void run() {
		while(true) {
			System.out.println("������ ���� �մϴ�.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		
	}

}
