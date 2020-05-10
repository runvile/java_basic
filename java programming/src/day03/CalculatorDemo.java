package day03;

// 상속 : 물려준다는 의미
// 어떤 객체가 있을 때 그 객체의 필드(변수)와 메소드를 다른 객체가 물려받을 수 있는 기능

//class Calculator extends Object 생략되어 있음
//Object:모든 클래스의 공통된 조상
//아무것도 상속받지 않고 있다면 암무적으로 Object클래스를 상속받게 됨.
//https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html
//따라서 Object클래스들의 메소드를 상속받아서 쓸 수 있다는 의미
class Calculator{
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
		
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
}

//class 자식 클래스 extends 부모클래스 {} 부모클래스를 상속받아서 자식클래스를 만들어주겠다.
class AddSubstractCalculator extends Calculator{
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

//Calculator를 상속받는 곱셈 클래스

class AddMultiplyCalculator extends Calculator{
	public void multply() {
		System.out.println(this.left*this.right);
	}
}
//class  
class AddDevisionCalculator extends AddSubstractCalculator{
	public void devision() {
		System.out.println(this.left / this.right);
	}
	
}

//계산기 기능과  multiply 기능을 할 수 있으면서, left값을 right값으로 나눴을때의
//나머지 출력이 가능한 기능 가진 클래스 구현
//나머지 : remainder

class AddremainderCalculator extends AddMultiplyCalculator{
	public void remainder() {
		System.out.println(this.left % this.right);
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		//c1.substract(); // -10
		
		AddSubstractCalculator c2 = new AddSubstractCalculator();
		c2.setOprands(10, 20);
		c2.sum();
		c2.avg(); //위 3개 함수를 가지고 있지만 부모 클래스에서 상속 받았기 때문에 쓸 수 있다.
		c2.substract();
		
		AddMultiplyCalculator c3= new AddMultiplyCalculator();
		c3.setOprands(3, 4);
		c3.multply();
		
		AddDevisionCalculator c4 = new AddDevisionCalculator();
		c4.setOprands(10, 20);
		//Calculator에서 상속
		c4.sum();
		c4.avg();
		//AddSubstractCalculator에서 상속
		c4.substract();
		//기능 추가
		c4.devision();
		
		//결론
		//끊임없이 상속관계를 이어나갈 수 있다.
		
		AddremainderCalculator c5 = new AddremainderCalculator();
		c5.setOprands(7, 11);
		c5.sum();
		c5.avg();
		c5.multply();
		c5.remainder();
		
		//상속의 호용
		//1.중복의 제거  - 부모가 가지고 있는 기능을 또 만들 필요가 없음.
		//2.코드의 재활용성 증대 
		//3.유지보수의 편의성 증대 :부모클래스를 개선하게 되면, 이를 상속받고 있는 모든 자식 클래스에게 자동적으로 혜택이 돌아감.
		//4.가독성증가:클래스가 가지고 있는 주요기능을 제외한 나머지코드는 부모에게 존재.
		

	}

}
