package exam02;

public class BookData {

	private String title;
	private int price;
	private String writer;
	
	public BookData(String title, int price, String writer) {
		super();
		this.title = title;
		this.price = price;
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	
}
