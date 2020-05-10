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
	//오버라이딩
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
		 * 추상클래스 Machine -> 추상메소드 turnOn, turnOff 
		 * 
		 * Car 클래스를 만들고,
		 * Car 클래스에 turnOn, turnOff 메소드 구현해보기 
		 * 
		 * */
		
		//추상클래스는 인스턴스화 되지 않기 때문에
		Car c = new Car();
		c.turnOff();
		c.turnOn();
	}

}
