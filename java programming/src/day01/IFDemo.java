package day01;

public class IFDemo {
	public static int conditionTest(int value) {
		//value 값이 선언되어 있다고 가정
		int ret = 0;
		if (value % 3 == 0) {//value가 3의 배수이면
			ret = 3;
		}
		// 조건문을 추가해 value가 4의 배수이면 ret에 4를 저장하는 코드 추가
		
		else if(value % 4 == 0) {
			 ret = 4;
		 } else {
			 ret = -1;
		 }
		//조건문을 추가해  value가 4의 배수이면 ret에 4를 저장하는 코드 추가
		//이외는 모두 ret = =-1;
		// 결과반환
		return ret;
	}

	public static void main(String[] args) {
		System.out.println(conditionTest(12)); //3
		
		int score = 89;
		char grade = 'F'; // char :문자
		if (score >= 90) {
			grade = 'A';
		}else if(score >= 80) {
			grade = 'B';
			
		}else if(score >=70) {
			grade = 'C';
		} else {
			grade = 'F';
		}
		 System.out.println("grade: "+grade);
		 
		 boolean isSuccess = false;
		 if(!isSuccess) {
			 System.out.println("true");
		 }
		 
		 boolean isSuccess1 = false;
		 int x =3;
		 //x>1 : true ---> !(x>1):false -- if(false)면 해라
		 //if문은 항상 true일때만 들어감
		if(!(x>1)) {
			 System.out.println("true");
		} else {
			 System.out.println("x>1");
		}
		//false&&true --> false
		//false||true --> 
		if(isSuccess && (x>1)) {
			System.out.println("isSuccess || (x>1)");
		}

	}

}
