package day04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		byte[] b= new byte[1024];
		FileInputStream fi = new FileInputStream("C:\\Users\\KG-ITBANK\\Desktop\\docs\\test3.txt");
		
		fi.read(b);
		System.out.println(new String(b));
		fi.close();
		//FileInputStream 클래스 이용
		//byte 배열을 이용하여 파일을 읽어야하기 때문에 읽어야하는 파일의 정확한 길이를 모르는 경우->불편
		
		//파일 라인단위로 읽기
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\KG-ITBANK\\Desktop\\docs\\test3.txt"));
		//생성자안에 객체가 들어가야함.
		while(true) {//조건문이  true이기 때문에 무한반복되는 while
			String line = br.readLine(); // readLine메소드 이용
			if(line == null) break;
			System.out.println(line);
		}
		
		br.close();
		//BufferedReader의 readLine메소드는 더이상 읽을 라인이 없을 경우에 null을 리턴해줌
		
	}

}
