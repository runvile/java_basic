package day04;

class Car2{ //���ο� Ŭ������ ���� public class Car
	private String name;
	private int number;
	
	//�����ʱ�ȭ�� ������ ��� ->set�Լ��� �����. ->������
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setNumber(int number) {
		this.number= number;
	}
	public int getNumber(){
		return number;
	}
	
	public void run() {
		System.out.println("���� �޸��ϴ�.");
	}
	private void stop() {
		System.out.println("���� ����ϴ�.");
	}
	public void warning() {
		stop();
	}
}

public class AccessQuizAnswer {
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
