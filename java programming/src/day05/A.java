package day05;

interface I {
	public void z();
	//z() �޼ҵ�� ��ü�� ����
}
//implements: �������̽� ���� Ű����
//I��� �������̽��� �����ϰڴ�.
public class A implements I{ 

	public void z() {
		System.out.println("z()");
	}
	public static void main(String[] args) {
		// �������̽��� �ǹ�
		//Ư���� Ŭ������ Ư���� �������̽��� ���ս�Ű�� �Ǹ�
		//Ŭ������ ������ �� �������̽� ���� ���ǵǾ��ִ� �޼ҵ带 �ݵ�� �����ϵ��� �����ϰ� ����
		//Ŭ���� A�� �������̽� I�� �����Ѵ�

	}

}
