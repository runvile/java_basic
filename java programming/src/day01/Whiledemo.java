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
		//커피 사먹기
		//coffee=10 money =300
		//돈이 다 떨어질때까지 커피를 마시고 싶다
		//커피 한잔에 10원
		//커피 한잔 팔때마다 남은 커피 수 출력
		//돈은 있지만 커피가 다 떨어진다면, 판매중지 메세지 출력
		
		int coffee = 10; int money = 300;
		int price =10;
		while(money >0) {
			if(coffee == 0) {
				System.out.println("커피 판매 완료");
				break;
			}
			coffee--;
			money -= price;
			System.out.println("남은 커피:"+ coffee+"잔");
			
		}
		
		//1 부터 10까지 출력하는데 3의 배수는 출력안함
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
