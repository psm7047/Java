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
         System.out.println("------------------------------------------------------------------------------");
         System.out.println("1. ��� | 2. ����(create) |3.�б�(read) | 4.����(update) | 5. ����(Delete) | 6. ����");
         System.out.println("------------------------------------------------------------------------------");
         System.out.print("�޴����� : ");

         input = scanner.nextLine();

         if(input.equals("1")) {               //���

            System.out.println("-----------------------------------------------------------------");
            System.out.println("��ȣ\t����\t����\t�۾���\t��ȸ��");
            System.out.println("-----------------------------------------------------------------");

            int[] check = new int[100];      //����� �Խù����� �ƴ��� check�� �迭

            for(int i =0; i<boardArray.length; i++) {      //�Խù��� ����� for��

               if(boardArray[i][0] == null) {            //�Խù��� null�ΰ�� pass
                  continue;
               }
               
               int max =0;            //���� ū �Խ��� ��ȣ �ʱⰪ 0
               int index = -1;         //�Խ��� ��ȣ�� ���� Ŭ ���� �迭 �ε���
               
               for(int j =0; j<boardArray.length; j++) {      //���� ū �Խ��� ��ȣ�� ã�� ���� for��
                  
                  if(boardArray[j][0] == null) {            //null�ΰ�� pass
                     continue;
                  }
                  
                  int bno = Integer.parseInt(boardArray[j][0]);      //���� �Խ��� ��ȣ
                  
                  if(max <= bno && check[j]==0) {      //�Խ��� ��ȣ�� ���� ū ���̸鼭 ������� ���� �Խù��̸�
                     
                        max = bno;               //�Խ��� ��ȣ�� max�� ����
                        index = j;               //�Խ��� ��ȣ�� ���� ū �迭 �ε��� 
                     }
               }
               
               if(index != -1) {         
                  System.out.print(boardArray[index][0] + "\t");
                  System.out.print(boardArray[index][1] + "\t");
                  System.out.print(boardArray[index][2] +"\t");
                  System.out.print(boardArray[index][3] +"\t");
                  System.out.println(boardArray[index][4]);
                  check[index] = 1;         //����� �Խù� üũ
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

            System.out.println("-----------------------------------------------------------------");
            System.out.println("��ȣ\t����\t����\t�۾���\t��ȸ��");
            System.out.println("-----------------------------------------------------------------");

            int[] check = new int[100];

            for(int i =0; i<boardArray.length; i++) {

               if(boardArray[i][0] == null) {
                  continue;
               }
               
               int max =0;            //���� ū �Խ��� ��ȣ
               int index=0;         //�Խ��� ��ȣ�� ���� Ŭ ���� �迭 �ε���
               
               for(int j =0; j<boardArray.length; j++) {
                  
                  if(boardArray[j][0] == null) {         //null�� ��� continue
                     continue;
                  }
                  
                  if(max <= Integer.parseInt(boardArray[j][0]) && check[j]==0) {
                     
                        max = Integer.parseInt(boardArray[j][0]);
                        index = j;
                     }
               }
               if(index != -1) {
                  System.out.print(boardArray[index][0] + "\t");
                  System.out.print(boardArray[index][1] + "\t");
                  System.out.print(boardArray[index][2] +"\t");
                  System.out.print(boardArray[index][3] +"\t");
                  System.out.println(boardArray[index][4]);
                  check[index] = 1;
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
            System.out.println("-----------------------------------------------------------------");
            System.out.println("��ȣ\t����\t����\t�۾���\t��ȸ��");
            System.out.println("-----------------------------------------------------------------");

            int[] check = new int[100];

            for(int i =0; i<boardArray.length; i++) {

               if(boardArray[i][0] == null) {
                  continue;
               }
               
               int max =0;            //�������� ����
               int mIndex=0;         //�Խ��� ��ȣ�� ���� Ŭ ���� �迭 �ε���
               
               for(int j =0; j<boardArray.length; j++) {
                  
                  if(boardArray[j][0] == null) {
                     continue;
                  }
                  
                  if(max <= Integer.parseInt(boardArray[j][0]) && check[j]==0) {
                     
                        max = Integer.parseInt(boardArray[j][0]);
                        mIndex = j;
                     }
               }
               if(mIndex != -1) {
                  System.out.print(boardArray[mIndex][0] + "\t");
                  System.out.print(boardArray[mIndex][1] + "\t");
                  System.out.print(boardArray[mIndex][2] +"\t");
                  System.out.print(boardArray[mIndex][3] +"\t");
                  System.out.println(boardArray[mIndex][4]);
                  check[mIndex] = 1;
               }
            }

         }else if(input.equals("5")) {         //����

            System.out.println("��ȣ : ");
            input = scanner.nextLine();

            for(int i=0; i<boardArray.length; i++) {
               for(int j=0; j<5;j++) {
                  if(boardArray[i][0]!=null && boardArray[i][0].equals(input)) {
                     boardArray[i][j] = null;
                     break;
                  }
               }
            }

            //��� �����ֱ�
            System.out.println("-----------------------------------------------------------------");
            System.out.println("��ȣ\t����\t����\t�۾���\t��ȸ��");
            System.out.println("-----------------------------------------------------------------");

            int[] check = new int[100];

            for(int i =0; i<boardArray.length; i++) {

               if(boardArray[i][0] == null) {
                  continue;
               }
               
               int max =0;            //�������� ����
               int mIndex=0;         //�Խ��� ��ȣ�� ���� Ŭ ���� �迭 �ε���
               
               for(int j =0; j<boardArray.length; j++) {
                  
                  if(boardArray[j][0] == null) {
                     continue;
                  }
                  
                  if(max <= Integer.parseInt(boardArray[j][0]) && check[j]==0) {
                     
                        max = Integer.parseInt(boardArray[j][0]);
                        mIndex = j;
                     }
               }
               if(mIndex != -1) {
                  System.out.print(boardArray[mIndex][0] + "\t");
                  System.out.print(boardArray[mIndex][1] + "\t");
                  System.out.print(boardArray[mIndex][2] +"\t");
                  System.out.print(boardArray[mIndex][3] +"\t");
                  System.out.println(boardArray[mIndex][4]);
                  check[mIndex] = 1;
               }
            }

         }else if(input.equals("6")) {                           //����

            System.out.println("���α׷��� ����");
            run = false;
         }

      }

   }

}