package exam01;

public class pocketmon2 {

	private String name;
	private int attack;
	private String skill;
	
	// alt+shift+s �� ���ؼ� generate constructor using field �� �����ڸ� �ڵ����� ����
	// super�� ������ �ʿ� ������ ��������
	public pocketmon2(String name, int attack, String skill) {
		this.name = name;
		this.attack = attack;
		this.skill = skill;
	}
	// alt+shift+s �� ���ؼ� generate getters and setters �� ������ ��ü�� �ҷ����� �޼ҵ带 �ڵ����� ����
	
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	
}
