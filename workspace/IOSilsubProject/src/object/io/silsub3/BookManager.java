package object.io.silsub3;

import java.io.*;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class BookManager {
	
	protected Scanner sc = new Scanner(System.in);

	public BookManager() {
		super();
	}
	
	public void fileSave() {

		Book books[] = {new Book("도서1","저자1",10000,new GregorianCalendar(2017, 5, 1),0.1),
							new Book("도서2","저자2",30000,new GregorianCalendar(2016, 9, 1),0.2),
							new Book("도서3","저자3",20000,new GregorianCalendar(2017, 3, 1),0.15),
							new Book("도서4","저자4",50000,new GregorianCalendar(2015, 12, 1),0.3),
							new Book("도서5","저자5",40000,new GregorianCalendar(2017, 1, 1),0.25)};
		
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.dat"));) {
			//oos = new ObjectOutputStream(new FileOutputStream("books.dat"));
			for(int i = 0;i<books.length;i++){
				oos.writeObject(books[i]);
			}
			oos.flush();
			System.out.println("books.dat 에 저장 완료!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			/*
			 try {
			
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 */
		}
		
	}
	
	public void  fileRead() {
		Book[] books = new Book[10];
		ObjectInputStream ois = null;
		int i=0;
		try {
			ois = new ObjectInputStream(new FileInputStream("books.dat"));
			while(true){
				books[i]=(Book)ois.readObject();
				i++;
			}
		}catch (EOFException e) {
			for(int j=0;j<i;j++){
				System.out.println(books[j]);
			}
			System.out.println("파일 읽기 완료!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
}
