package day01;

public class Strings {

	public static void main(java.lang.String[] args) {
		String str1 = "Hello java";
		String str2 = "123";
		
		System.out.println(str1 + " "+ str2);
		
		 //new ���ο� ��ü ���鶧 ���
		//��ü-���� ������ �ڷ���..
		String str3 = new String("Hello world");
		String str4 = new String("Hello world");
		
		System.out.println(str3 == str4);//false
		System.out.println(str3.equals(str4));//true
		
		String a = "Hello java";
		//indexOf: ���ڿ����� Ư�� ���ڰ� ���۵Ǵ� �ε��� ����
		System.out.println(a.indexOf("java")); // 6
		System.out.println(a.replace("java", "world"));
		// ù���� <= <������
		System.out.println(a.substring(0, 4)); //Hell
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		
	}

}
