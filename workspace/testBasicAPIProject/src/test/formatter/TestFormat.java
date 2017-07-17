package test.formatter;

public class TestFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'A';
		String str = "java";
		int num = 123;
		double dnum = 123.456;

		System.out.printf("%c\t%s\t%d\t%f\n", ch, str, num, dnum);
		System.out.printf("|%5c,%-5c|\n", ch, ch);
		System.out.printf("%d,\t%o,\t%x\n", num, num, num);
		System.out.printf("%g,%e,%f,%A\n", dnum, dnum, dnum, dnum);
	}

}
