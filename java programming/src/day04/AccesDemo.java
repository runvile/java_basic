package day04;

class A {
	public String y() {
		return "public void y()";
	}
	private String z() {
		return "public void z()";
	}
	public String x() {
		return z();
	}
}


public class AccesDemo {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.y());
		//System.out.println(a.z());
		//���� ���� : ���������ڰ� private
		System.out.println(a.x());
		
		//y�� public, z-private
		//���� ���� or �޼ҵ尡
		//public : �������� Ŭ������ �޼ҵ带 ȣ���ؼ� ��� ����
		//private : ���������δ� ����� �� ������ �ܺ� Ŭ������ ��� �Ұ���
		//a.x()�� z()�޼ҵ带 ȣ���ϰ� ����
		//z�޼ҵ�� x�޼ҵ�� ���� Ŭ���� ���� ����
		//���� ���� Ŭ�������� private �޼ҵ� ȣ�� ����
		//��, Ŭ�������� ���������� �޼ҵ带 ȣ���ϴ� ���� �Ұ���
		
		//���������� ��� ����
		//���ø����̼� - ����, ����� ����- �ݰ�

	}

}
