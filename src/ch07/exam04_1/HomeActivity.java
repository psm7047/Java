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
		super.onCreate();		//�θ� ��ü�� �޼ҵ� ����
		System.out.println("�ڽ��� UI ��Ҹ� �����մϴ�.");
		System.out.println("�ڽ��� UI ����� �̺�Ʈ�� ó���մϴ�.");
	}

}
