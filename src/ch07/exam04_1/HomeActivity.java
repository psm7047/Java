package ch07.exam04_1;

public class HomeActivity extends Activity {
	//field
	//constructor
	public HomeActivity() {
		super();
	}
	//method
	
	@Override
	public void onCreate() {
		super.onCreate();		//부모 객체의 메소드 실행
		System.out.println("자식이 UI 요소를 생성합니다.");
		System.out.println("자식이 UI 요소의 이벤트를 처리합니다.");
	}

}
