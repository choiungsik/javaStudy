package exam01;

public class Pocketmon {

	private String skill;
	private String name;
	private int attack;
	private int level;
	private int hp;
	private int speed;

	// �����ڴ� �޼ҵ��ε� Ŭ������ �̸��� �������·� return���� ����(void ���� �������� ����)
	// �� �Ӽ��� ��Ī�ϴ� Ű���� this�� Ȱ���ؼ� �Ű�������Ī�� ���������� ������
	// new�� ���� ȣ��� ������ ȣ���.
	// �����ڴ� �����ε��� ������(�Ű������� ������ ���氡��)
	public Pocketmon(String name, String skill, int attack, int level, int hp, int speed) {
		this.name = name;
		this.skill = skill;
		this.attack = attack;
		this.level = level;
		this.hp = hp;
		this.speed = speed;
	}

	// ������ �Ӽ����� �������ִ� �޼ҵ� ����
	public String getName() {
		return name;
	}

	public String getSkill() {
		return skill;
	}

	public int getAttack() {
		return attack;
	}

	public int getLevel() {
		return level;
	}

	public int getHp() {
		return hp;
	}

	public int getSpeed() {
		return speed;
	}

	public void getStatus() {
		System.out.print("���ϸ� �̸� : ");
		System.out.println(getName());
		System.out.print("���ϸ� ����� : ");
		System.out.println(getSkill());
		System.out.print("���ݷ� : ");
		System.out.println(getAttack());
		System.out.print("���� : ");
		System.out.println(getLevel());
		System.out.print("����� : ");
		System.out.println(getHp());
		System.out.print("�ӵ� : ");
		System.out.println(getSpeed());
	}

	// ������ �Ӽ����� ���� �ٽ� �����ִ� �޼ҵ带 �ۼ�
	public void setName(String name) {
		this.name = name;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setLevel(int level) {
		this.level = level;
		if (this.level >= 10) {
			name = "������";
		}
	}

	public void Battle() {

	}

}
