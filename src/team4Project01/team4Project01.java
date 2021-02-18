package team4Project01;

import java.util.Scanner;

public class team4Project01 {

   public static void main(String[] args) {

      boolean run = true;

      int boardNum = 0;      //게시물 번호
      String title = null;
      String content = null;
      String writer = null;

      String mTitle = null;         //수정한 제목
      String mContent = null;         //수정한 내용

      String[][] boardArray = new String[100][5];

      Scanner scanner = new Scanner(System.in);
      String input;

      while(run) {
         System.out.println("------------------------------------------------------------------------------");
         System.out.println("1. 목록 | 2. 생성(create) |3.읽기(read) | 4.수정(update) | 5. 삭제(Delete) | 6. 종료");
         System.out.println("------------------------------------------------------------------------------");
         System.out.print("메뉴선택 : ");

         input = scanner.nextLine();

         if(input.equals("1")) {               //목록

            System.out.println("-----------------------------------------------------------------");
            System.out.println("번호\t제목\t내용\t글쓴이\t조회수");
            System.out.println("-----------------------------------------------------------------");

            int[] check = new int[100];      //출력한 게시물인지 아닌지 check할 배열

            for(int i =0; i<boardArray.length; i++) {      //게시물을 출력할 for문

               if(boardArray[i][0] == null) {            //게시물이 null인경우 pass
                  continue;
               }
               
               int max =0;            //가장 큰 게시판 번호 초기값 0
               int index = -1;         //게시판 번호가 가장 클 때의 배열 인덱스
               
               for(int j =0; j<boardArray.length; j++) {      //가장 큰 게시판 번호를 찾기 위한 for문
                  
                  if(boardArray[j][0] == null) {            //null인경우 pass
                     continue;
                  }
                  
                  int bno = Integer.parseInt(boardArray[j][0]);      //현재 게시판 번호
                  
                  if(max <= bno && check[j]==0) {      //게시판 번호가 가장 큰 값이면서 출력하지 않은 게시물이면
                     
                        max = bno;               //게시판 번호를 max에 저장
                        index = j;               //게시판 번호가 가장 큰 배열 인덱스 
                     }
               }
               
               if(index != -1) {         
                  System.out.print(boardArray[index][0] + "\t");
                  System.out.print(boardArray[index][1] + "\t");
                  System.out.print(boardArray[index][2] +"\t");
                  System.out.print(boardArray[index][3] +"\t");
                  System.out.println(boardArray[index][4]);
                  check[index] = 1;         //출력한 게시물 체크
               }
            }

         }else if(input.equals("2")) {         //생성
            boardNum++;
            System.out.print("제목 : ");
            title = scanner.nextLine();
            System.out.print("내용 : ");
            content = scanner.nextLine();
            System.out.print("글쓴이 : ");
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
            //목록 보여주기

            System.out.println("-----------------------------------------------------------------");
            System.out.println("번호\t제목\t내용\t글쓴이\t조회수");
            System.out.println("-----------------------------------------------------------------");

            int[] check = new int[100];

            for(int i =0; i<boardArray.length; i++) {

               if(boardArray[i][0] == null) {
                  continue;
               }
               
               int max =0;            //가장 큰 게시판 번호
               int index=0;         //게시판 번호가 가장 클 때의 배열 인덱스
               
               for(int j =0; j<boardArray.length; j++) {
                  
                  if(boardArray[j][0] == null) {         //null일 경우 continue
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

         }else if(input.equals("3")) {         //읽기

            System.out.print("번호 : ");
            input = scanner.nextLine();

            for(int i=0; i<boardArray.length; i++) {
               if(boardArray[i][0]!=null && boardArray[i][0].equals(input)) {

                  int mCount = 0;      //조회수                           
                  mCount = Integer.parseInt(boardArray[i][4]);
                  mCount++;                              //조회수 증가
                  boardArray[i][4] = String.valueOf(mCount);

                  System.out.println("제목 : " + boardArray[i][1]);
                  System.out.println("내용 : " + boardArray[i][2]);
                  System.out.println("글쓴이 : " + boardArray[i][3]);
                  System.out.println("조회수 : " + boardArray[i][4]);
                  break;
               }
            }


         }else if(input.equals("4")) {         //수정

            System.out.print("번호 : ");
            input = scanner.nextLine();

            for(int i=0; i<boardArray.length; i++) {
               if(boardArray[i][0]!=null && boardArray[i][0].equals(input)) {
                  System.out.println("기존 제목 : " + boardArray[i][1]);
                  System.out.print("수정 제목 : ");
                  mTitle = scanner.nextLine();
                  if(!mTitle.equals("")) {
                     boardArray[i][1] = mTitle;
                  }

                  System.out.println("기존 내용 : " + boardArray[i][2]);
                  System.out.print("수정 제목 : ");
                  mContent = scanner.nextLine();
                  if(!mContent.equals("")) {
                     boardArray[i][2] = mContent;
                  }
               }
               continue;
            }

            //목록 보여주기
            System.out.println("-----------------------------------------------------------------");
            System.out.println("번호\t제목\t내용\t글쓴이\t조회수");
            System.out.println("-----------------------------------------------------------------");

            int[] check = new int[100];

            for(int i =0; i<boardArray.length; i++) {

               if(boardArray[i][0] == null) {
                  continue;
               }
               
               int max =0;            //내림차순 정렬
               int mIndex=0;         //게시판 번호가 가장 클 때의 배열 인덱스
               
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

         }else if(input.equals("5")) {         //삭제

            System.out.println("번호 : ");
            input = scanner.nextLine();

            for(int i=0; i<boardArray.length; i++) {
               for(int j=0; j<5;j++) {
                  if(boardArray[i][0]!=null && boardArray[i][0].equals(input)) {
                     boardArray[i][j] = null;
                     break;
                  }
               }
            }

            //목록 보여주기
            System.out.println("-----------------------------------------------------------------");
            System.out.println("번호\t제목\t내용\t글쓴이\t조회수");
            System.out.println("-----------------------------------------------------------------");

            int[] check = new int[100];

            for(int i =0; i<boardArray.length; i++) {

               if(boardArray[i][0] == null) {
                  continue;
               }
               
               int max =0;            //내림차순 정렬
               int mIndex=0;         //게시판 번호가 가장 클 때의 배열 인덱스
               
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

         }else if(input.equals("6")) {                           //종료

            System.out.println("프로그램을 종료");
            run = false;
         }

      }

   }

}