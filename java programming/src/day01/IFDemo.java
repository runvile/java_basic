package day01;

public class IFDemo {
	public static int conditionTest(int value) {
		//value ���� ����Ǿ� �ִٰ� ����
		int ret = 0;
		if (value % 3 == 0) {//value�� 3�� ����̸�
			ret = 3;
		}
		// ���ǹ��� �߰��� value�� 4�� ����̸� ret�� 4�� �����ϴ� �ڵ� �߰�
		
		else if(value % 4 == 0) {
			 ret = 4;
		 } else {
			 ret = -1;
		 }
		//���ǹ��� �߰���  value�� 4�� ����̸� ret�� 4�� �����ϴ� �ڵ� �߰�
		//�ܴ̿� ��� ret = =-1;
		// �����ȯ
		return ret;
	}

	public static void main(String[] args) {
		System.out.println(conditionTest(12)); //3
		
		int score = 89;
		char grade = 'F'; // char :����
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
		 //x>1 : true ---> !(x>1):false -- if(false)�� �ض�
		 //if���� �׻� true�϶��� ��
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
