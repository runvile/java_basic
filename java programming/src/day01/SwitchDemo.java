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
		
		//month ���� �������� �޾� �ش� ���� ���� ���̸�  ex_jan, Feb ...
		//��ȯ���ִ� switch/case�� �ۼ��غ���
		//�������� �ʴ� ���� ��� wrong ���
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
