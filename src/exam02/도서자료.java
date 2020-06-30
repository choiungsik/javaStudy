package exam02;

import java.util.Scanner;

public class 도서자료 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookData[] bookArr = new BookData[5];
		
		bookArr[0] = new BookData("Java", 21000, "홍길동");
		bookArr[1] = new BookData("C++", 29000, "박문수");
		bookArr[2] = new BookData("Database", 31000, "김장독");
		bookArr[3] = new BookData("Android", 18000, "이순신");
		bookArr[4] = new BookData("Web", 26000, "김철수");

		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 입력하세요 : ");
		int money = scan.nextInt();
		System.out.println("구매 가능한 책 목록");
		for (int i = 0; i < bookArr.length; i++) {
			if (money >= bookArr[i].getPrice()) {
			System.out.println("["+bookArr[i].getTitle()+", "+bookArr[i].getWriter()+", "+bookArr[i].getPrice()+"원]");
			}
		}
		
	}

}
