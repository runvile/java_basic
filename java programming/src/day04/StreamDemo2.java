package day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StreamDemo2 {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in);
		char[] b= new char[3];
		reader.read(b);
		
		System.out.println(b);
		
		//개선 여지: 고정된 길이로만 스트림 읽어야함
		//사용자가 엔터키를 입력할때까지 입력을 전부 받아들이려면
		//BufferedReaded
		//객체 생성시 생성자의 입력값이 필요
		BufferedReader br = new BufferedReader(reader);
		String a = br.readLine();
		System.out.println(a);
		
		//정리
		//1. InputStream :byte
		//2.InputStreamReader:character
		//3.InputStreamReader:String - 가장 많이 쓰임
		
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.next());
		
		//next:단어입력
		//nextInt : 정수
		
		//콘솔 출력
		System.out.println(); //문자열 출력 or 디버깅
		System.err.println(); //오류메세지 호출 -> 디버깅 시 사용
		
	
	}
	

}
