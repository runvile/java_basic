package day05;

class X{
	public String a() {
		return "X.a";
	}
}

class Y extends X{
	public String a() {
		return "Y.a";
	}
	
	public String b() {
		return "b";
	}
}

class Y2 extends X{
	public String a() {
		return "Y2.a";
	}
}

public class PolymorphismDemo2 {

	public static void main(String[] args) {
		X obj = new Y();
		X obj2 = new Y2();
		
		System.out.println(obj.a()); //y.a
		System.out.println(obj2.a());//y2.a
		
		//obj.b(); //에러
		
		//동일한 데이터타입으로 존재하면서도 (동일한 X 데이터타입으로 존재)
		//각각의 클래스에 소속되어있는 메소드이 동작방식대로 동작하고 있음(y, y2 클래스에 따라 동작하고 있다)
		//단, 오버라이딩된 메소드에 대해서만
		
	}

}
