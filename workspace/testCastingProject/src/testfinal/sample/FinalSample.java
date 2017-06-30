package testfinal.sample;

public final class FinalSample {

	public static final int VALUE = 123; //��� ����(Field)
	private double dnum;
	
	public final void testFinalVariable(){
		//�������� Local
		//�޼ҵ� �ȿ��� ����� ����
		//RAM�� stack ������ �Ҵ��
		//stack �� �ش� �޼ҵ尡 ����� �� ���������� ���������
		//�ش� �޼ҵ尡 ����Ǹ� �ڵ����� ���������� ������
		//���������� �ݵ�� ���� �ʱ�ȭ ó���ؾ� ��
		
		//�������� �ڷ����տ� final Ű���� ��밡����
		final int NUM = 100; //�� ���� �Ұ�
		System.out.println("num : " + NUM);
		//num = 200;
		System.out.println("dnum : " + dnum);
		
	}
	
	public static void main(String[] args) {
		//final ����� �׽�Ʈ

		new FinalSample().testFinalVariable();
	}

}
