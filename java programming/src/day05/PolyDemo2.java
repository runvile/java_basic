package day05;

interface I2{
	public String A(); // A�޼ҵ� ���� ����
}

interface I3{
	public String B(); // B�޼ҵ� ���� ����
}

class D implements I2, I3{
	public String A() { //I2�������̽��� ���� A�޼ҵ� ����
		return "A";
	}
	
	public String B() { //I3�������̽��� ���� A�޼ҵ� ����
		return "B";
	}
}
public class PolyDemo2 {

	public static void main(String[] args) {
		// 1) Ŭ������ ������Ÿ�� ����
		D obj = new D();
		obj.A();
		obj.B();
		
		I2 obj2 = new D();
		obj2.A();
		//obj2.B(); // ����
		//obj2�� I2�༼�� �ϰ� �ִ� ���̰�, I2�� �޼ҵ� A�� ������ �����ϰ� ����
		//�޼ҵ�A���� ������ �ִ� Ŭ������ ��ó�� �����ϰ� ��
		
		//3) ������Ÿ�� I3
		I3 obj =new D();
		//obj3.A(); //����
		ojb3.B();
		//ojb3�� I3�༼�� �ϰ� �ִ� ���̰�, I3�� �޼ҵ� B�� ������ �����ϰ� ����
		//�޼ҵ�B���� ������ �ִ� Ŭ������ ��ó�� �����ϰ� ��
		
		//���
		//��ġ �� Ŭ������ �� �������̽����� ������ ����鸸�� ������ �ִ� Ŭ������ ��ó�� ����
		
		//���� �������̽����� �������� Ȱ���ϸ�
		//���ϴ� ��ɸ� ����ϰ�, ������ ��ɵ��� �Ű澲�� ���� �� �ְ� ������
		//�ش� ��ɿ��� ���� �� �� �ִ�
		

	}

}