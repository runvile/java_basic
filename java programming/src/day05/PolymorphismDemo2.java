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
		
		//obj.b(); //����
		
		//������ ������Ÿ������ �����ϸ鼭�� (������ X ������Ÿ������ ����)
		//������ Ŭ������ �ҼӵǾ��ִ� �޼ҵ��� ���۹�Ĵ�� �����ϰ� ����(y, y2 Ŭ������ ���� �����ϰ� �ִ�)
		//��, �������̵��� �޼ҵ忡 ���ؼ���
		
	}

}
