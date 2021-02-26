package ch12.exam02_1;
//Thread 객체를 상속
public class NetworkTest extends Thread{
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
