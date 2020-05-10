package day01;

public class Num {

	public static void main(String[] args) {
		 int age = 10;
		 long countOfStar = 1284839L;
		 
		 double a= 3.14;
		 float b = 3.14f;
		 double c = 1.234e2; // 지수표현식 10^2
		 
		 int num1 =10;
		 int num2 = 5;
		 System.out.println(num1 + num2);
		 System.out.println(num1 - num2);
		 System.out.println(num2 * num1);
		 System.out.println(num2 / num1);
		 System.out.println(num2 % num1);
		 
		 int i = 0;
		 i++;
		 
		 int j = 10;
		 j--;
		 
		 System.out.println(i);
		 System.out.println(j);
		 
		 int k = 0;
		 System.out.println(k++); //0
		 //k++ 해당코드가 실행되는 순간에는 k값이 변경되지 않음.
		 // 코드가 실행이 된 후 변경 -> 값이 참조된 이후에 증가
		 System.out.println(k); //1
		 System.out.println(++k); //2
		 System.out.println(k); //2
	}

}
