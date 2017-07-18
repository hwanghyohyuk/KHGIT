package testIOProject;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Stream {

	// 보조 스트림 Buffered 스트림을 사용해서 성능을 개선함
	public void fileRead() {
		BufferedInputStream bis = null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream("fosTobos.dat"));
			byte[] readData = new byte[100];
			
			bis.read(readData);
			for(byte b : readData){
				System.out.print(b);
			}System.out.println();
			
			System.out.println(readData);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	public void fileWrite() {
		BufferedOutputStream bos = null;
		try {
			bos = new BufferedOutputStream(new FileOutputStream("fosTobos.dat"));
			bos.write(new byte[] { 15, 16, 17 });
			bos.write((int) 'K');
			byte[] bar = "orange".getBytes();
			bos.write(bar);

			bos.flush();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void fileRead2() {
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("bwTofw.dat"));
			//String str = br.readLine();
			String str = null;
			
			while((str = br.readLine())!=null){
				System.out.println(str);
			}
		}catch (Exception e) {
			// TODO: handle exception
		} finally {
			// TODO: handle finally clause
		}
	}
	public void fileWrite2() {
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("bwTofw.dat"));
			bw.write("power java");
			bw.write("orange database".toCharArray());
			char [] chArr={'j','Q','u','e','r','y'};
			bw.write(chArr, 1, 3);
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream s = new Stream();
		//s.fileWrite();
		//s.fileRead();
		//s.fileWrite2();
		s.fileRead2();
	}

}
