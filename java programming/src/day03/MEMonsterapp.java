package day03;
class Monster{
	String name, habitat;
	int health;
	int level = 0;
	
	public Monster(String name, String habitat, int health) {
		this.habitat = habitat;
		this.name = name;
		this.health = health;
	}
	public void levelUp() {
		level = level++;
		return;
	}
	public void levelDown() {
		level = level--;
		return;
	}
	
	public int healthChange(boolean isWin) {
		if(isWin) {
			health *= 2;
			levelUp();			
		}
		else{
			health /= 2;
			levelDown();
		}
		return health; 
	}	
	
}
class Batman extends Monster{
	String name, habitat, skill;
	int  health;
	boolean isLive = true;
	
	public Batman(String name, String habitat, int health, String skill) {
		super(name, habitat, health);
		this.skill = skill;
	}
	
	public void levelDown() {
		if(level<=0) {
			boolean isWin = false;
			System.out.println("level�� 0���� �۾��� �� �����ϴ�. ���ʹ� ����ִ°�?");
		} else{
			levelDown();
		}
	}
	
	public int Powercount() {
		int power;
		power = level + health;
		return power;
	}
	
}

public class MEMonsterapp {

	public static void main(String[] args) {
		/*
		* MonsterŬ����, BatmanŬ����, ����Ŭ����(MonsterApp)Ŭ���� ������ ����� 
		* 1) Monster Ŭ���� 
		* Monster��  name(�̸�, String), habitat(������, String), health(ü��, int), level(����, int) ������ ������ �ִ�. level�� �ʱⰪ=0
		* Monster�� name, habitat, health�� ��ü ���� �� �ʱ�ȭ�� �ݵ�� ������� 
		* 
		* levelUp() �޼ҵ� ����: void����Ÿ��, ���� 1 ����
		* levelDown() �޼ҵ� ����: void����Ÿ��, ���� 1 ���� 
		* 
		* healthChange�޼ҵ� ���� : int����Ÿ��
		* ���������� �¸� ����(boolean)�� ���� health�� �ٲ�� �ٲ� health�� ���� 
		* �̰�ٸ�, health 2�� ������Ű�� levelUp() �޼ҵ� ȣ��, 
		* ���ٸ�, health 2�� ���ҽ�Ű�� levelDown() �޼ҵ� ȣ�� 
		
		* 2) MonsterŬ������ ��ӹ޴�  Batman Ŭ���� �����ϱ� 
		* Batman�� name, habitat, health, skill(�ɷ�, String), isLive(��������, boolean) ������ ������ ������, isLive�ʱⰪ = true�̴�. 
		* Batman�� name, habitat, health, skill�� ��ü ���� �� �ʱ�ȭ�� �ݵ�� ����� �� 
		* 
		* ���� 1���ҽ�Ű�� �޼ҵ带 �������Ѵ� 
		* ����, ���� ������ 0���� �۰ų� ���ٸ�, isLive ���¸� false�� �ٲް� ���ÿ�
		* 							������ �޼��� ��� "level�� 0���� �۾��� �� �����ϴ�. ���ʹ� ����ִ°�? ???????"  ����ִ��� ���θ� boolean���� �Բ� ���
		* 	      �׷��� �ʴٸ�, MonsterŬ������ �޼ҵ� ������ �״�� �����Ѵ�.  
		* 
		* ����߰�) �Ŀ����� ����ϴ� �޼ҵ带 �����Ѵ�. 
		* 		   �Ű������� �ʿ����� �ʰ�, level�� health�� ���Ѱ����� power�� ���ǵǸ�, �̸� �������ش�.  //�������
		* 
		* ���� String �ڷ����� medicine�� �Ծ��ٰ� �������� �Ŀ����� ������� �� �ִ�. 
		* ����, medicine�� "Bat"�� ���, power�� level�� health�� ���Ѱ��� 2��� ���ǵȴ�. 
		* ����, medicine�� "Meat"�� ���, power�� level�� health�� ���Ѱ��� 3��� ���ǵȴ�.
		* medicine�� �� �ΰ�쿡 �ش����� ������, level�� health�� ���Ѱ����� ���ǵ� 
		* 
		*/
		
		// ���� �����
		Monster zombie = new Monster("����", "Cemetery", 200);
		System.out.println(zombie.name + " " + zombie.habitat + " " + zombie.health); //���� Cemetery 200
		zombie.healthChange(true); // 400
		System.out.println(zombie.health + " " + zombie.level); // 400 1
		
		Batman bat = new Batman("��Ʈ��", "Cave", 150, "Fly");
		System.out.println(bat.name + " " + bat.habitat + " " + bat.health + " " + bat.skill); // ��Ʈ�� Cave 150 Fly
		bat.healthChange(false); // level�� 0���� �۾��� �� �����ϴ�.���� �� ���ʹ� ����ִ°�? false
		System.out.println(bat.health + " " + bat.level); // 75 0
		bat.healthChange(true);
		System.out.println(bat.health + " " + bat.level); //150 1
		System.out.println(bat.healthChange(true) + " " + bat.level); // 300 2
		System.out.println("power��" + bat.getPower()); // power��302
		System.out.println("power��" + bat.getPower("Bat")); // power��604
		System.out.println("power��" + bat.getPower("Meat")); // power��906
		System.out.println("power��" + bat.getPower("Human")); // power��302
		

	}

}
