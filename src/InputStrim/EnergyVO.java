package InputStrim;

public class EnergyVO {

	private String division; // ����
	private int usage; // ��뷮
	private String month; // ��
	
	
	public EnergyVO(String division, int usage, String month) {
		this.division = division;
		this.usage = usage;
		this.month = month;
	}


	public String getDivision() {
		return division;
	}


	public int getUsage() {
		return usage;
	}


	public String getMonth() {
		return month;
	}


	public void setDivision(String division) {
		this.division = division;
	}


	public void setUsage(int usage) {
		this.usage = usage;
	}


	public void setMonth(String month) {
		this.month = month;
	}
	
	
	
}
