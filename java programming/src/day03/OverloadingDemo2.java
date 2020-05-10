package day03;

//오버로딩의 제약조건
public class OverloadingDemo2 {
	
	public void A() {
		System.out.println("void A()");
	}
	
	
	public void A(int num) {
		System.out.println("void A(int num)");
	}
	
	public void A(String str) {
		System.out.println("A(String str)");
	}
	
	//에러발생
	//메소드 이름과 매개변수 형식이 동일하고 리턴타입이 달라지는 것 불가능
	//public String A(String str) {
		//return str;
	//	}
	
	public int B() {
		 System.out.println("int B()");
	}
	public int B(int b) {
		return b;
	}
	
	public static void main(String[] args) {
		OverloadingDemo2 o = new OverloadingDemo2();
		o.A();
		o.A(2);
		o.A("Hello");
	}

}
