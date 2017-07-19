package test.object.io;

import java.io.*;

public class ObjectIOSample  {

	public ObjectIOSample() {}
	
	public void	ObjFileSave() {
		User users[] = {new User("user11","pass11","홍길동"),
							new User("user22","pass22","이순신"),
							new User("user33","pass33","김춘추")};
		ObjectOutputStream oos = null;
		
		try{
			oos = new ObjectOutputStream(new FileOutputStream("users.dat"));
			
			for(int i=0;i<users.length;i++){
				oos.writeObject(users[i]);			
			}
			oos.flush();
			System.out.println("users.dat 파일에 기록저장 완료...");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				oos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	public void ObjFileOpen() {
		User[] users = new User[10];
		ObjectInputStream ois = null;
		int i=0;
		try {
			ois = new ObjectInputStream(new FileInputStream("users.dat"));
			User temp= null;
			while(true){
				temp = (User) ois.readObject();
				users[i] = temp;
				i++;
			}			
		}catch(EOFException e){
			System.out.println("파일 읽기 완료...");
			for(int j = 0 ;j<i;j++){
				System.out.println(users[j]);
				}
		}catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
