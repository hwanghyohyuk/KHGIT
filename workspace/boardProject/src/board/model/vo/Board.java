package board.model.vo;

import java.io.Serializable;
import java.util.*;
import java.text.SimpleDateFormat;

public class Board implements Serializable{
	
	private int boardNo;
	private String boardTitle;
	private String boardWriter;
	private Date boardDate;
	private String boardContent;
	private int readCount;
	
	public Board() {
		super();
	}

	public Board(int boardNo, String boardTitle, String boardWriter, Date boardDate, String boardContent,
			int readCount) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardWriter = boardWriter;
		this.boardDate = boardDate;
		this.boardContent = boardContent;
		this.readCount = readCount;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardWriter() {
		return boardWriter;
	}

	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}

	public Date getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		
		// TODO Auto-generated method stub
		return "-------------------------------------------------\n"
				+"글 번호 : "+ this.boardNo + "\n"
				+"글 제목 : "+ this.boardTitle + "\n"
				+"작성자 : "+ this.boardWriter + "\n"
				+"작성 날짜 : "+ sdf.format(this.boardDate.getTime()) + "\n"
				+"글 내용 \t\t\t 조회수 : "+this.readCount+"\n"
				+"--------------------------------------------------\n"
				+this.boardContent
				+"--------------------------------------------------\n";
				
				
				
				
				
	}

	
}
