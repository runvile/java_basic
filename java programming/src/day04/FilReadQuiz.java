package day04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FilReadQuiz {

	public static void main(String[] args) throws IOException{
		// �������� ��ο� ���ε�� Congress.txt ����
				// �缱�� + �缱���� 
				// �� ������ �о �缱�� �̸��� �缱���� ���̿� " "(����) �����ڸ� �־ 
				// ���ο� ���� ����
				// ���ο� ������ �̸��� Congress_edit.txt�� docs���͸� �ϴܿ� ����
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\KG-ITBANK\\Desktop\\docs\\Congress.txt"));
		PrintWriter pw = new PrintWriter("C:\\Users\\KG-ITBANK\\Desktop\\docs\\Congress_edit.txt");
		
		while(true) {
			String line = br.readLine();
			if(line==null) break;
			// �̸��� �缱���� ���̿� " "(����) 
			//substring
			String name = line.substring(0, 3);//�����ε��� <= <�������ε���
			String area = line.substring(3); //��õ� �ε������� ������
			String data = name+ " " +area;
			pw.println(data);
			System.out.println(data);
			
		}
		
		br.close();
		pw.close();
		
	}

}
