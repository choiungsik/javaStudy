package exam05;

public class MapleWorld {

	public static void main(String[] args) {
		Wizard wizard = new Wizard();
		Warrior warrior = new Warrior();
		Thief thief = new Thief();
		
		wizard.attack();
		wizard.move();
		warrior.attack();
		warrior.move();
		thief.attack();
		thief.move();
		System.out.println();
		
		// ��� Basic Ÿ������ �����Ǿ� �ֱ⿡ BasicŸ������ ���� �� ����
		Basic[] basics = new Basic[3];
		basics[0] = wizard;
		basics[1] = warrior;
		basics[2] = thief;
		
	}
}
