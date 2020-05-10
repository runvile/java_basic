package day05;

abstract class Machine{
	public abstract void turnOn();
	public abstract void turnOff();
	
	public void run() {
		turnOn();
		turnOff();
	}
	
}

class Car extends Machine{
	//�������̵�
	public void turnOn() {
		 System.out.println("turnOn");
	}
	public void turnOff() {
		System.out.println("turnOff");
	}
}
public class AbstractQuiz {

	public static void main(String[] args) {
		/*
		 * �߻�Ŭ���� Machine -> �߻�޼ҵ� turnOn, turnOff 
		 * 
		 * Car Ŭ������ �����,
		 * Car Ŭ������ turnOn, turnOff �޼ҵ� �����غ��� 
		 * 
		 * */
		
		//�߻�Ŭ������ �ν��Ͻ�ȭ ���� �ʱ� ������
		Car c = new Car();
		c.turnOff();
		c.turnOn();
	}

}
