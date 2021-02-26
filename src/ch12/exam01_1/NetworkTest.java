package ch12.exam01_1;

public class NetworkTest implements Runnable{
	@Override
	public void run() {
		while(true) {
			System.out.println("네트워크 통신을 합니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}
	}
}
