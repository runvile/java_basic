package day03;
class Calculator7{
	int left, right;
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public int avg() {
		return(this.left + this.right)/2;
	}
	
}

class OverrideCalc extends Calculator7{
	public void devsion() {
		System.out.println(this.left / this.right);
	}
	
	@Override
	public int avg() {
		//부모메소드에 정의되어있는 메소드를 호출
		return super.avg();
	}
	
}

public class OverridingDemo3 {

	public static void main(String[] args) {
		/*
		 * Calculator7 클래스 생성
		 * left, right 변수 필요
		 * left, right 변수 초기화해주는 메소드인 setOperands 메소드 필요
		 * 두스의 합 메소드 작성(void 리턴 타입)
		 * 평균구하는 메소드 작성(int)
		 * 
		 * Calculator7 클래스 상속받는 OverrideCalc 클래스 생성
		 * 상속받는 두변수 left, right 나눗셈 연산해주는 메소드 필요
		 * 평균구하는 메소드 오버라이딩(단, 평균구하는 로직은 바꾸지 않음)
		 */
		
		//super키워드 활용한 오버라이딩
		//super키워드 밑에 로직 추가하면 추가 기능 개발 가능
		
		//오버라이딩의 규칙
		//1. 메소드의 서명(signature)가 동일해야한다.
		//--->1) 메소드의 이름 2)메소드의 매개변수의 개수, 데이터 타입, 순서, 3)메소드의 리턴타입
		//안에 들어있는 로직만 달라지는게 오버라이딩
		//결론: 오버라이딩은 부모클래스가 가지고 있는 기능을 필요에 따라서 변경하는 것
		//	자식 메소드가 부모메소드를 호출하기 위해서는 super 키워드 사용한다.
		
		
		
	}

}
