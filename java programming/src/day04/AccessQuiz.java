package day04;
class Car{
	String name;
	int number;
	public Car() {
		Name name = new Name();
		
	}
	
	private void _run() {
		System.out.println("���� �޸��ϴ�.");
	}
	private void _stop() {
		System.out.println("���� ����ϴ�.");
	}
}

public class AccessQuiz {

	public static void main(String[] args) {
		/*
		 * Car Ŭ���� ����
		 * name(�̸�), number(������ȣ)�� ������ ������ ����
		 * �ܺο��� ������ ���� �Ұ���
		 * ���� �� �������� �Ҵ� �� ��ȸ�ϴ� �޼ҵ� �����
		 * 
		 * void����Ÿ���� run, stop �޼ҵ� �ۼ�
		 * run: "���� �޸��ϴ�"
		 * stop: "���� ����ϴ�"
		 * 
		 *  Ŭ���� �ۿ��� run �޼ҵ� ��밡���ϵ��� 
		 * Ŭ���� �ۿ��� stop �޼ҵ� ���Ұ��� �ϵ��� 
		 * */
		Car c = new Car("Bus", 10);
		c.warning();
		
	}

}
