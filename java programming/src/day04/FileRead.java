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
		//FileInputStream Ŭ���� �̿�
		//byte �迭�� �̿��Ͽ� ������ �о���ϱ� ������ �о���ϴ� ������ ��Ȯ�� ���̸� �𸣴� ���->����
		
		//���� ���δ����� �б�
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\KG-ITBANK\\Desktop\\docs\\test3.txt"));
		//�����ھȿ� ��ü�� ������.
		while(true) {//���ǹ���  true�̱� ������ ���ѹݺ��Ǵ� while
			String line = br.readLine(); // readLine�޼ҵ� �̿�
			if(line == null) break;
			System.out.println(line);
		}
		
		br.close();
		//BufferedReader�� readLine�޼ҵ�� ���̻� ���� ������ ���� ��쿡 null�� ��������
		
	}

}
