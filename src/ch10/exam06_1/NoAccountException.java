package ch10.exam06_1;

//���� ���� ����� ���� �޼ҵ�
public class NoAccountException extends RuntimeException{

	//�⺻ ������
	public NoAccountException() {
	}
	//���� �޽����� �����ϱ� ���� ������
	public NoAccountException(String message) {
		super(message);
	}
}
