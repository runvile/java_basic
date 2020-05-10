package day02;

public class Calculator {
	int a, b;
	
	//1.평범한 메서드
	//리턴 자료형 명시
	public int sum(int num1, int num2) { //()는 파라미터 받을 값
		return num1 + num2; //int값을 반환하겠다.
		
	}
	
	public int sum1() {
		return a+b;
	}
	
	public void setNum(int a, int b) {
		this.a = a;
		this.b = b;
	}
	//2. 입력값이 없는 메서드
	public int multiply() {
		return a*b;
	}
	//3.return값이 없는 메서드 --> void
	public void sum2() {
		System.out.println("a와 b의 합은"+(a+b)+"입니다");
	}
	
	//4.void 메서드->return;
	//return문을 이요해 메서드를 빠져나감
	//일반 메서드에서는 return;으로 메서드 빠져나가는 것 불가능
	public void matchVersion(String version) {
		if("V1".equals(version)){
			return;
		}
		System.out.println("현재 버전은? "+version);
	}

	public static void main(String[] args) {
		int c = 1;
		int d = 2;
		Calculator calc = new Calculator();  //새로운 객체를 만들때 필요
		System.out.println(calc.sum(c,d));
		
		calc.setNum(3,4); // a=3, b=4
		System.out.println(calc.multiply()); //12
		System.out.println(calc.sum1()); //7
		calc.sum2();
		
		//calc2라는 새로운 객체 생성해서 두 숫자 임의로 지정한 뒤 각 메서드 호출하기
		
		Calculator calc2 = new Calculator();
		calc.setNum(5, 2);
		System.out.println(calc2.sum1());
		System.out.println(calc2.multiply());
		calc2.sum2();
		
		calc2.matchVersion("V1");//아무것도 출력안됨
		calc2.matchVersion("V2");//현재 버전은? V2

	}

}
