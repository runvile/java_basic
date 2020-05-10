package day02;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// ����(Array) []
		//������ �� ũ�⸦ ������� ��.
		
		int[] array1 = new int[4];
		System.out.println(array1.length);
		array1[0] = 1;
		array1[1] = 2;
		array1[2] = 3;
		array1[3] = 4;
		// System.out.println(array1); �ּҰ� ���
		System.out.println(Arrays.toString(array1)); //toString-�� ���� string���� ��ȯ�����
		
		int[] a = new int[] {1, 2, 3, 4, 5};
		int[] b = {1, 2, 3, 5, 4};  //�迭�� �ε��� ���� �ٸ��Ƿ�  a, b�� �ٸ�
		System.out.println(Arrays.toString(b));
		//�� �迭�� �ε���(��ġ�� �����ϰ�, ������Ʈ���� �����ؾ� ���� �迭
		System.out.println(Arrays.equals(a, b)); // �� �迭 �� -> false
		
		Arrays.sort(b); //����
		System.out.println(Arrays.toString(b));
		
		System.out.println(Arrays.equals(a, b)); // �� �迭 �� -> true
		
		Arrays.fill(a, 4); // a��� �迭�� 4�� ä����
		System.out.println(Arrays.toString(a));
		
		int[] c = new int[4];
		System.out.println(Arrays.toString(c));
		
		String[] d = new String[3];
		System.out.println(Arrays.toString(d));
		
		String[] weeks = {"��", "ȭ", "��", "��", "��", "��", "��"};
		System.out.println(weeks.length);
		System.out.println(Arrays.toString(weeks));
		System.out.println(weeks[3]);  //Ư�� �ε��� �� ��� ��
		
		//�迭�� �Ѱ� ũ�Ⱑ �������ִ�
		System.out.println(weeks[6]); //��
		//System.out.println(weeks[7]);
		//������ �߻� ArrayIndexOutOfBoundsException
		
		int[] array3 = new int[10];
		//for���� �̿��ؼ� array3�� �ε����� 1~10���� �Ҵ�
		
		for(int i=0; i<array3.length; i++) {
			array3[i] = i+1;
			System.out.println(Arrays.toString(array3));
		}
		
		//2���� �迭
		int[][] array4 = new int[3][4];
		System.out.println(Arrays.deepToString(array4));
		//[3] �ٱ��� �迭�� ũ��, [4] ���� �迭�� ũ��
		
		int[][] array5 = new int[3][];
		// array5: 3��¥�� �迭�� ������ ����. ������ 3��¥�� �迭�� ���� �����ϴ� �迭 ����.
		array5[0] = new int[1]; // ũ�Ⱑ 1�� �迭�� ����, array5�� 0��° �ε����� ����.
		array5[1] = new int[2]; // ũ�Ⱑ 2�� �迭�� ����, array5�� 1��° �ε����� ����.
		array5[2] = new int[3];
		System.out.println(Arrays.deepToString(array5));
		
		int[][] array6 = {{1}, {2,3}, {4,5,6}};
		System.out.println(array6[0][0]); // 1
		System.out.println(array6[2][1]); //5
		
		int[][] test = {{1}, {1,2}, {1,2,3}, {1,2,3,4}};
		
		//2���� �迭 test�� �� ���� ����ϱ� /for�� �̿�
		//1
		//12
		//123
		
		for(int i=0; i<test.length; i++) {
			for(int j=0; j<test[i].length; j++) {
				System.out.print(test[i][j]+" ");
			}
			System.out.println();
		}
		
		//����Ʈ(List) - �迭�� ����� �ڹ��� �ڷ���. �迭���� ���� ����� ������ ����.
		//�迭�� ũ�Ⱑ ������ �ִ� �ݸ�, ����Ʈ�� ũ�� ������ ���� ����.
		//list �ڷ���
		//���� ������ �ڷ����� ArrayList �غ���
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("one");
		list1.add("two");
		list1.add(2, "three");
		list1.add(3, "four");
		//list1.add(4, "four"); �����߻�
		System.out.println(list1);
		//get : Ư�� �ε����� ����
		System.out.println(list1.get(3));
		//size:����Ʈ ũ��
		System.out.println(list1.size());
		
		//contains : ����Ʈ �ȿ� Ư������ �������� �߻� --> boolean���� ����
		System.out.println(list1.contains("five")); // false
		
		//remove: ����Ʈ���� ������Ʈ ����
		System.out.println(list1.remove("one"));
		System.out.println(list1);
		System.out.println(list1.remove(0));
		System.out.println(list1);
		
		
		
		
	}

}
