package day01;

public class Fordemo {

	public static void main(String[] args) {
		//for (�ʱⰪ; ���ǹ�; ������)
		int sum = 0;
		for (int i=0; i<4; i++) {
			sum= sum+i;
			
		}
		System.out.println(sum);
		
		//0 ���� 10���� 1�� �����ϸ� ���������, 3�� ����� ��¾���
		for(int i=0; i<=10; i++) {
			if(i%3 == 0) {
				continue; // ��ŵ�ϴ°�
			} else {
			System.out.println(i);
			}
		}
		for(int i=0; i<=20; i++) {
			if(i*2==10) {
				break;
			}
			System.out.println(i);
		}
			for (int i=5; i>=10; i--) {
				System.out.println(i);
			}
			for (int i=0; i<=5; i++) {
				for (int j=3; j>=0; j--) {
					System.out.println(i);
					System.out.println(j);
				}
			}
			//i=0 --> j=3, 2, 1, 0
			//i=1 --> j=3....��� �ݺ�
			//i=3����
			
			String[] numbers = {"one", "two", "three"};
			for(int i=0; i<numbers.length; i++) {
				System.out.println(numbers[i]);
			}
			
			for(String num: numbers) {
				System.out.println(num);
			}
			//numbers: iterate��ü --> �迭
			//1���ܾ� ���������θ� ����
			
			//���� ������ �����)2-9��
			//���� ���� ���ٿ� ����Ʈ
			for(int i=2; i<=9; i++) {
				for(int j=1; j<=9; j++) {
					System.out.print(i * j+" ");
					
				}
				System.out.println();
			}
			
	}

}
