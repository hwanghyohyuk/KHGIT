package workshop03;

public class Test01 {

	public static void main(String[] args) {


		System.out.println("두 개의 주사위를 던졌을 때, 두개의 주사위 눈의 차가 0보다 크고 3보다 작거나 같을 때의 조건을 화면에 출력 하는 프로그램");
		for(int i=1;i<7;i++){
			for(int j=1;j<7;j++){
				if((i-j)>0&&(i-j)<=3){
					System.out.println(i+" - "+j+" = "+(i-j));
				}
			}
		}
	}
}
