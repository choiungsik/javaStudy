package exam01;

public class productclass {

	private String name;
	private int unitPrice;
	private int amount;
	
	public productclass(String name, int unitPrice, int amount) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public int getAmount() {
		return amount;
	}
	
	
}
