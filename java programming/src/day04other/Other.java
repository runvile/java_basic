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
		//�ٸ� ��Ű���� Ŭ���� ���� ���� ����
		public OtherPackageChecker(){
		Other other = new Other();
		other._public();
		//other._protected();//�Ұ���
		//other._private();
		//other._default();
		
		//�ٸ���Ű��, �ڽ�Ŭ����
		this._public();//����
		this._protected();//����
		this._default(); //�Ұ���
		this._private();//�Ұ���
	}
		
	}
		
public class Other {

}
