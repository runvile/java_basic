package day04other;

public class Other {
	private void _private() {
		System.out.println("private");
	}
	void _default() {
			System.out.println("default");
		}
		
	protected void _protected() {
			System.out.println("protected");
		}
		
	public void _public() {
			System.out.println("public");
		}

	class OtherPackageChecker extends Other{
		//다른 패키지의 클래스 접근 가능 여부
		public OtherPackageChecker(){
		Other other = new Other();
		other._public();
		//other._protected();//불가능
		//other._private();
		//other._default();
		
		//다른패키지, 자식클래스
		this._public();//가능
		this._protected();//가능
		this._default(); //불가능
		this._private();//불가능
	}
		
	}
		
public class Other {

}
