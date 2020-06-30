package java_castingº¸Ãæ;

public class TempEmployee extends Employee {

	public TempEmployee(String empNo, String name, int pay) {
		EmpNo = empNo;
		Name = name;
		Pay = pay;
	}

	public String getEmpNo() {
		return EmpNo;
	}

	public void setEmpNo(String empNo) {
		EmpNo = empNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPay() {
		return Pay;
	}

	public void setPay(int pay) {
		Pay = pay;
	}

	public int calculate() {

		return Pay/12;
	}

}
