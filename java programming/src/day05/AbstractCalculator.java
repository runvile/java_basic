package day05;

abstract class Calculator {
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	// ��Ȳ�� ���� �޶��� �� �ִ� �κ� -> �޼ҵ� ����ڿ��� ���� ������ �κ�
	public abstract void sum();
	public abstract void avg();
	
	//default ������
	//���� ��Ű�� �ȿ����� ����� �� �ִ� ���� ������
	int _sum(){
		return this.left + this.right;
	}
	
	
	int _avg() {
		return (this.left + this.right)/2;
	}
	
	// �������� �κ� 
	public void run() {
		sum();
		avg();
	}
	
}
class CalculatorKor extends Calculator{
	public void sum() {
		System.out.println("�� ���� ����: "+ (this.left + this.right));
	}
	public void avg() {
		System.out.println("�� ����  �����: "+ (this.left + this.right)/2);
	}
}

class CalculatorEng extends Calculator{
	public void sum() {
		System.out.println("Sum of two numbers: "+ (this.left + this.right));
	}
	public void avg() {
		System.out.println("Average of two numbers: "+ (this.left + this.right)/2);
	}
}

public class AbstractCalculator {

	public static void main(String[] args) {
		
		CalculatorKor c1 = new CalculatorKor();
		c1.setOprands(10, 20);
		c1.run();
		
		CalculatorEng c2 = new CalculatorEng();
		c2.setOprands(10, 20);
		c2.run();
		
		//����
		//�߻�Ŭ�������� ���������� ���Ǵ� ������ �����ϰ� �װ��� ��ӹ޴� �ڽ�Ŭ��������
		//�뵵�� ���� �޶����� ������ ����ڰ� �����ϵ��� �ϴ� ���� �߻�Ŭ������ �뵵

	}

}
