package day04ex3;

//import day04ex.*;
//import day04ex2.*;

import java.lang.*; // 자바가 자동으로 이 패키지를 임포트
//java.lang에 있는 클래스들은 자바를 이요하는데 필수적이고 자주 이용하는 클래스

public class C {

	public static void main(String[] args) {
		// 명시적으로 지정해주면 특정 클래스 인스턴스화 가능
		day04ex.B b = new day04ex.B();
		//에러 : The type B is ambiguous
		
		System.out.println(1);
		//println(1) -> 매개변수를 갖는 메소드
		//System -> 클래스, java.lang 소속
		//out -> 시스템이라는 클래스의 멤버 중 하나인 변수
		//클래스를 사용하기 위해서는 인스턴스화를 시켜주는 것이 필수
		//out -> static (불필요한 인스턴스의 생성을 방지하기 위함)
		

	}

}
