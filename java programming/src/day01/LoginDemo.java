package day01;

import java.util.Scanner;

public class LoginDemo {
	private static final String Eclipse = null;

	//id�� password �����ϴ� �ý��� �����
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("id, password�� �Է��ϼ���");
		String id = scan.next();
		int password = scan.nextInt();
		/*System.out.println("id: "+id);
		System.out.println("password: "+password);*/
		
		//id = "Eclipse", password = 0000�̾�߸� �ý��� �α��� ����
		if(id.equals ("Eclipse")) {
			if(password == 0000) {
			System.out.println("welcome!");
			}else
			System.out.println("enter the right password");
		} else {
			System.out.println("enter the right id");
		}
		
	}

}
