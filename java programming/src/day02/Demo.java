package day02;

class Monster{
	//  Monster 클래스 만들어보기
	// 1) 몬스터는 체력health, 이름 name, 레벨 level, 주식 food 속성을 가지고 있다
	// 2)체력과 이름은 몬스터마다 다르지만, 초기레벨은 0으로 설정
	//		주식이 달라지면, 모든 종류의 몬스터의 주식도 달라짐
	int health;
	String name;
	int level = 0;
	static String food = "human"; //클래스 변수 - 공통적으로 공유하고 있는 속성 
	
	//3)몬스터의 이름과  health을 세팅해주는 메소드 생성
	/*public void setInfo(String name, int health) {
		this.name = name;
		this.health = health;
	}*/
	
	public Monster(String name, int health) {
		this.name = name;
		this.health = health;
	}
	
	//4)몬스터의 파워 power은 레벨+체력. 파워값을 얻는 메소드 생성하기
	public int getpower() {
		int power =  health + level;
		return power;
	}
	//5) 레벨과 체력을 변화시켜주는 메소드 생성하기
	// 만약 게임에서 이겼다면 -> level 1 상승, 체력 2배상승
	//지면 -> 레벨 1 감소, 체력 2배 감소
	//게임 이후 현재레벨 및 체력을 출력해줘야함
	public void changelevel(boolean isWin) {
		if(isWin) {
			level++;
			health *= 2;
		}else {
			level--;
			health/=2;
		}
		System.out.println("현재 체력: "+ health + " 레벨: "+level);
	}
	// 6)몬스터의 주식을 변경하는 메소드 만들기
	public static void changeFood(String newfood) {
		food = newfood;
		System.out.println("변경된 몬스터의 주식 : " + food);
		
	}
}


public class Demo {

	public static void main(String[] args) {
		
		//몬스터 클래스 만들어보기
		Monster zombie = new Monster();
		//zombie.setInfo("좀비", 100);
		System.out.println(zombie.name);
		System.out.println(zombie.health);
		boolean zombieWin = true;
		zombie.changelevel(zombieWin); //현재 체력 : 200, 레벨 : 1
		System.out.println(zombie.getpower()); // 201
		
		Monster dracula = new Monster();
		//dracula.setInfo("드라큘라", 150);
		System.out.println(dracula.name);
		System.out.println(dracula.health);
		boolean draculaWin = false;
		dracula.changelevel(draculaWin); // 체력 75 레벌 -1
		System.out.println(dracula.getpower()); //74
		
		System.out.println(Monster.food);
		Monster.changeFood("Vegetable");
		
		System.out.println(Monster.food); // vegetable
		//두 객체의 주식이 한번에 변경된 것을 알 수 있다.
		System.out.println(zombie.food); 
		System.out.println(dracula.food); 
		
		//개선점: 레벨이 0보다 작아질 경우 or 체력이 0보다 작아질 경우에 대한 처리
		// 몬스터가 가진 속성 추가, 능력치 추가, 메소드 추가........->기능 추가
		


		
		
		

	}

}
