package day02;

class C3{
	static int base = 10;
	int a, b;
	
	//������
	//� �޼ҵ庸�ٵ� ���� �����
	//��ü�� ���� ���� �ؾ��� ��. �� �ʱ�ȭ�� ���� 
	//�������� �̸��� �ݵ�� Ŭ������ �̸��� �����ؾ���.
	public C3(int a, int b) {
		this.a = a;
		this.b = b;
		
	}
	
	public int sum() {
		return a+b + base;
	}
	
	public int avg() {
		return (a+b)/2;
	}
	
	public static int multiply(int c, int d) {
		return c*d;
	}

public class Constru {

	public static void main(String[] args) {
		/*C3 calc = new C3();
		calc.setNum(3, 5);
		System.out.println(calc.sum());
		System.out.println(calc.avg());*/
		
		//�̷��� ���� �ʱⰪ ������ ��ü ���� ��ÿ� ������
		//���� ��ü�� ����� �� �ݵ�� �ؾ��� ���� ��ġ�� �ʰ� ��.
		C3 calc = new C3(3,5);
		System.out.println(calc.sum());
		
		//���
		//Ŭ���� ������ ��, �����ڰ� �������� ������ �ڵ� ��������
		//���� ��ü ������ �� new �ڿ� C3()ó�� ���� ���� �����ڸ� �ǹ�
		
	}

	}

}
