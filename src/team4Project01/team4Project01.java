package team4Project01;

import java.util.Scanner;

public class team4Project01 {

	public static void main(String[] args) {

		boolean run = true;

		int boardNum = 0;      //�Խù� ��ȣ
		String title = null;
		String content = null;
		String writer = null;

		String mTitle = null;         //������ ����
		String mContent = null;         //������ ����

		String[][] boardArray = new String[100][5];

		Scanner scanner = new Scanner(System.in);
		String input;

		while(run) {
			System.out.println();
			System.out.println("------------------------------------------------------------------------------------------");
			System.out.println("1. ��� | 2. ����(create) |3.�б�(read) | 4.����(update) | 5. ����(Delete) | 6. �α�� TOP5 | 7. ����");
			System.out.println("------------------------------------------------------------------------------------------");
			System.out.print("�޴����� : ");

			input = scanner.nextLine();

			if(input.equals("1")) {               //���
				
				int bCount=0;								//�Խù� �� ����
				for(int i=0; i<boardArray.length;i++) {
					if(boardArray[i][0] != null) {
						bCount++;
					}
				}
				System.out.println();
				System.out.println("------------------------------------------------------------------------------------------");
				System.out.println("�Խù� �� ���� : " + bCount );
				System.out.println("------------------------------------------------------------------------------------------");
				System.out.println("��ȣ\t\t����\t\t����\t\t�۾���\t\t��ȸ��");
				System.out.println("------------------------------------------------------------------------------------------");

				int[] check = new int[100];      //����� �Խù����� �ƴ��� check�� �迭

				for(int i =0; i<boardArray.length; i++) {      //�Խù��� ����� for��

					if(boardArray[i][0] != null) {            //�Խù��� null�� �ƴ� ���

						int max =0;            //���� ū �Խ��� ��ȣ �ʱⰪ 0
						int index = -1;         //�Խ��� ��ȣ�� ���� Ŭ ���� �迭 �ε���

						for(int j =0; j<boardArray.length; j++) {      //���� ū �Խ��� ��ȣ�� ã�� ���� for��

							if(boardArray[j][0] != null) {            //�Խù��� null�� �ƴ� ��츸 Ž��

								int bno = Integer.parseInt(boardArray[j][0]);      //���� �Խ��� ��ȣ

								if(max <= bno && check[j]==0) {      //�Խ��� ��ȣ�� ���� ū ���̸鼭 ������� ���� �Խù��̸�

									max = bno;               //�Խ��� ��ȣ�� max�� ����
									index = j;               //�Խ��� ��ȣ�� ���� ū �迭 �ε��� 
								}
							}
						}

						if(index != -1) {         //����� �Խù��� �ִ°�? 
							System.out.print(boardArray[index][0] + "\t\t");
							System.out.print(boardArray[index][1] + "\t\t");
							System.out.print(boardArray[index][2] +"\t\t");
							System.out.print(boardArray[index][3] +"\t\t");
							System.out.println(boardArray[index][4]);
							check[index] = 1;         //����� �Խù� üũ
						}
					}
				}

			}else if(input.equals("2")) {         //����
				boardNum++;			
				System.out.print("���� : ");
				title = scanner.nextLine();
				System.out.print("���� : ");
				content = scanner.nextLine();
				System.out.print("�۾��� : ");
				writer = scanner.nextLine();

				for(int i =0;i<boardArray.length;i++) {
					if(boardArray[i][0] == null) {
						boardArray[i][0] = String.valueOf(boardNum);
						boardArray[i][1] = title;
						boardArray[i][2] = content;
						boardArray[i][3] = writer;
						boardArray[i][4] = "0";
						break;
					}
				}
				
				//��� �����ֱ�
				int bCount=0;
				for(int i=0; i<boardArray.length;i++) {
					if(boardArray[i][0] != null) {
						bCount++;
					}
				}
				
				System.out.println();
				System.out.println("------------------------------------------------------------------------------------------");
				System.out.println("�Խù� �� ���� : " + bCount );
				System.out.println("------------------------------------------------------------------------------------------");
				System.out.println("��ȣ\t\t����\t\t����\t\t�۾���\t\t��ȸ��");
				System.out.println("------------------------------------------------------------------------------------------");

				int[] check = new int[100];      //����� �Խù����� �ƴ��� check�� �迭

				for(int i =0; i<boardArray.length; i++) {      //�Խù��� ����� for��

					if(boardArray[i][0] != null) {            //�Խù��� null�� �ƴ� ���

						int max =0;            //���� ū �Խ��� ��ȣ �ʱⰪ 0
						int index = -1;         //�Խ��� ��ȣ�� ���� Ŭ ���� �迭 �ε���

						for(int j =0; j<boardArray.length; j++) {      //���� ū �Խ��� ��ȣ�� ã�� ���� for��

							if(boardArray[j][0] != null) {            //�Խù��� null�� �ƴ� ��츸 Ž��

								int bno = Integer.parseInt(boardArray[j][0]);      //���� �Խ��� ��ȣ

								if(max <= bno && check[j]==0) {      //�Խ��� ��ȣ�� ���� ū ���̸鼭 ������� ���� �Խù��̸�

									max = bno;               //�Խ��� ��ȣ�� max�� ����
									index = j;               //�Խ��� ��ȣ�� ���� ū �迭 �ε��� 
								}
							}
						}

						if(index != -1) {         //����� �Խù��� �ִ°�? 
							System.out.print(boardArray[index][0] + "\t\t");
							System.out.print(boardArray[index][1] + "\t\t");
							System.out.print(boardArray[index][2] +"\t\t");
							System.out.print(boardArray[index][3] +"\t\t");
							System.out.println(boardArray[index][4]);
							check[index] = 1;         //����� �Խù� üũ
						}
					}
				}

			}else if(input.equals("3")) {         //�б�

				System.out.print("��ȣ : ");
				input = scanner.nextLine();

				for(int i=0; i<boardArray.length; i++) {
					if(boardArray[i][0]!=null && boardArray[i][0].equals(input)) {

						int mCount = 0;      //��ȸ��                           
						mCount = Integer.parseInt(boardArray[i][4]);
						mCount++;                              //��ȸ�� ����
						boardArray[i][4] = String.valueOf(mCount);

						System.out.println("���� : " + boardArray[i][1]);
						System.out.println("���� : " + boardArray[i][2]);
						System.out.println("�۾��� : " + boardArray[i][3]);
						System.out.println("��ȸ�� : " + boardArray[i][4]);
						break;
					}
				}


			}else if(input.equals("4")) {         //����

				System.out.print("��ȣ : ");
				input = scanner.nextLine();

				for(int i=0; i<boardArray.length; i++) {
					if(boardArray[i][0]!=null && boardArray[i][0].equals(input)) {
						System.out.println("���� ���� : " + boardArray[i][1]);
						System.out.print("���� ���� : ");
						mTitle = scanner.nextLine();
						if(!mTitle.equals("")) {
							boardArray[i][1] = mTitle;
						}

						System.out.println("���� ���� : " + boardArray[i][2]);
						System.out.print("���� ���� : ");
						mContent = scanner.nextLine();
						if(!mContent.equals("")) {
							boardArray[i][2] = mContent;
						}
					}
					continue;
				}

				//��� �����ֱ�
				int bCount=0;
				for(int i=0; i<boardArray.length;i++) {
					if(boardArray[i][0] != null) {
						bCount++;
					}
				}
				
				System.out.println();
				System.out.println("------------------------------------------------------------------------------------------");
				System.out.println("�Խù� �� ���� : " + bCount );
				System.out.println("------------------------------------------------------------------------------------------");
				System.out.println("��ȣ\t\t����\t\t����\t\t�۾���\t\t��ȸ��");
				System.out.println("------------------------------------------------------------------------------------------");

				int[] check = new int[100];      //����� �Խù����� �ƴ��� check�� �迭

				for(int i =0; i<boardArray.length; i++) {      //�Խù��� ����� for��

					if(boardArray[i][0] != null) {            //�Խù��� null�� �ƴ� ���

						int max =0;            //���� ū �Խ��� ��ȣ �ʱⰪ 0
						int index = -1;         //�Խ��� ��ȣ�� ���� Ŭ ���� �迭 �ε���

						for(int j =0; j<boardArray.length; j++) {      //���� ū �Խ��� ��ȣ�� ã�� ���� for��

							if(boardArray[j][0] != null) {            //�Խù��� null�� �ƴ� ��츸 Ž��

								int bno = Integer.parseInt(boardArray[j][0]);      //���� �Խ��� ��ȣ

								if(max <= bno && check[j]==0) {      //�Խ��� ��ȣ�� ���� ū ���̸鼭 ������� ���� �Խù��̸�

									max = bno;               //�Խ��� ��ȣ�� max�� ����
									index = j;               //�Խ��� ��ȣ�� ���� ū �迭 �ε��� 
								}
							}
						}

						if(index != -1) {         //����� �Խù��� �ִ°�? 
							System.out.print(boardArray[index][0] + "\t\t");
							System.out.print(boardArray[index][1] + "\t\t");
							System.out.print(boardArray[index][2] +"\t\t");
							System.out.print(boardArray[index][3] +"\t\t");
							System.out.println(boardArray[index][4]);
							check[index] = 1;         //����� �Խù� üũ
						}
					}
				}

			}else if(input.equals("5")) {         //����

				System.out.print("��ȣ : ");
				input = scanner.nextLine();

				for(int i=0; i<boardArray.length; i++) {
					for(int j=0;j<5;j++) {

						if(boardArray[i][0]!=null && boardArray[i][0].equals(input)) {
							boardArray[i][j] = null;
							break;
						}
					}

				}

				//��� �����ֱ�
				int bCount=0;
				for(int i=0; i<boardArray.length;i++) {
					if(boardArray[i][0] != null) {
						bCount++;
					}
				}
				
				System.out.println();
				System.out.println("------------------------------------------------------------------------------------------");
				System.out.println("�Խù� �� ���� : " + bCount );
				System.out.println("------------------------------------------------------------------------------------------");
				System.out.println("��ȣ\t\t����\t\t����\t\t�۾���\t\t��ȸ��");
				System.out.println("------------------------------------------------------------------------------------------");

				int[] check = new int[100];      //����� �Խù����� �ƴ��� check�� �迭

				for(int i =0; i<boardArray.length; i++) {      //�Խù��� ����� for��

					if(boardArray[i][0] != null) {            //�Խù��� null�� �ƴ� ���

						int max =0;            //���� ū �Խ��� ��ȣ �ʱⰪ 0
						int index = -1;         //�Խ��� ��ȣ�� ���� Ŭ ���� �迭 �ε���

						for(int j =0; j<boardArray.length; j++) {      //���� ū �Խ��� ��ȣ�� ã�� ���� for��

							if(boardArray[j][0] != null) {            //�Խù��� null�� �ƴ� ��츸 Ž��

								int bno = Integer.parseInt(boardArray[j][0]);      //���� �Խ��� ��ȣ

								if(max <= bno && check[j]==0) {      //�Խ��� ��ȣ�� ���� ū ���̸鼭 ������� ���� �Խù��̸�

									max = bno;               //�Խ��� ��ȣ�� max�� ����
									index = j;               //�Խ��� ��ȣ�� ���� ū �迭 �ε��� 
								}
							}
						}

						if(index != -1) {         //����� �Խù��� �ִ°�? 
							System.out.print(boardArray[index][0] + "\t\t");
							System.out.print(boardArray[index][1] + "\t\t");
							System.out.print(boardArray[index][2] +"\t\t");
							System.out.print(boardArray[index][3] +"\t\t");
							System.out.println(boardArray[index][4]);
							check[index] = 1;         //����� �Խù� üũ
						}
					}
				}
						
			}else if(input.equals("6")) {							//�α�� TOP5
				
				System.out.println();
				System.out.println("------------------------------------------------------------------------------------------");
				System.out.println("����\t��ȣ\t\t����\t\t����\t\t�۾���\t\t��ȸ��");
				System.out.println("------------------------------------------------------------------------------------------");
				
				int[] check = new int[100];      //����� �Խù����� �ƴ��� check�� �迭
				
				int top = 1;					//5���� ����ϱ� ���� ����
				
				for(int i =0; i<boardArray.length; i++) {      //�Խù��� ����� for��
					
					if(top > 5) {				//�α�� 5�������� ���
						break;
					}

						if(boardArray[i][0] != null) {            //�Խù��� null�� �ƴ� ���

							int cMax =0;            //���� ū ��ȸ�� �ʱⰪ 0
							int index = -1;         //��ȸ���� ���� Ŭ ���� �迭 �ε���

							for(int j =0; j<boardArray.length; j++) {      //���� ū ��ȸ���� ã�� ���� for�� //��ȸ���� ���� ��� index�� ū �������� ���

								if(boardArray[j][0] != null) {            //�Խù��� null�� �ƴ� ��츸 Ž��

									int hitCount = Integer.parseInt(boardArray[j][4]);      //���� Ž������ ��ȸ�� 

									if(check[j]==0 && cMax <= hitCount) {      //������� ���� �Խù��̰� ��ȸ���� ���� ū ���ΰ�? 

										cMax = hitCount;               //���� ū ��ȸ���� cMax�� ����
										index = j;               //��ȸ���� ���� ū �Խù��� �ε��� 
									}
								}
							}

							if(index != -1) {         //����� �Խù��� �ִ°�? 
								System.out.print(top + "�� \t");
								System.out.print(boardArray[index][0] + "\t\t");
								System.out.print(boardArray[index][1] + "\t\t");
								System.out.print(boardArray[index][2] +"\t\t");
								System.out.print(boardArray[index][3] +"\t\t");
								System.out.println(boardArray[index][4]);
								check[index] = 1;         //����� �Խù� üũ
								top++;					//�α�� �߰�
							}
						}
					}
				
			}else if(input.equals("7")) {                           //����

				System.out.println("���α׷��� ����");
				run = false;
			}else {
				System.out.println("��Ȯ�� �޴��� �������ּ���.");
			}

		}

	}

}