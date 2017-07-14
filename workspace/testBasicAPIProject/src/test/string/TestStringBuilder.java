package test.string;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("java");
		System.out.println("sb : "+sb.hashCode());
		System.out.println("sb.toString : "+sb.toString());
		
		sb.append("+oracle");

		System.out.println("sb : "+sb.hashCode());
		System.out.println("sb.toString : "+sb.toString());
		
		sb.insert(4, "+html");

		System.out.println("sb : "+sb.hashCode());
		System.out.println("sb.toString : "+sb.toString());
		
		sb.delete(4, 8);

		System.out.println("sb : "+sb.hashCode());
		System.out.println("sb.toString : "+sb.toString());
		
		String s = sb.toString();
		System.out.println(s);
	}

}
