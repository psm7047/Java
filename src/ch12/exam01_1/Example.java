package ch12.exam01_1;

public class Example {
	
	public static void main(String[] args) {
		//멀티스레드
		System.out.println("메인 스레드 시작");
		
		//네트워크 작업을 하는 스레드 생성과 실행
		Thread thread1 = new Thread(new NetworkTest());
		thread1.start();
		
		//뮤직 작업을 하는 스레드 생성과 실행
		Thread thread2 = new Thread(new MusicTask());
		thread2.start();
		
		//채팅 작업을 하는 스레드 생성과 실행		//runnable 구현한 클래스 선언 후 객체 만듬
				Thread thread3 = new Thread() {
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
				};	 //	=>	익명 자식 객체
				thread3.start();
				
				while(true) {
					System.out.println("메인 스레드 종료");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
					}
				}
		
	}

}
