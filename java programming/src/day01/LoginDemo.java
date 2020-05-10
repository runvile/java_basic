package day01;

import java.util.Scanner;

public class LoginDemo {
	private static final String Eclipse = null;

	//id와 password 검증하는 시스템 만들기
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("id, password를 입력하세요");
		String id = scan.next();
		int password = scan.nextInt();
		/*System.out.println("id: "+id);
		System.out.println("password: "+password);*/
		
		//id = "Eclipse", password = 0000이어야만 시스템 로그인 가능
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
