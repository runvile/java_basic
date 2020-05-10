package day04Same;

class SamePackageChecker extends Same{
	//생성자
	public SamePackageChecker() {
		//같은 패키지 내에 있는 same을 인스턴스화
		Same same = new Same();
		same._public(); //접근가능
		same._protected();
		same._default();
		//same._private();//접근불가능
		
		//클래스가 어떤 클래스를 상속받았고, 자기자신의 클래스 내에
		//가지고 있는 메소드가 존재하지 않으면, 부모클래스에서 메소드를 찾게됨
		//따라서 여기서 this 메소드는 부모클래스의 메소드
		this._public(); //접근가능, this 클래스 자기자신 의미
		this._protected(); //접근가능
		this._default();
		//this._private(); //불가능
	}
}

class SameClassChecker{
	
	//생성자
	public SameClassChecker() {
		//같은 클래스내에 존재하는 메소드 호출
		this._public();//접근가능
		this._protected();
		this._default();
		this._private();
		//같은 클래스에 존재하면 모든 접근제어자에 대해 접근 가능
	}
	public void _public() {
		System.out.println("public");
	}
	protected void _protected() {
		System.out.println("protected");
	}
	void _default() {
		System.out.println("default");
	}
	private void _private() {
		System.out.println("private");
	}
}

public class Checker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
