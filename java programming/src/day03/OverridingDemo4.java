package day03;
class OverrudeCalc2 extends Calculator7{
	@Override
	public int avg() {
		int a = super.avg();//(this.left+this.right)/2;
		int b = this.left + this.right;
		return a + b;
	}
}
public class OverridingDemo4 {

	public static void main(String[] args) {
		/*
		 * Calculator7클래스 가져다 쓸것
		 * 
		 * Calculator7클래스를 상속받는 OverrudeCalc2 클래스 생성
		 * avg()메소드 오버라이딩
		 * 두 수의 평균+두수의 합 리턴
		 * super 키워드 사용
		 */
	}

}
