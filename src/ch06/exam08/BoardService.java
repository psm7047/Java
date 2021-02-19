package ch06.exam08;

public class BoardService {

	//field
	int count;
	String[][] boards;
	/*
	 * {
	 * 		{"1", "제목1", "내용1", "글쓴이1","3"}
	 * }
	 */

	//constructor
	BoardService(int rows, int columns) {

		boards = new String[rows][columns];
	}

	//method
	int getNewBno() {
		return ++count;
	}
	void create(String title, String content, String writer, int hitcount) {

		int bno = getNewBno();

		String[] board = {String.valueOf(bno), 
				title,
				content,
				writer,
				String.valueOf(hitcount)};

		for(int i=0; i<boards.length;i++) {
			if(boards[i][0]==null) {
				boards[i] = board;
				break;
			}
		}

	}
	void showList() {

		for(int i=0; i<boards.length;i++) {
			for(int j =0; j<boards[i].length; j++) {
				System.out.print(boards[i][j] + "\t");
			}
			System.out.println();
		}
	}

	String[] read(int bno) {
		String[] result = null;
		String strBno = String.valueOf(bno);

		for(int i=0; i<boards.length;i++) {
			if(boards[i][0] != null) {
				if(boards[i][0].equals(strBno)) {
					result = boards[i];
					break;
				}
			}
		}
		return result;
	}

}
