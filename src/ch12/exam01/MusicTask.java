package ch12.exam01;
//Runnable 인터페이스를 사용하는...
public class MusicTask implements Runnable{
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
