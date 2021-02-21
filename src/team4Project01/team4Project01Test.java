package team4Project01;
import java.util.Scanner;

public class team4Project01Test {

	public static void main(String[] args) {
		
		String[][] boardArray = new String[100][5];		//게시물을 저장할 배열
		
		Scanner scanner = new Scanner(System.in);
		int count=0; // 게시물 번호
		
		while(true) {				//false이면 종료	//메뉴 출력
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.println("1. 목록 | 2. 생성(Create) | 3. 읽기(Read) | 4. 수정(Update) | 5. 삭제(Delete) | 6. 인기글 TOP5 |  7. 종료");
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.print("메뉴선택: ");
			
			String selectNo = scanner.nextLine();		//메뉴 번호를 받아옴
			
			
			if(selectNo.equals("1")) {			//목록

				// 변경 -> 조회수 반영 목록
				// 조회수 세기 로직
				int boardCount = 0 ;	//총 게시물을 셀 변수, for문
				for(int i=0; i < boardArray.length; i++) {		//boardArray를 탐색하며 게시물이 있는 경우(null이 아닐 경우) boardCount 증가
					if(boardArray[i][0] != null) {
						boardCount++;
					}
					
				}
				System.out.println("------------------------------------------------------------------------------------------------");
				System.out.println("총 게시물 수 : " + boardCount);
				System.out.println("------------------------------------------------------------------------------------------------");
				
				System.out.print("번호" + "\t");
				System.out.print("제목" + "\t\t\t\t" );
				System.out.print("내용" + "\t\t\t\t");
				System.out.print("글쓴이" + "\t\t");
				System.out.print("조회수" + "\t\n");
				System.out.println("------------------------------------------------------------------------------------------------");
				
				int[] check = new int[100]; // 출력한 게시물인지 아닌지 check하는 배열 
				
				for(int i=0;i<boardArray.length;i++) { // 게시물 목록을 출력할 for 문
					if(boardArray[i][0]==null) { // 게시물이 null인 경우 continue
						continue;
					}
					int max = 0; //가장 큰 게시판 번호를 저장 초기값 0
					int index = -1;   //게시판 번호가 가장 클 때의 배열 인덱스
					for(int j=0;j<boardArray.length;j++) {	//가장 큰 게시판 번호를 찾기 위한 for문
						if(boardArray[j][0]==null) { // 게시물이 null인 경우
							continue;
						}
						int num = Integer.parseInt(boardArray[j][0]); // 현재 게시판 번호
						if(max<=num && check[j]==0) { //게시판 번호가 가장 큰 값이면서 출력하지 않은 게시물이면
							max=num; //게시판 번호를 max에 저장
							index=j; //게시판 번호가 가장 큰 게시물의 인덱스 
						}
					}
					
					if(index!=-1) { //출력할 게시물이 있는가? -1일 경우 출력할 게시물 없음, -1이 아닐경우 출력할 게시물 있음
						System.out.print(boardArray[index][0] + "\t");
						System.out.print(boardArray[index][1] + "\t\t\t\t" );
						System.out.print(boardArray[index][2] + "\t\t\t\t");
						System.out.print(boardArray[index][3] + "\t\t");
						System.out.print(boardArray[index][4] + "\t\n");
						check[index]=1; //출력한 게시물 체크
					}
					
				}			
				
				
			} else if(selectNo.equals("2")) {		//생성
				System.out.print("제목: ");
				String title = scanner.nextLine();
				System.out.print("내용: ");
				String content = scanner.nextLine();
				System.out.print("글쓴이: ");
				String writer = scanner.nextLine();
				
				for(int i=0;i<boardArray.length;i++) {
					if(boardArray[i][0]==null) {		//boardArray중에서 가장 맨 앞의 null인 부분에 저장하기 위해
						count++; // 저장할 때 자동으로 게시물 번호 1증가 (게시물 번호)
						String[] arr = {					//위에서 받아온 제목,내용,글쓴이를 일차원 배열로 만들어서 저장
								String.valueOf(count),
								title,
								content,
								writer,
								"0"
						};
						
						boardArray[i] = arr;		//arr을 boardArray[i](null인부분)에 저장
						break;		//저장했으면 for문 나감(저장 완료)
					}
				}
				
				//생성 후 목록보기
				// 변경 -> 조회수 반영 목록
				// 조회수 세기 로직
				int boardCount = 0 ;
				for(int i=0; i < boardArray.length; i++) {
					if(boardArray[i][0] != null) {
						boardCount++;
					}
					
				}
				System.out.println("------------------------------------------------------------------------------------------------");
				System.out.println("총 게시물 수 : " + boardCount);
				System.out.println("------------------------------------------------------------------------------------------------");
				
				System.out.print("번호" + "\t");
				System.out.print("제목" + "\t\t\t\t" );
				System.out.print("내용" + "\t\t\t\t");
				System.out.print("글쓴이" + "\t\t");
				System.out.print("조회수" + "\t\n");
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
				

				
			} else if(selectNo.equals("3")) {			//읽기
				System.out.print("번호: ");
				String number = scanner.nextLine();	//게시물 번호를 받아옴
				int i2 = -1; // 게시물이 있는지 없는지 체크, 게시물 번호가 일치하는 게시물의 인덱스 저장
				int hits;		//조회수
				for(int i=0;i<boardArray.length;i++) {		//boardArray의 게시물을 탐색하기 위한 for 
					if(boardArray[i][0]==null) {		//null이면 continue(다음 게시물로 ) 
						continue;
					}
					else if(boardArray[i][0].equals(number)) {	//null아니고 입력된 게시물 번호와 boardArray의 게시물 번호가 일치하면 
						i2=i;		//i2에 해당 게시물의 인덱스 저장 
					}
				}
				
				if(i2==-1) {		//게시물이 없을 때
					System.out.println("게시물이 존재하지 않습니다.");
				} else {
					System.out.println("제목: " + boardArray[i2][1]);
					System.out.println("내용: " + boardArray[i2][2]);
					System.out.println("글쓴이: " + boardArray[i2][3]);
					hits = Integer.parseInt(boardArray[i2][4]);	//String-> int		
					hits++;		//조회수 1증가
					boardArray[i2][4]=String.valueOf(hits);		//해당 게시물에 증가된 조회수 저장
					System.out.println("조회수: " + boardArray[i2][4]);	
				}
				
				
				
			} else if(selectNo.equals("4")) {			//수정
				System.out.print("번호: ");
				String number = scanner.nextLine();
				int i2 = -1; //  게시물이 있는지 없는지 체크, 게시물 번호가 일치하는 게시물의 인덱스 저장
				for(int i=0;i<boardArray.length;i++) {//boardArray의 게시물을 탐색하기 위한 for 
					if(boardArray[i][0]==null) {//null이면 continue(다음 게시물로 ) 
						continue;
					}
					else if(boardArray[i][0].equals(number)) {//null아니고 입력된 게시물 번호와 boardArray의 게시물 번호가 일치하면 
						i2=i; //i2에 해당 게시물의 인덱스 저장 
					}
				}
				
				if(i2==-1) {//게시물이 없을 때
					System.out.println("게시물이 존재하지 않습니다.");
				} else {
					System.out.println("기존제목: " + boardArray[i2][1]);	//해당 게시물의 기존 제목 출력
					System.out.print("수정제목: ");			
					String title = scanner.nextLine();		//수정할 제목 받아옴
					if(!title.equals("")) {			//수정할 제목이 공백이 아닐 경우
						boardArray[i2][1]=title;	//해당 게시물의 제목 수정
					}
					System.out.println("기존내용: " + boardArray[i2][2]);	//해당 게시물의 기존 내용 출력
					System.out.print("수정내용: ");
					String content = scanner.nextLine();		//수정할 내용 받아옴
					if(!content.equals("")) {		//수정할 내용이 공백이 아닐 경우
						boardArray[i2][2]=content;		//해당 게시물의 내용 수정
					}
					
					//수정 후 목록 보여주기
					// 변경 -> 조회수 반영 목록
					// 조회수 세기 로직
					int boardCount = 0 ;
					for(int i=0; i < boardArray.length; i++) {
						if(boardArray[i][0] != null) {
							boardCount++;
						}
						
					}
					System.out.println("------------------------------------------------------------------------------------------------");
					System.out.println("총 게시물 수 : " + boardCount);
					System.out.println("------------------------------------------------------------------------------------------------");
					
					System.out.print("번호" + "\t");
					System.out.print("제목" + "\t\t\t\t" );
					System.out.print("내용" + "\t\t\t\t");
					System.out.print("글쓴이" + "\t\t");
					System.out.print("조회수" + "\t\n");
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
				
			
			} else if(selectNo.equals("5")) {		//삭제
				System.out.print("번호: ");
				String number = scanner.nextLine();
				int i2 = -1;	//  게시물이 있는지 없는지 체크, 게시물 번호가 일치하는 게시물의 인덱스 저장
				for(int i=0;i<boardArray.length;i++) {	//boardArray의 게시물을 탐색하기 위한 for 
					if(boardArray[i][0]==null) {//null이면 continue(다음 게시물로 ) 
						continue;
					}
					else if(boardArray[i][0].equals(number)) {//null아니고 입력된 게시물 번호와 boardArray의 게시물 번호가 일치하면 
						i2=i;	//i2에 해당 게시물의 인덱스 저장 
					}
				}
				
				if(i2==-1) {		//게시물이 없을 때 
					System.out.println("게시물이 존재하지 않습니다.");
				} else {	//해당 게시물 null로 변환(삭제)
					for(int j=0;j<boardArray[i2].length;j++) {
						boardArray[i2][j]=null;
					}
					
					//삭제 후 목록 보여주기
					// 변경 -> 조회수 반영 목록
					// 조회수 세기 로직
					int boardCount = 0 ;
					for(int i=0; i < boardArray.length; i++) {
						if(boardArray[i][0] != null) {
							boardCount++;
						}
						
					}
					System.out.println("------------------------------------------------------------------------------------------------");
					System.out.println("총 게시물 수 : " + boardCount);
					System.out.println("------------------------------------------------------------------------------------------------");
					
					System.out.print("번호" + "\t");
					System.out.print("제목" + "\t\t\t\t" );
					System.out.print("내용" + "\t\t\t\t");
					System.out.print("글쓴이" + "\t\t");
					System.out.print("조회수" + "\t\n");
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
				
				
			} else if(selectNo.equals("6")) {			//새로운 기능 : 인기글 TOP5
				int topCount = 1; // 1위~5위
				int[] check = new int[100];		//조회수 내립차순
				
				System.out.println("------------------------------------------------------------------------------------------------------");
				System.out.print("순위" + "\t");
				System.out.print("번호" + "\t");
				System.out.print("제목" + "\t\t\t\t" );
				System.out.print("내용" + "\t\t\t\t");
				System.out.print("글쓴이" + "\t\t");
				System.out.print("조회수" + "\t\n");
				System.out.println("------------------------------------------------------------------------------------------------------");
				
				for(int i=0;i<boardArray.length;i++) {		//boardArray의 게시물을 탐색하기 위한 for 
					if(boardArray[i][0]==null) {		//i번째 게시물이 null일 경우 continue(다음 i)
						continue;
					} else {
						if (topCount > 5) { // 인기글 5개를 넘어가면? 나간다
							break;
						} else {
							int max = 0;		//가장 큰 조회수를 저장할 변수
							int index = -1;		//조회수가 가장 클 때의 배열 인덱스
							for(int j=0;j<boardArray.length;j++) {
								if(boardArray[j][4]==null) { //  조회수가 null이면 넘어가기
									continue;
								}
								int num = Integer.parseInt(boardArray[j][4]);		//String -> int
								if(max<=num && check[j]==0) { // 출력하지 않은 게시물이고 조회수가 가장 클 때
									max=num;		//가장 큰 조회수 max저장
									index=j;		//해당 게시물의 인덱스를 저장
								}
							}
							
							if(index!=-1) { // 출력할 게시물이 있는가?		-1이면 출력할 게시물 없음, -1이 아니면 출력할 게시물 있음
								if(boardArray[index][4].equals("0")) { // 게시물의 조회수가 0이라면 보여주지 않는다
									break;
								} else {
									System.out.print(topCount + "위\t");
									System.out.print(boardArray[index][0] + "\t");
									System.out.print(boardArray[index][1] + "\t\t\t\t" );
									System.out.print(boardArray[index][2] + "\t\t\t\t");
									System.out.print(boardArray[index][3] + "\t\t");
									System.out.print(boardArray[index][4] + "\t\n");
									check[index]=1; // 출력한 게시물 체크
									topCount++; // 다음 순위 표시
								}
								
							}
							
						}
					}
				
				}	

			} else if(selectNo.equals("7")) {		//종료
				System.out.println("프로그램 종료");
				break;
				
			} else {		//메뉴를 잘못 입력했을 경우
				System.out.println("다시 선택해주세요.");
			}
			
			System.out.println();
		}
		
	}

}