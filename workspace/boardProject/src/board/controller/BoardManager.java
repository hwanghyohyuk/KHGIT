package board.controller;

import java.io.*;
import java.util.*;

import board.model.vo.*;

public class BoardManager {
	
	private ArrayList<Board> list = new ArrayList<Board>();
	private int boardNo = 0;
	private Scanner sc = new Scanner(System.in);

	public BoardManager() {
		super();
		Board obj = null;
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("board_list.dat"))){
			while((obj = (Board)ois.readObject())!=null) {
				list.add(obj);
			}
		} catch (EOFException e) {
			System.out.println("파일불러오기 완료");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	 public void writeBoard(){
		 System.out.println("새 게시글 쓰기 입니다.");
		 System.out.print("글제목 : ");
		 String boardTitle = sc.nextLine();
		 System.out.print("작성자 : ");
		 String boardWriter = sc.next();
		 sc.nextLine();
		 //작성날짜
		 Date boardDate = new Date();	
		 System.out.println("글내용 : ");
		 StringBuilder sb = new StringBuilder();
		 String line=null;
		 do {			
			 line = sc.nextLine();
			 if(line.equals("exit"))break;
			 sb.append(line+"\n");
		} while (true);		
		 String boardContents = sb.toString();
		 boardNo++;
		 Board newBoard = new Board(boardNo, boardTitle, boardWriter, boardDate, boardContents, 0);
		 list.add(newBoard);		
		 System.out.println("성공적으로 글이 등록되었습니다.");
	 }
	 
	 public void displayAllList(){
		 int i=0;
		 while(i<list.size()) {
			 System.out.println(list.get(i).toString());
			 i++;
		 }
		 System.out.println("검색된 게시물 수 : " +i);
	 }
	 public void displayBoard(){
		 System.out.print("조회할 글 번호 :");
		 int bNo = sc.nextInt();
		 sc.nextLine(); 
		 int i = 0;
		 while(i<list.size()) {
			 if(list.get(i).getBoardNo()==bNo) {
				 list.get(i).setReadCount(list.get(i).getReadCount()+1);
				 System.out.println(list.get(i).toString());
			 }
			 i++;
		 }
	 }
	 public void modifyTitle(){
		 System.out.print("수정할 글 번호 :");
		 int bNo = sc.nextInt();	
		 sc.nextLine(); 
		 int i = 0;
		 while(i<list.size()) {
			 if(list.get(i).getBoardNo()==bNo) {
				 System.out.println(list.get(i).getBoardTitle());
				 System.out.print("변경할 제목 : ");
				 String mTitle = sc.nextLine();
				 list.get(i).setBoardTitle(mTitle);
			 }
			 i++;
		 }		 
		 System.out.println("성공적으로 글 제목이 수정 되었습니다.");
	 }
	 public void modifyContent(){
		 System.out.print("수정할 글 번호 : ");
		 int bNo = sc.nextInt();	
		 sc.nextLine(); 
		 int i = 0;
		 while(i<list.size()) {
			 if(list.get(i).getBoardNo()==bNo) {
				 System.out.println(list.get(i).getBoardContent());
				 System.out.println("변경할 내용 : ");
				 StringBuilder sb = new StringBuilder();
				 String line=null;
				 do {			
					 line = sc.nextLine();
					 if(line.equals("exit"))break;
					 sb.append(line+"\n");
				} while (true);		
				 String mContents = sb.toString();
				 list.get(i).setBoardContent(mContents);
			 }
			 i++;
		 }		 
		 System.out.println("성공적으로 글 내용이 수정 되었습니다.");	 
	 }
	 public void deleteBoard(){
		 System.out.print("삭제할 글 번호 :");
		 int bNo = sc.nextInt();
		 int i = 0;
		 while(i<list.size()) {
			 if(list.get(i).getBoardNo()==bNo) {
				 System.out.println(list.get(i).getBoardContent());
				 System.out.print("정말로 삭제하시겠습니까? (y/n) : ");
				 if(sc.next().toUpperCase().charAt(0)=='Y') {
					 list.remove(i);	
					 System.out.println(bNo+"번 글이 삭제 되었습니다.");
				 }
			 }
			 i++;
		 }
	 }
	 public void searchBoard(){
		 System.out.print("검색할 글 제목 :");
		 String bTitle = sc.next();
		 sc.nextLine();
		 int i = 0;
		 int boardCount=0;
		 System.out.println("다음은 검색한 내용입니다.");
		 while(i<list.size()) {
			 if(list.get(i).getBoardTitle().contains(bTitle)) {
				System.out.println(list.get(i).toString());		
				boardCount++;
			 }
			 i++;
		 }
		 System.out.println("검색된 게시물 수 : " +boardCount);
	 }
	 
	 public void saveListFile(){
		 try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("board_list.dat"))){
			 for(int i=0;i<list.size();i++) {
				 oos.writeObject(list.get(i));
			 }			 
			 oos.flush();
			 System.out.println("board_list.dat 에 성공적으로 저장되었습니다.");
		 } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		 
	 }
	 
	 public void sortList(int item, boolean isDesc){	 
		 Board[] boards = new Board[list.size()];
		 switch (item) {
		 case 1:	
			 if(isDesc) {//true면 번호 내림차순
				list.sort(new DescBoardNo());				
			 }else{//false면 번호 오름차순
				list.sort(new AscBoardNo());
			}
			break;
		 case 2:	
			 if(isDesc) {//true면 날짜 내림차순
				list.sort(new DescBoardDate());
			 
			 }else{//false면 날짜 오름차순
				list.sort(new AscBoardDate());
			}
			break;
		case 3:	
			if(isDesc) {//true면 제목 내림차순
				list.sort(new DescBoardTitle());
			}else{//false면 제목 오름차순
				list.sort(new AscBoardTitle());
			}
			break;
		default:
			return;
		}
		System.out.println("정상적으로 정렬되었습니다.");
		displayAllList();
	 }
}
