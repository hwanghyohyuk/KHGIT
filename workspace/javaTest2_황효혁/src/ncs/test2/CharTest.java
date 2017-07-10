package ncs.test2;

public class CharTest {

		public static void main(String[] args) {
			char[] ch;
			ch = args[0].toCharArray();
			
			for(int i = ch.length-1;i>-1;i--){
				if(ch[i]>='a'&&ch[i]<='z'){
				System.out.print((char)(ch[i]-32));
				}else{
					System.out.print(ch[i]);
				}
			}
	}

}
