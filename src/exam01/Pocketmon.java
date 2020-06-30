package exam01;

public class Pocketmon {

	private String skill;
	private String name;
	private int attack;
	private int level;
	private int hp;
	private int speed;

	// 생성자는 메소드인데 클래스와 이름이 같은형태로 return값이 없음(void 등이 존재하지 않음)
	// 위 속성을 지칭하는 키워드 this를 활용해서 매개변수명칭을 가져가도록 설정함
	// new를 통해 호출될 때에만 호출됨.
	// 생성자는 오버로딩이 가능함(매개변수의 개수를 변경가능)
	public Pocketmon(String name, String skill, int attack, int level, int hp, int speed) {
		this.name = name;
		this.skill = skill;
		this.attack = attack;
		this.level = level;
		this.hp = hp;
		this.speed = speed;
	}

	// 각각의 속성들을 리턴해주는 메소드 생성
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
		System.out.print("포켓몬 이름 : ");
		System.out.println(getName());
		System.out.print("포켓몬 기술명 : ");
		System.out.println(getSkill());
		System.out.print("공격력 : ");
		System.out.println(getAttack());
		System.out.print("레벨 : ");
		System.out.println(getLevel());
		System.out.print("생명력 : ");
		System.out.println(getHp());
		System.out.print("속도 : ");
		System.out.println(getSpeed());
	}

	// 각각의 속성들의 값을 다시 입혀주는 메소드를 작성
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
			name = "라이츄";
		}
	}

	public void Battle() {

	}

}
