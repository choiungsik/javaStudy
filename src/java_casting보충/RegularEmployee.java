package java_castingº¸Ãæ;

public class RegularEmployee extends Employee {
	
	private int bonus;

	public RegularEmployee(String empNo, String name, int pay, int bonus) {
		this.EmpNo = empNo;
		this.Name = name;
		this.Pay = pay;
		this.bonus = bonus;
	}

	public String getEmpNo() {
		return EmpNo;
	}

	public String getName() {
		return Name;
	}

	public int getPay() {
		return Pay;
	}

	public int getBonus() {
		return bonus;
	}

	public int calculate() {

		return (Pay+bonus)/12;
	}

}
