package practice3;

import java.util.*;

import practice2.Book;

public class BookManagerMap {
	private HashMap<Object, Object> booksMap;

	public BookManagerMap() {
		super();
		booksMap = new HashMap<>();
	}

	public BookManagerMap(HashMap<Object, Object> booksMap) {
		super();
		this.booksMap = booksMap;
	}

	public void putBook(Book book) {
		try {
			this.booksMap.put(book.getbNo(), book);
			System.out.println("성공적으로 추가되었습니다.");
		} catch (NullPointerException e) {
			System.out.println("도서 추가 오류 발생");
			e.printStackTrace();
			return;
		}
	}

	public void removeBook(String key) {
		try {
			this.booksMap.remove(key);
			System.out.println("성공적으로 삭제되었습니다.");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("삭제하던 도중 오류가 발생하였습니다.");
			e.printStackTrace();
		}
	}

	public String searchBook(String bTitle) {
		Set entries = this.booksMap.entrySet();
		Iterator iter = entries.iterator();
		System.out.println(bTitle);
		while(iter.hasNext()){
			Map.Entry entry = (Map.Entry)iter.next();
			String key = (String)entry.getKey();//도서번호 String 이 키
			Book value = (Book)entry.getValue();
			if(value.getTitle().equals(bTitle)){//문자열 비교는 항상 equals
				return key;
			}
		}
		return null;
	}

	public void displayAll() {
		for (Object value: this.booksMap.values()) {
			System.out.println(value.toString());
		}
		}

	public Book[] sortedBookMap() {
		ArrayList booklist = new ArrayList();
		booklist.addAll(this.booksMap.values());
		Book[] books =new Book[this.booksMap.size()];
		booklist.sort(new AscTitle());	
		booklist.toArray(books);
		return books;
	}
	
	public void printBookMap(Book[] br) {
		for (Book b : br) {
			System.out.println(b.toString());
		}		
	}

	public void printBook(String key) {
		try {
			Book result= (Book) this.booksMap.get(key);
			System.out.println("찾으시는 도서는 다음과 같습니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("찾으시는 도서가 없습니다.");
			e.printStackTrace();
			return;
		}		
	}
}

