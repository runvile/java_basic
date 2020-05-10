package day03;

// ��� : �����شٴ� �ǹ�
// � ��ü�� ���� �� �� ��ü�� �ʵ�(����)�� �޼ҵ带 �ٸ� ��ü�� �������� �� �ִ� ���

//class Calculator extends Object �����Ǿ� ����
//Object:��� Ŭ������ ����� ����
//�ƹ��͵� ��ӹ��� �ʰ� �ִٸ� �Ϲ������� ObjectŬ������ ��ӹް� ��.
//https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html
//���� ObjectŬ�������� �޼ҵ带 ��ӹ޾Ƽ� �� �� �ִٴ� �ǹ�
class Calculator{
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
		
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
}

//class �ڽ� Ŭ���� extends �θ�Ŭ���� {} �θ�Ŭ������ ��ӹ޾Ƽ� �ڽ�Ŭ������ ������ְڴ�.
class AddSubstractCalculator extends Calculator{
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

//Calculator�� ��ӹ޴� ���� Ŭ����

class AddMultiplyCalculator extends Calculator{
	public void multply() {
		System.out.println(this.left*this.right);
	}
}
//class  
class AddDevisionCalculator extends AddSubstractCalculator{
	public void devision() {
		System.out.println(this.left / this.right);
	}
	
}

//���� ��ɰ�  multiply ����� �� �� �����鼭, left���� right������ ����������
//������ ����� ������ ��� ���� Ŭ���� ����
//������ : remainder

class AddremainderCalculator extends AddMultiplyCalculator{
	public void remainder() {
		System.out.println(this.left % this.right);
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		//c1.substract(); // -10
		
		AddSubstractCalculator c2 = new AddSubstractCalculator();
		c2.setOprands(10, 20);
		c2.sum();
		c2.avg(); //�� 3�� �Լ��� ������ ������ �θ� Ŭ�������� ��� �޾ұ� ������ �� �� �ִ�.
		c2.substract();
		
		AddMultiplyCalculator c3= new AddMultiplyCalculator();
		c3.setOprands(3, 4);
		c3.multply();
		
		AddDevisionCalculator c4 = new AddDevisionCalculator();
		c4.setOprands(10, 20);
		//Calculator���� ���
		c4.sum();
		c4.avg();
		//AddSubstractCalculator���� ���
		c4.substract();
		//��� �߰�
		c4.devision();
		
		//���
		//���Ӿ��� ��Ӱ��踦 �̾�� �� �ִ�.
		
		AddremainderCalculator c5 = new AddremainderCalculator();
		c5.setOprands(7, 11);
		c5.sum();
		c5.avg();
		c5.multply();
		c5.remainder();
		
		//����� ȣ��
		//1.�ߺ��� ����  - �θ� ������ �ִ� ����� �� ���� �ʿ䰡 ����.
		//2.�ڵ��� ��Ȱ�뼺 ���� 
		//3.���������� ���Ǽ� ���� :�θ�Ŭ������ �����ϰ� �Ǹ�, �̸� ��ӹް� �ִ� ��� �ڽ� Ŭ�������� �ڵ������� ������ ���ư�.
		//4.����������:Ŭ������ ������ �ִ� �ֿ����� ������ �������ڵ�� �θ𿡰� ����.
		

	}

}
