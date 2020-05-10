package day05;


interface programmer{
	public void coding();
}

interface tutor {
	public void tutoring();
}

interface youtuber{
	public void fliming();
}

class Jack implements programmer, tutor{
	public void coding() {
		System.out.println("takes 2 days");
	}
	public void tutoring() {
		System.out.println("teaches kids");
	}
}

class Jenny implements programmer, youtuber{
	public void coding() {
		System.out.println("takes 3 days");
	}
	public void fliming() {
		System.out.println("fliming video");
	}
}

public class Workplace {

	public static void main(String[] args) {
		//현재  workplace, 즉 직장이라는 곳에서 각 직원을 만들어내고 있기 때문에
		//프로그래머 이외의 기능은 필요없음
		//따라서 인터페이스 중 programmer로 데이터 타입을 지정하면 다른 인터페이스에서의 기능이
		//어떻든 상관이 없어짐
		programmer emp1= new Jack();
		programmer emp2 = new Jenny();
		
		//coding 요청함
		emp1.coding();
		emp2.coding();
		//emp1.tutoring();
		
		//만약 집이라고 과정
		Jack jack = new Jack(); 
		Jenny jenny = new Jenny();

	}

}
