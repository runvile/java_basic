package day02;

public class Fruit {
	String name;
	int price = 0;
	
	public void setName(String name) {
		this.name = name; //this.name Ŭ���� ��������  name. name�� string name
		//this�� �ش� ��ü, �ڱ� �ڽ�
		//�Ķ���ͷ� ���� name�� ��ü�� name�� �̸��� �����ϱ� ������ ��Ȯ�� ���ִ� ��
		//this.name = name;

	}

	public static void main(String[] args) {
		Fruit apple = new Fruit();
		System.out.println(apple.name); //.:��Ʈ������ �̿��ؼ� ��ü�� ������ �Ӽ��� ���� ����
		apple.name = "���";
		System.out.println(apple.name);
		apple.price = 990;
		System.out.println(apple.price);
		
		Fruit banana = new Fruit();
		banana.price = 1000;
		banana.name = "�ٳ���";
		System.out.println(banana.price);
		System.out.println(banana.name);
		
		//���
		//��ü ������ �������� �ʴ´�.
		//��ü������ ���� ���������� �����ȴ� -> Ŭ������ ���� ����
		
		apple.setName("���ִ� ���");
		System.out.println(apple.name);

	}

}