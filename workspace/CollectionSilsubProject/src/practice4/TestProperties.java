package practice4;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class TestProperties {

	public Student[] readFile() {
		Properties scores = new Properties();
		Student[] students = null;
		try {
			scores.load(new FileReader("score.txt"));
			students = new Student[scores.size()];
			Enumeration<String> keyList = (Enumeration<String>) scores.propertyNames();
			for(int i=0; keyList.hasMoreElements();i++){
				String key = (String)keyList.nextElement();
				String value = scores.getProperty(key);
				String[] values = value.split(",");
				int kor = Integer.parseInt(values[1]);
				int eng = Integer.parseInt(values[2]);
				int mat = Integer.parseInt(values[3]);
				int tot = kor + eng + mat;
				int avg = tot / 3;
				students[i] = new Student(Integer.parseInt(key), values[0], kor, eng, mat, tot, avg);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return students;		
	}
	
	public void printConsole(Student[] sr) {
		System.out.println("학번\t이름\t\t국어\t영어\t수학\t총점\t평균");
		int tot=0, avg;
		for(Student s : sr){
			System.out.println(s.toString());
			tot += s.getTot();
		}
		avg = tot /(sr.length*3);
		System.out.println("------------------------------------------------------------");
		System.out.println("학생들 점수의 합 : "+tot+"점, 학생들 총점의 평균 : "+avg);
	}
	
	public void saveXMLFile(Student[] sr) {
		Properties scoreXML = new Properties();
		
		try {
			for(int i=0;i<sr.length;i++){
				scoreXML.setProperty(String.valueOf(sr[i].getSno()),String.valueOf(sr[i]) );
			}
			scoreXML.storeToXML(new FileOutputStream("student.xml"),"score");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestProperties tp = new TestProperties();
		tp.printConsole(tp.readFile());
		tp.saveXMLFile(tp.readFile());
	}

}
