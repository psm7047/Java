package ch12.exam02_1;
//Thread 객체를 상속
public class MusicTask extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("뮤직을 연주 합니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}

	}


}
