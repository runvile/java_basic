package day04;

class Car2{ //새로운 클래스를 만들어서 public class Car
	private String name;
	private int number;
	
	//변수초기화를 강제한 경우 ->set함수가 사라짐. ->생성자
	
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
		System.out.println("차가 달립니다.");
	}
	private void stop() {
		System.out.println("차가 멈춥니다.");
	}
	public void warning() {
		stop();
	}
}

public class AccessQuizAnswer {
	/*
	 * Car 클래스 생성
	 * name(이름), number(차량번호)를 변수로 가지고 있음
	 * 외부에서 변수에 접근 불가능
	 * 따라서 이 변수값을 할당 및 조회하는 메소드 만들기
	 * 
	 * void리턴타입의 run, stop 메소드 작성
	 * run: "차가 달립니다"
	 * stop: "차가 멈춥니다"
	 * 
	 *  클래스 밖에서 run 메소드 사용가능하도록 
	 * 클래스 밖에서 stop 메소드 사용불가능 하도록 
	 * */
	
	Car c = new Car("Bus", 10);
	c.warning();
	
}
