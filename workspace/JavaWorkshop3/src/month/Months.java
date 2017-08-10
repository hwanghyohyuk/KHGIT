package month;

public class Months {

	public int getDays(int months){
		int result = 0;
		switch (months) {
		case 2:
			result =28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			result =30;
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			result =31;
			break;
		}
		return result;
	}
	
}
