package java_castingº¸Ãæ;

public class PartTimeEmployee extends Employee {

	private int WorkDay;

	public PartTimeEmployee(String empNo, String name, int pay, int workDay) {
		EmpNo = empNo;
		Name = name;
		Pay = pay;
		WorkDay = workDay;
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

	public int getWorkDay() {
		return WorkDay;
	}

	public int calculate() {

		return Pay * WorkDay;
	}

}
