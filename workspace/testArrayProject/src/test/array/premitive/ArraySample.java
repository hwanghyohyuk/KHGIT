package test.array.premitive;

import java.util.*;

public class ArraySample {
	private Scanner sc = new Scanner(System.in);
	public void test1() {
		// TODO Auto-generated method stub
		
	}
	
	public void test2(){
		int[] arr = new int[10];
		int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;

		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*100)+1;
			if(min>arr[i])min=arr[i];
			if(max<arr[i])max=arr[i];
			System.out.println("arr["+i+"] : "+arr[i]);
		}
		System.out.println("MAX : "+max + ", MIN : "+min);	
	}
	
	public void test3() {
		byte[] arr = new byte[10];
		new Random().nextBytes(arr);
		byte sum = 0;		
		for(int i = 0;i<arr.length;i++){
			System.out.println("arr["+i+"] : "+arr[i]);
			if(arr[i]%2==0){
				sum +=arr[i];
			}
		}
		System.out.println("임의로 생성된 값들 중 짝수들의 합 : "+sum);	
	}
	public void test4() {
		String str;
		int sum = 0;
		System.out.print("문자열 입력 : ");
		str = sc.next();
	
		for(int i = 0;i<str.length();i++){
			sum += Integer.parseInt(str.substring(i, i+1));
		}
		System.out.println("문자열의 문자를 정수로 가져와서 각각 더한 값 : "+sum);
	}
	
	public void test5() {
		String str;
		int sum = 0;
		System.out.print("문자열 입력 : ");
		str = sc.next();
		
		for(int i = 0;i<str.length();i++){
			sum += ((int)(str.charAt(i))-48);
		}
		System.out.println("문자열의 문자를 정수로 가져와서 각각 더한 값 : "+sum);
	}
	public void test55() {
		String str;
		int sum = 0;
		char[] ch;
		
		System.out.print("문자열 입력 : ");
		str = sc.next();
		
		ch=str.toCharArray();
		
		
		for(int i = 0;i<ch.length;i++){
			sum += ((int)(ch[i])-48);
		}
		System.out.println("문자열의 문자를 정수로 가져와서 각각 더한 값 : "+sum);
	}

	public void test6() {
		// TODO Auto-generated method stub
		String personID;
		int year,month,day,sex,age;
		String dow="";
		
		System.out.print("주민등록번호를 입력해주세요 : ");
		personID = sc.next();
		
		year = Integer.parseInt(personID.substring(0,2));
		month = Integer.parseInt(personID.substring(2,4));
		day = Integer.parseInt(personID.substring(4,6));
		sex = Integer.parseInt(personID.substring(7,8));
		
		GregorianCalendar person = new GregorianCalendar(year+1900,month,day);
		
		switch (person.get(Calendar.DAY_OF_WEEK)) {
		case 1:dow="일";break;
		case 2:dow="월";break;
		case 3:dow="화";break;
		case 4:dow="수";break;
		case 5:dow="목";break;
		case 6:dow="금";break;
		case 7:dow="토";break;
		}
					
		System.out.println(person.get(Calendar.YEAR)+"년 "
				+person.get(Calendar.MONTH)+"월 "
						+ person.get(Calendar.DATE)+"일, 태어난 요일은 "
								+ ""+dow+"요일이네요!");
		System.out.println(((sex==1)?"남자":"여자")+"이시군요!");
		Calendar today = Calendar.getInstance();
		age = today.get(Calendar.YEAR) - person.get(Calendar.YEAR);//만나이
		System.out.println("나이는 만으로 "+age+"세이시구요?!");				
	}

	public void initArray(){
		int[] arr = {11,22,33,44,55,66};
		
		for(int i = 0; i<arr.length;i++)
		System.out.println(arr[i]+", "+arr.hashCode());
	}
	
	public void multiArray() {
		int[][][][] arr= new int[10][10][10][10];
		int x = 0;
		for(int i = 0; i<10; i++){
			for(int j = 0 ;j <10; j++){
				for(int k = 0; k<10; k++){
					for(int l = 0; l<10; l++){
				x += 1;
				arr[i][j][k][l]+=x;
					}
				}			
			}
		}
		for(int i = 0;i<10;i++){
			System.out.println("\n4차 : "+i);
			for(int j = 0;j <10;j++){
				System.out.println("\n3차 : "+j);
				for(int k = 0 ;k <10; k++){
					for(int l = 0; l<10; l++){
						System.out.print(arr[i][j][k][l]+"\t");
					}
					System.out.println();
				}
			}
		}
	}

}
