package ch12.exam02;

public class Example {

	public static void main(String[] args) {

		System.out.println("메인 스레드 시작");

		//네트워크 작업을 하는 스레드 생성과 실행
		Thread thread1 = new NetworkTest();	//상속으로 인해 네트워크 자체로 스레드가 됨
		thread1.start();		//실제로는 run()실행

		//뮤직 작업을 하는 스레드 생성과 실행
		Thread thread2 = new MusicTask();//상속으로 인해 뮤직 자체로 스레드가 됨
		thread2.start();
		
		//채팅 작업을 하는 스레드 생성과 실행		//runnable 구현한 클래스 선언 후 객체 만듬
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					System.out.println("채팅 작업을 합니다.");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						//선명아 화이팅해~~ :-)
					}
				}
			}
		});	 //	=>	익명 구현 객체
		thread3.start();

		while(true) {
			System.out.println("메인 스레드 종료");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				//선명아 화이팅해~~ :-)
			}
		}


	}

}
