package ch10.exam07_1;
//����� ���� ���� ó��
public class NoAccountException extends RuntimeException{

	public NoAccountException() {
	}
	public NoAccountException(String message) {
		super(message);
	}
}
