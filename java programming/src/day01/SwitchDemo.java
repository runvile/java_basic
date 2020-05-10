package day01;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		switch(3) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("else");
		}
		
		//month 값을 조건으로 받아 해당 월에 대한 월이름  ex_jan, Feb ...
		//반환해주는 switch/case문 작성해보기
		//존재하지 않는 월의 경우 wrong 출력
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		String monthName= "";
		
		 switch(month) {
		 case 1:
			 monthName="jan";
				break;
			case 2:
				monthName="feb";
				break;
			case 3:
				monthName="mar";
				break;
			case 4:
				monthName="ap";
				break;
			default:
				System.out.println("worng");
			}
		 
	}

}
