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
		//�θ�޼ҵ忡 ���ǵǾ��ִ� �޼ҵ带 ȣ��
		return super.avg();
	}
	
}

public class OverridingDemo3 {

	public static void main(String[] args) {
		/*
		 * Calculator7 Ŭ���� ����
		 * left, right ���� �ʿ�
		 * left, right ���� �ʱ�ȭ���ִ� �޼ҵ��� setOperands �޼ҵ� �ʿ�
		 * �ν��� �� �޼ҵ� �ۼ�(void ���� Ÿ��)
		 * ��ձ��ϴ� �޼ҵ� �ۼ�(int)
		 * 
		 * Calculator7 Ŭ���� ��ӹ޴� OverrideCalc Ŭ���� ����
		 * ��ӹ޴� �κ��� left, right ������ �������ִ� �޼ҵ� �ʿ�
		 * ��ձ��ϴ� �޼ҵ� �������̵�(��, ��ձ��ϴ� ������ �ٲ��� ����)
		 */
		
		//superŰ���� Ȱ���� �������̵�
		//superŰ���� �ؿ� ���� �߰��ϸ� �߰� ��� ���� ����
		
		//�������̵��� ��Ģ
		//1. �޼ҵ��� ����(signature)�� �����ؾ��Ѵ�.
		//--->1) �޼ҵ��� �̸� 2)�޼ҵ��� �Ű������� ����, ������ Ÿ��, ����, 3)�޼ҵ��� ����Ÿ��
		//�ȿ� ����ִ� ������ �޶����°� �������̵�
		//���: �������̵��� �θ�Ŭ������ ������ �ִ� ����� �ʿ信 ���� �����ϴ� ��
		//	�ڽ� �޼ҵ尡 �θ�޼ҵ带 ȣ���ϱ� ���ؼ��� super Ű���� ����Ѵ�.
		
		
		
	}

}
