package day03;

//�����ε��� ��������
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
	
	//�����߻�
	//�޼ҵ� �̸��� �Ű����� ������ �����ϰ� ����Ÿ���� �޶����� �� �Ұ���
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
