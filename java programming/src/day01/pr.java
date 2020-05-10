package day01;

public class pr {

	public static void main(String[] args) {
		//1
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		//2
		for(int i=0; i<4; i++) {
			for(int j=0; j<i+1; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<5; i++) {
			for(int j=4; j>0; j--) {
				if(i<j) {
				System.out.print(" ");
				}else
			System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<3-i; j++) {
				System.out.print(" ");
			}
			for (int k=0; k<i*2+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
