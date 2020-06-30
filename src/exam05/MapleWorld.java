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
		
		// 모두 Basic 타입으로 구현되어 있기에 Basic타입으로 묶을 수 있음
		Basic[] basics = new Basic[3];
		basics[0] = wizard;
		basics[1] = warrior;
		basics[2] = thief;
		
	}
}
