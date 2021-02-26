package ch06homework.exercise20;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("-------------------------------------------");
			System.out.print("����> ");

			int selectNo = Integer.parseInt(scanner.nextLine());

			if(selectNo == 1) {
				createAccount();
			}else if(selectNo == 2) {
				accountList();
			}else if(selectNo == 3) {
				deposit();
			}else if(selectNo == 4) {
				withdraw();
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");

	}
	
	//���� �����ϱ�
	private static void createAccount() {
		
		System.out.println("-----------");
		System.out.println("���»���");
		System.out.println("-----------");
		
		System.out.print("���� ��ȣ: ");
		String ano = scanner.nextLine();
		
		System.out.print("������: ");
		String owner = scanner.nextLine();
		
		System.out.print("�ʱ��Աݾ�: ");
		int balance = Integer.parseInt(scanner.nextLine());
		
		Account account = new Account(ano,owner,balance);
		
		for(int i=0; i<accountArray.length;i++) {
			if(accountArray[i] == null) {
				accountArray[i] = account;
				break;
			}
		}
		System.out.println("��� : ���°� �����Ǿ����ϴ�.");
		
	}
	//���¸�Ϻ���
	private static void accountList() {
		System.out.println("-----------");
		System.out.println("���¸��");
		System.out.println("-----------");
		
		for(int i =0; i<accountArray.length;i++) {
			if(accountArray[i] != null) {
				System.out.print(accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
				System.out.println();
			}
		}
	}
	//�����ϱ�
	private static void deposit() {
		System.out.println("-----------");
		System.out.println("����");
		System.out.println("-----------");
		
		System.out.print("���� ��ȣ: ");
		String ano = scanner.nextLine();
		
		System.out.print("���ݾ�: ");
		int balance = Integer.parseInt(scanner.nextLine());
		
		Account acc = null;
		acc = findAccount(ano);
		
		int total = acc.getBalance();
		total += balance;
		
		acc.setBalance(total);
		
		System.out.println("��� : ������ �����Ǿ����ϴ�.");
		
	}
	//����ϱ�
	private static void withdraw() {
		System.out.println("-----------");
		System.out.println("���");
		System.out.println("-----------");
		
		System.out.print("���� ��ȣ: ");
		String ano = scanner.nextLine();
		
		System.out.print("��ݾ�: ");
		int balance = Integer.parseInt(scanner.nextLine());
		
		Account acc = null;
		acc = findAccount(ano);
		
		int total = acc.getBalance();
		total -= balance;
		
		acc.setBalance(total);
		
		System.out.println("��� : ����� �����Ǿ����ϴ�.");
		

	}
	//Account �迭���� ano�� ������ Account ��ü ã��
	private static Account findAccount(String ano) {
		
		Account acc = null;
		
		for(int i=0; i<accountArray.length;i++) {
			if(accountArray[i].getAno().equals(ano)) {
				acc = accountArray[i];
				break;
			}
		}
		return acc;
		
	}

}