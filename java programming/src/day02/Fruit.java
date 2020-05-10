package day02;

public class Fruit {
	String name;
	int price = 0;
	
	public void setName(String name) {
		this.name = name; //this.name 클래스 내에서의  name. name은 string name
		//this는 해당 객체, 자기 자신
		//파라미터로 들어온 name과 객체의 name이 이름이 동일하기 때문에 명확히 해주는 것
		//this.name = name;

	}

	public static void main(String[] args) {
		Fruit apple = new Fruit();
		System.out.println(apple.name); //.:도트연산자 이용해서 객체가 보유한 속성에 접근 가능
		apple.name = "사과";
		System.out.println(apple.name);
		apple.price = 990;
		System.out.println(apple.price);
		
		Fruit banana = new Fruit();
		banana.price = 1000;
		banana.name = "바나나";
		System.out.println(banana.price);
		System.out.println(banana.name);
		
		//결론
		//객체 변수는 공유되지 않는다.
		//객체변수의 값은 독립적으로 유지된다 -> 클래스의 존재 이유
		
		apple.setName("맛있는 사과");
		System.out.println(apple.name);

	}

}
