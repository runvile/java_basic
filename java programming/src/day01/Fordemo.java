package day01;

public class Fordemo {

	public static void main(String[] args) {
		//for (초기값; 조건문; 증감식)
		int sum = 0;
		for (int i=0; i<4; i++) {
			sum= sum+i;
			
		}
		System.out.println(sum);
		
		//0 부터 10까지 1씩 증가하며 출력하지만, 3의 배수는 출력안함
		for(int i=0; i<=10; i++) {
			if(i%3 == 0) {
				continue; // 스킵하는것
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
			//i=1 --> j=3....계속 반복
			//i=3까지
			
			String[] numbers = {"one", "two", "three"};
			for(int i=0; i<numbers.length; i++) {
				System.out.println(numbers[i]);
			}
			
			for(String num: numbers) {
				System.out.println(num);
			}
			//numbers: iterate객체 --> 배열
			//1스텝씩 순차적으로만 가능
			
			//퀴즈 구구단 만들기)2-9단
			//같은 단은 한줄에 프린트
			for(int i=2; i<=9; i++) {
				for(int j=1; j<=9; j++) {
					System.out.print(i * j+" ");
					
				}
				System.out.println();
			}
			
	}

}
