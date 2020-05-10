package day02;

public class ScopeDemo {
	
	public static void a( ) {
		int i =0; 
		//i라는 변수가 a라는 메소드 안에서 선언되고 있으므로 i는 a 메소드 밖에서는 영향미치지 않음
		//유효범위(scope)
	}

	public static void main(String[] args) {

		for(int i=0; i<5; i++) {
			a();
			System.out.println(i);
		}
		//결과갑 예상 ->무한루프
		//결과 0/1....
	}
	

}
