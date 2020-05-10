package day02;

public class ScopeDeom2 {
	//클래스 바로 아래 i가 선언
	//클래스에 직접 속해있는 변수 -> 전역변수(global variable)
	//클래스 내에 있는 모든 메소드와 모든 변수에 영향을 미침
	static int i;
	
	public static void a() {
		i = 0;//메소대 내에 선언된 변수->지역 변수(local variable)
		//i 앞에 int가 없음. 선언은 위의 전역변수가 해준 것.
		//선언되지 않고 할당만 하고 있기 때문에 전역 변수 i를 사용한 것
		
	}

	public static void main(String[] args) {
		//무한 루프에 빠짐
		for(i=0; i<5; i++) { //i 앞에 int가 없음. 즉, 선연은 위에 전역변수에서 해준 것
			a(); // i의 값이 다시 0으로 바꿔버림.
			System.out.println(i);
		}
		
		//만약 메소드 안의 i를 int로 선언하거나, for문의 i를 int로 선언하면 무한루프 발생하지 않음.
		//메소드 안의 i를 int로 선언 -> 메소드 안에서 생성하고 있기 때문에 i는 a안에서만 유효
		//따라서 같은 이름이지만 바깥쪽에 있는 전역 변수 i와는 전혀 무관.
		//for문의 i를 int로 선언=> for문의 중괄호 안에서만 유효한 변수
		
		//생성된 곳의 {}(블럭) 내에서만 유효
		//변수 선언은 변수의 유효범위(scope)를 청하는 행위
		
	}

}
