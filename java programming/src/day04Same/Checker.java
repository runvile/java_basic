package day04Same;

class SamePackageChecker extends Same{
	//������
	public SamePackageChecker() {
		//���� ��Ű�� ���� �ִ� same�� �ν��Ͻ�ȭ
		Same same = new Same();
		same._public(); //���ٰ���
		same._protected();
		same._default();
		//same._private();//���ٺҰ���
		
		//Ŭ������ � Ŭ������ ��ӹ޾Ұ�, �ڱ��ڽ��� Ŭ���� ����
		//������ �ִ� �޼ҵ尡 �������� ������, �θ�Ŭ�������� �޼ҵ带 ã�Ե�
		//���� ���⼭ this �޼ҵ�� �θ�Ŭ������ �޼ҵ�
		this._public(); //���ٰ���, this Ŭ���� �ڱ��ڽ� �ǹ�
		this._protected(); //���ٰ���
		this._default();
		//this._private(); //�Ұ���
	}
}

class SameClassChecker{
	
	//������
	public SameClassChecker() {
		//���� Ŭ�������� �����ϴ� �޼ҵ� ȣ��
		this._public();//���ٰ���
		this._protected();
		this._default();
		this._private();
		//���� Ŭ������ �����ϸ� ��� ���������ڿ� ���� ���� ����
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
