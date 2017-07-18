package exception.silsub1;

public class CharacterProcess {

	public CharacterProcess() {
		super();
	}

	public int countAlpha(String s) throws CharCheckException {
		int count = 0;
		// 기존

		for (int i = 0; i < s.length(); i++) {
			
			 if(s.charAt(i)==' '){ 
				 throw new	 CharCheckException("체크할 문자열 안에 공백을 포함할 수 없습니다."); 
			 }else if ((s.charAt(i) >='A' && s.charAt(i)<= 'Z' || (s.charAt(i)>= 'a' &&	 s.charAt(i) <= 'z' ))) {// 영문자일때 
				 count++; 
			 }
			 /*
			if (Character.isAlphabetic(s.charAt(i))) {
				count++;
			} else if (Character.isSpaceChar(s.charAt(i))) {
				throw new CharCheckException("체크할 문자열 안에 공백을 포함할 수 없습니다.");
			}
			*/
		}
		return count;
	}
}

