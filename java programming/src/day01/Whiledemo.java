package day01;

public class Whiledemo {

	public static void main(String[] args) {

		int i=0;
		int sum = 0;
		while(i<=3) {
			sum += i;
			System.out.println(sum);
			i++;
		}
		//Ŀ�� ��Ա�
		//coffee=10 money =300
		//���� �� ������������ Ŀ�Ǹ� ���ð� �ʹ�
		//Ŀ�� ���ܿ� 10��
		//Ŀ�� ���� �ȶ����� ���� Ŀ�� �� ���
		//���� ������ Ŀ�ǰ� �� �������ٸ�, �Ǹ����� �޼��� ���
		
		int coffee = 10; int money = 300;
		int price =10;
		while(money >0) {
			if(coffee == 0) {
				System.out.println("Ŀ�� �Ǹ� �Ϸ�");
				break;
			}
			coffee--;
			money -= price;
			System.out.println("���� Ŀ��:"+ coffee+"��");
			
		}
		
		//1 ���� 10���� ����ϴµ� 3�� ����� ��¾���
		int a = 0;
		while(a<=10) {
			a++;
			if(a%3==0) {
				continue;
			}
			System.out.println(a);
			
		}
		
	}

}
