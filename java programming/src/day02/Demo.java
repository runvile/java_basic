package day02;

class Monster{
	//  Monster Ŭ���� ������
	// 1) ���ʹ� ü��health, �̸� name, ���� level, �ֽ� food �Ӽ��� ������ �ִ�
	// 2)ü�°� �̸��� ���͸��� �ٸ�����, �ʱⷹ���� 0���� ����
	//		�ֽ��� �޶�����, ��� ������ ������ �ֽĵ� �޶���
	int health;
	String name;
	int level = 0;
	static String food = "human"; //Ŭ���� ���� - ���������� �����ϰ� �ִ� �Ӽ� 
	
	//3)������ �̸���  health�� �������ִ� �޼ҵ� ����
	/*public void setInfo(String name, int health) {
		this.name = name;
		this.health = health;
	}*/
	
	public Monster(String name, int health) {
		this.name = name;
		this.health = health;
	}
	
	//4)������ �Ŀ� power�� ����+ü��. �Ŀ����� ��� �޼ҵ� �����ϱ�
	public int getpower() {
		int power =  health + level;
		return power;
	}
	//5) ������ ü���� ��ȭ�����ִ� �޼ҵ� �����ϱ�
	// ���� ���ӿ��� �̰�ٸ� -> level 1 ���, ü�� 2����
	//���� -> ���� 1 ����, ü�� 2�� ����
	//���� ���� ���緹�� �� ü���� ����������
	public void changelevel(boolean isWin) {
		if(isWin) {
			level++;
			health *= 2;
		}else {
			level--;
			health/=2;
		}
		System.out.println("���� ü��: "+ health + " ����: "+level);
	}
	// 6)������ �ֽ��� �����ϴ� �޼ҵ� �����
	public static void changeFood(String newfood) {
		food = newfood;
		System.out.println("����� ������ �ֽ� : " + food);
		
	}
}


public class Demo {

	public static void main(String[] args) {
		
		//���� Ŭ���� ������
		Monster zombie = new Monster();
		//zombie.setInfo("����", 100);
		System.out.println(zombie.name);
		System.out.println(zombie.health);
		boolean zombieWin = true;
		zombie.changelevel(zombieWin); //���� ü�� : 200, ���� : 1
		System.out.println(zombie.getpower()); // 201
		
		Monster dracula = new Monster();
		//dracula.setInfo("���ŧ��", 150);
		System.out.println(dracula.name);
		System.out.println(dracula.health);
		boolean draculaWin = false;
		dracula.changelevel(draculaWin); // ü�� 75 ���� -1
		System.out.println(dracula.getpower()); //74
		
		System.out.println(Monster.food);
		Monster.changeFood("Vegetable");
		
		System.out.println(Monster.food); // vegetable
		//�� ��ü�� �ֽ��� �ѹ��� ����� ���� �� �� �ִ�.
		System.out.println(zombie.food); 
		System.out.println(dracula.food); 
		
		//������: ������ 0���� �۾��� ��� or ü���� 0���� �۾��� ��쿡 ���� ó��
		// ���Ͱ� ���� �Ӽ� �߰�, �ɷ�ġ �߰�, �޼ҵ� �߰�........->��� �߰�
		


		
		
		

	}

}
