package ch05;

public class Exam12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Season nowSeason = Season.WINTER;
		if(nowSeason == Season.SUMMER) {
			System.out.println("�½��ϴ�.");
		}else {
			System.out.println("�ƴմϴ�.");
		}
		System.out.println(nowSeason);

		//������ ����, ��Ÿ�� ���� ���� ����
		LoginResult loginResult = LoginResult.FAILURE_ID;
		if(loginResult == LoginResult.SUCCESS) {
			System.out.println("�α��� �����߱���.");
		}else if(loginResult == LoginResult.FAILURE_ID) {
			System.out.println("���̵� �ٽ� �Է��ϼ���.");
		}else {
			System.out.println("�н����尡 Ʋ���ϴ�.");

		}
	}
}