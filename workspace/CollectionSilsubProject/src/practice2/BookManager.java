package practice2;

import java.util.ArrayList;

public class BookManager {

	private ArrayList<Book> bookList = null;

	public BookManager() {
		super();
		this.bookList = new ArrayList<Book>();
	}

	public BookManager(ArrayList<Book> bookList) {
		super();
		this.bookList = bookList;
	}

	public void addBook(Book book) {
		try {
			this.bookList.add(book);
			System.out.println("성공적으로 추가되었습니다.");
		} catch (NullPointerException e) {
			System.out.println("도서 추가 오류 발생");
			e.printStackTrace();
			return;
		}

	}

	public void deleteBook(int index) {
		try {
			this.bookList.remove(index);
			System.out.println("성공적으로 삭제되었습니다.");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("삭제하던 도중 오류가 발생하였습니다.");
			e.printStackTrace();
		}
		
	}

	public int searchBook(String bTitle) {
		int i=0;
		while (i < this.bookList.size()) {
			if(this.bookList.get(i).getTitle().equals(bTitle)){
				return i;
			}
			i++;
		}
		return -1;
	}

	public void printBook(int index) {
		try {
			String result= this.bookList.get(index).toString();
			System.out.println("찾으시는 도서는 다음과 같습니다.");
			System.out.println(result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("찾으시는 도서가 없습니다.");
			e.printStackTrace();
			return;
		}		
	}

	public void displayAll() {
		int i = 0;
		while (i < this.bookList.size()) {
			System.out.println(this.bookList.get(i).toString());
			i++;
		}
	}

	public Book[] sortedBookList() {
		/*
		Object[] objArr = this.bookList.toArray();
		Object temp = null;
		for(int i=0;i<objArr.length;i++){
			for(int j=i+1;j<objArr.length;j++){
				if(new AscCategory().compare(objArr[i],objArr[j])==1){
					temp = objArr[i];
					objArr[i] = objArr[j];
					objArr[j] = temp;
				}
			}
		}
		Book[] books =new Book[this.bookList.size()];
		for(int i = 0 ; i < this.bookList.size() ; i++){
			books[i]=(Book)objArr[i];
		}
		
		
		*/
		
		this.bookList.sort(new AscCategory());
		Book[] book2 =new Book[this.bookList.size()];
		this.bookList.toArray(book2);
		
		
		return book2;
	}

	public void printBookList(Book[] br) {
		for (Book b : br) {
			System.out.println(b.toString());
		}
	}
}
