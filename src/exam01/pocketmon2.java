package exam01;

public class pocketmon2 {

	private String name;
	private int attack;
	private String skill;
	
	// alt+shift+s 를 통해서 generate constructor using field 로 생성자를 자동생성 가능
	// super는 지금은 필요 없으니 제거하자
	public pocketmon2(String name, int attack, String skill) {
		this.name = name;
		this.attack = attack;
		this.skill = skill;
	}
	// alt+shift+s 를 통해서 generate getters and setters 로 설정한 객체를 불러오는 메소드를 자동생성 가능
	
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
