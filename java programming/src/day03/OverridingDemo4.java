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
		 * Calculator7Ŭ���� ������ ����
		 * 
		 * Calculator7Ŭ������ ��ӹ޴� OverrudeCalc2 Ŭ���� ����
		 * avg()�޼ҵ� �������̵�
		 * �� ���� ���+�μ��� �� ����
		 * super Ű���� ���
		 */
	}

}
