package team4Project01;
import java.util.Scanner;

public class team4Project01Test {

	public static void main(String[] args) {
		
		String[][] boardArray = new String[100][5];		//�Խù��� ������ �迭
		
		Scanner scanner = new Scanner(System.in);
		int count=0; // �Խù� ��ȣ
		
		while(true) {				//false�̸� ����	//�޴� ���
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.println("1. ��� | 2. ����(Create) | 3. �б�(Read) | 4. ����(Update) | 5. ����(Delete) | 6. �α�� TOP5 |  7. ����");
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.print("�޴�����: ");
			
			String selectNo = scanner.nextLine();		//�޴� ��ȣ�� �޾ƿ�
			
			
			if(selectNo.equals("1")) {			//���

				// ���� -> ��ȸ�� �ݿ� ���
				// ��ȸ�� ���� ����
				int boardCount = 0 ;	//�� �Խù��� �� ����, for��
				for(int i=0; i < boardArray.length; i++) {		//boardArray�� Ž���ϸ� �Խù��� �ִ� ���(null�� �ƴ� ���) boardCount ����
					if(boardArray[i][0] != null) {
						boardCount++;
					}
					
				}
				System.out.println("------------------------------------------------------------------------------------------------");
				System.out.println("�� �Խù� �� : " + boardCount);
				System.out.println("------------------------------------------------------------------------------------------------");
				
				System.out.print("��ȣ" + "\t");
				System.out.print("����" + "\t\t\t\t" );
				System.out.print("����" + "\t\t\t\t");
				System.out.print("�۾���" + "\t\t");
				System.out.print("��ȸ��" + "\t\n");
				System.out.println("------------------------------------------------------------------------------------------------");
				
				int[] check = new int[100]; // ����� �Խù����� �ƴ��� check�ϴ� �迭 
				
				for(int i=0;i<boardArray.length;i++) { // �Խù� ����� ����� for ��
					if(boardArray[i][0]==null) { // �Խù��� null�� ��� continue
						continue;
					}
					int max = 0; //���� ū �Խ��� ��ȣ�� ���� �ʱⰪ 0
					int index = -1;   //�Խ��� ��ȣ�� ���� Ŭ ���� �迭 �ε���
					for(int j=0;j<boardArray.length;j++) {	//���� ū �Խ��� ��ȣ�� ã�� ���� for��
						if(boardArray[j][0]==null) { // �Խù��� null�� ���
							continue;
						}
						int num = Integer.parseInt(boardArray[j][0]); // ���� �Խ��� ��ȣ
						if(max<=num && check[j]==0) { //�Խ��� ��ȣ�� ���� ū ���̸鼭 ������� ���� �Խù��̸�
							max=num; //�Խ��� ��ȣ�� max�� ����
							index=j; //�Խ��� ��ȣ�� ���� ū �Խù��� �ε��� 
						}
					}
					
					if(index!=-1) { //����� �Խù��� �ִ°�? -1�� ��� ����� �Խù� ����, -1�� �ƴҰ�� ����� �Խù� ����
						System.out.print(boardArray[index][0] + "\t");
						System.out.print(boardArray[index][1] + "\t\t\t\t" );
						System.out.print(boardArray[index][2] + "\t\t\t\t");
						System.out.print(boardArray[index][3] + "\t\t");
						System.out.print(boardArray[index][4] + "\t\n");
						check[index]=1; //����� �Խù� üũ
					}
					
				}			
				
				
			} else if(selectNo.equals("2")) {		//����
				System.out.print("����: ");
				String title = scanner.nextLine();
				System.out.print("����: ");
				String content = scanner.nextLine();
				System.out.print("�۾���: ");
				String writer = scanner.nextLine();
				
				for(int i=0;i<boardArray.length;i++) {
					if(boardArray[i][0]==null) {		//boardArray�߿��� ���� �� ���� null�� �κп� �����ϱ� ����
						count++; // ������ �� �ڵ����� �Խù� ��ȣ 1���� (�Խù� ��ȣ)
						String[] arr = {					//������ �޾ƿ� ����,����,�۾��̸� ������ �迭�� ���� ����
								String.valueOf(count),
								title,
								content,
								writer,
								"0"
						};
						
						boardArray[i] = arr;		//arr�� boardArray[i](null�κκ�)�� ����
						break;		//���������� for�� ����(���� �Ϸ�)
					}
				}
				
				//���� �� ��Ϻ���
				// ���� -> ��ȸ�� �ݿ� ���
				// ��ȸ�� ���� ����
				int boardCount = 0 ;
				for(int i=0; i < boardArray.length; i++) {
					if(boardArray[i][0] != null) {
						boardCount++;
					}
					
				}
				System.out.println("------------------------------------------------------------------------------------------------");
				System.out.println("�� �Խù� �� : " + boardCount);
				System.out.println("------------------------------------------------------------------------------------------------");
				
				System.out.print("��ȣ" + "\t");
				System.out.print("����" + "\t\t\t\t" );
				System.out.print("����" + "\t\t\t\t");
				System.out.print("�۾���" + "\t\t");
				System.out.print("��ȸ��" + "\t\n");
				System.out.println("------------------------------------------------------------------------------------------------");
				
				int[] check = new int[100];
				for(int i=0;i<boardArray.length;i++) {
					if(boardArray[i][0]==null) {
						continue;
					}
					int max = 0;
					int index = -1;
					for(int j=0;j<boardArray.length;j++) {
						if(boardArray[j][0]==null) {
							continue;
						}
						int num = Integer.parseInt(boardArray[j][0]);
						if(max<=num && check[j]==0) {
							max=num;
							index=j;
						}
					}
					
					if(index!=-1) {
						System.out.print(boardArray[index][0] + "\t");
						System.out.print(boardArray[index][1] + "\t\t\t\t" );
						System.out.print(boardArray[index][2] + "\t\t\t\t");
						System.out.print(boardArray[index][3] + "\t\t");
						System.out.print(boardArray[index][4] + "\t\n");
						check[index]=1;
					}
					
				}			
				

				
			} else if(selectNo.equals("3")) {			//�б�
				System.out.print("��ȣ: ");
				String number = scanner.nextLine();	//�Խù� ��ȣ�� �޾ƿ�
				int i2 = -1; // �Խù��� �ִ��� ������ üũ, �Խù� ��ȣ�� ��ġ�ϴ� �Խù��� �ε��� ����
				int hits;		//��ȸ��
				for(int i=0;i<boardArray.length;i++) {		//boardArray�� �Խù��� Ž���ϱ� ���� for 
					if(boardArray[i][0]==null) {		//null�̸� continue(���� �Խù��� ) 
						continue;
					}
					else if(boardArray[i][0].equals(number)) {	//null�ƴϰ� �Էµ� �Խù� ��ȣ�� boardArray�� �Խù� ��ȣ�� ��ġ�ϸ� 
						i2=i;		//i2�� �ش� �Խù��� �ε��� ���� 
					}
				}
				
				if(i2==-1) {		//�Խù��� ���� ��
					System.out.println("�Խù��� �������� �ʽ��ϴ�.");
				} else {
					System.out.println("����: " + boardArray[i2][1]);
					System.out.println("����: " + boardArray[i2][2]);
					System.out.println("�۾���: " + boardArray[i2][3]);
					hits = Integer.parseInt(boardArray[i2][4]);	//String-> int		
					hits++;		//��ȸ�� 1����
					boardArray[i2][4]=String.valueOf(hits);		//�ش� �Խù��� ������ ��ȸ�� ����
					System.out.println("��ȸ��: " + boardArray[i2][4]);	
				}
				
				
				
			} else if(selectNo.equals("4")) {			//����
				System.out.print("��ȣ: ");
				String number = scanner.nextLine();
				int i2 = -1; //  �Խù��� �ִ��� ������ üũ, �Խù� ��ȣ�� ��ġ�ϴ� �Խù��� �ε��� ����
				for(int i=0;i<boardArray.length;i++) {//boardArray�� �Խù��� Ž���ϱ� ���� for 
					if(boardArray[i][0]==null) {//null�̸� continue(���� �Խù��� ) 
						continue;
					}
					else if(boardArray[i][0].equals(number)) {//null�ƴϰ� �Էµ� �Խù� ��ȣ�� boardArray�� �Խù� ��ȣ�� ��ġ�ϸ� 
						i2=i; //i2�� �ش� �Խù��� �ε��� ���� 
					}
				}
				
				if(i2==-1) {//�Խù��� ���� ��
					System.out.println("�Խù��� �������� �ʽ��ϴ�.");
				} else {
					System.out.println("��������: " + boardArray[i2][1]);	//�ش� �Խù��� ���� ���� ���
					System.out.print("��������: ");			
					String title = scanner.nextLine();		//������ ���� �޾ƿ�
					if(!title.equals("")) {			//������ ������ ������ �ƴ� ���
						boardArray[i2][1]=title;	//�ش� �Խù��� ���� ����
					}
					System.out.println("��������: " + boardArray[i2][2]);	//�ش� �Խù��� ���� ���� ���
					System.out.print("��������: ");
					String content = scanner.nextLine();		//������ ���� �޾ƿ�
					if(!content.equals("")) {		//������ ������ ������ �ƴ� ���
						boardArray[i2][2]=content;		//�ش� �Խù��� ���� ����
					}
					
					//���� �� ��� �����ֱ�
					// ���� -> ��ȸ�� �ݿ� ���
					// ��ȸ�� ���� ����
					int boardCount = 0 ;
					for(int i=0; i < boardArray.length; i++) {
						if(boardArray[i][0] != null) {
							boardCount++;
						}
						
					}
					System.out.println("------------------------------------------------------------------------------------------------");
					System.out.println("�� �Խù� �� : " + boardCount);
					System.out.println("------------------------------------------------------------------------------------------------");
					
					System.out.print("��ȣ" + "\t");
					System.out.print("����" + "\t\t\t\t" );
					System.out.print("����" + "\t\t\t\t");
					System.out.print("�۾���" + "\t\t");
					System.out.print("��ȸ��" + "\t\n");
					System.out.println("------------------------------------------------------------------------------------------------");
					
					int[] check = new int[100];
					for(int i=0;i<boardArray.length;i++) {
						if(boardArray[i][0]==null) {
							continue;
						}
						int max = 0;
						int index = -1;
						for(int j=0;j<boardArray.length;j++) {
							if(boardArray[j][0]==null) {
								continue;
							}
							int num = Integer.parseInt(boardArray[j][0]);
							if(max<=num && check[j]==0) {
								max=num;
								index=j;
							}
						}
						
						if(index!=-1) {
							System.out.print(boardArray[index][0] + "\t");
							System.out.print(boardArray[index][1] + "\t\t\t\t" );
							System.out.print(boardArray[index][2] + "\t\t\t\t");
							System.out.print(boardArray[index][3] + "\t\t");
							System.out.print(boardArray[index][4] + "\t\n");
							check[index]=1;
						}
						
					}			
						
					
				}
				
			
			} else if(selectNo.equals("5")) {		//����
				System.out.print("��ȣ: ");
				String number = scanner.nextLine();
				int i2 = -1;	//  �Խù��� �ִ��� ������ üũ, �Խù� ��ȣ�� ��ġ�ϴ� �Խù��� �ε��� ����
				for(int i=0;i<boardArray.length;i++) {	//boardArray�� �Խù��� Ž���ϱ� ���� for 
					if(boardArray[i][0]==null) {//null�̸� continue(���� �Խù��� ) 
						continue;
					}
					else if(boardArray[i][0].equals(number)) {//null�ƴϰ� �Էµ� �Խù� ��ȣ�� boardArray�� �Խù� ��ȣ�� ��ġ�ϸ� 
						i2=i;	//i2�� �ش� �Խù��� �ε��� ���� 
					}
				}
				
				if(i2==-1) {		//�Խù��� ���� �� 
					System.out.println("�Խù��� �������� �ʽ��ϴ�.");
				} else {	//�ش� �Խù� null�� ��ȯ(����)
					for(int j=0;j<boardArray[i2].length;j++) {
						boardArray[i2][j]=null;
					}
					
					//���� �� ��� �����ֱ�
					// ���� -> ��ȸ�� �ݿ� ���
					// ��ȸ�� ���� ����
					int boardCount = 0 ;
					for(int i=0; i < boardArray.length; i++) {
						if(boardArray[i][0] != null) {
							boardCount++;
						}
						
					}
					System.out.println("------------------------------------------------------------------------------------------------");
					System.out.println("�� �Խù� �� : " + boardCount);
					System.out.println("------------------------------------------------------------------------------------------------");
					
					System.out.print("��ȣ" + "\t");
					System.out.print("����" + "\t\t\t\t" );
					System.out.print("����" + "\t\t\t\t");
					System.out.print("�۾���" + "\t\t");
					System.out.print("��ȸ��" + "\t\n");
					System.out.println("------------------------------------------------------------------------------------------------");
					
					int[] check = new int[100];
					for(int i=0;i<boardArray.length;i++) {
						if(boardArray[i][0]==null) {
							continue;
						}
						int max = 0;
						int index = -1;
						for(int j=0;j<boardArray.length;j++) {
							if(boardArray[j][0]==null) {
								continue;
							}
							int num = Integer.parseInt(boardArray[j][0]);
							if(max<=num && check[j]==0) {
								max=num;
								index=j;
							}
						}
						
						if(index!=-1) {
							System.out.print(boardArray[index][0] + "\t");
							System.out.print(boardArray[index][1] + "\t\t\t\t" );
							System.out.print(boardArray[index][2] + "\t\t\t\t");
							System.out.print(boardArray[index][3] + "\t\t");
							System.out.print(boardArray[index][4] + "\t\n");
							check[index]=1;
						}
						
					}			
				}
				
				
			} else if(selectNo.equals("6")) {			//���ο� ��� : �α�� TOP5
				int topCount = 1; // 1��~5��
				int[] check = new int[100];		//��ȸ�� ��������
				
				System.out.println("------------------------------------------------------------------------------------------------------");
				System.out.print("����" + "\t");
				System.out.print("��ȣ" + "\t");
				System.out.print("����" + "\t\t\t\t" );
				System.out.print("����" + "\t\t\t\t");
				System.out.print("�۾���" + "\t\t");
				System.out.print("��ȸ��" + "\t\n");
				System.out.println("------------------------------------------------------------------------------------------------------");
				
				for(int i=0;i<boardArray.length;i++) {		//boardArray�� �Խù��� Ž���ϱ� ���� for 
					if(boardArray[i][0]==null) {		//i��° �Խù��� null�� ��� continue(���� i)
						continue;
					} else {
						if (topCount > 5) { // �α�� 5���� �Ѿ��? ������
							break;
						} else {
							int max = 0;		//���� ū ��ȸ���� ������ ����
							int index = -1;		//��ȸ���� ���� Ŭ ���� �迭 �ε���
							for(int j=0;j<boardArray.length;j++) {
								if(boardArray[j][4]==null) { //  ��ȸ���� null�̸� �Ѿ��
									continue;
								}
								int num = Integer.parseInt(boardArray[j][4]);		//String -> int
								if(max<=num && check[j]==0) { // ������� ���� �Խù��̰� ��ȸ���� ���� Ŭ ��
									max=num;		//���� ū ��ȸ�� max����
									index=j;		//�ش� �Խù��� �ε����� ����
								}
							}
							
							if(index!=-1) { // ����� �Խù��� �ִ°�?		-1�̸� ����� �Խù� ����, -1�� �ƴϸ� ����� �Խù� ����
								if(boardArray[index][4].equals("0")) { // �Խù��� ��ȸ���� 0�̶�� �������� �ʴ´�
									break;
								} else {
									System.out.print(topCount + "��\t");
									System.out.print(boardArray[index][0] + "\t");
									System.out.print(boardArray[index][1] + "\t\t\t\t" );
									System.out.print(boardArray[index][2] + "\t\t\t\t");
									System.out.print(boardArray[index][3] + "\t\t");
									System.out.print(boardArray[index][4] + "\t\n");
									check[index]=1; // ����� �Խù� üũ
									topCount++; // ���� ���� ǥ��
								}
								
							}
							
						}
					}
				
				}	

			} else if(selectNo.equals("7")) {		//����
				System.out.println("���α׷� ����");
				break;
				
			} else {		//�޴��� �߸� �Է����� ���
				System.out.println("�ٽ� �������ּ���.");
			}
			
			System.out.println();
		}
		
	}

}