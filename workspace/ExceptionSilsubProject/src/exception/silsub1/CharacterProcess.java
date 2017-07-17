package exception.silsub1;

public class CharacterProcess {

	public CharacterProcess(){
		super();
	}
	
	public int countAlpha(String s) throws CharCheckException{
		int count=0;
		for(int i=0; i<s.length();i++){
			if(s.charAt(i)==(char)13){
				throw new CharCheckException("체크할 문자열 안에 공백을 포함할 수 없습니다.");
			} else if (('A' <= s.charAt(i) && 'Z' >= s.charAt(i) || ('a' <= s.charAt(i) && 'z' >= s.charAt(i)))) {// 영문자일때
				count++;
			}
		}
		return count;
	}
}
