package exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList를 만들고 넣을 요소로 productclass를 넣겠다고 선언만 한 상태
		ArrayList<productclass> prolist = new ArrayList<productclass>();
		Scanner scan = new Scanner(System.in);
		int input = 0;

		while (input != 3) {
			System.out.print("[1]물건 추가 [2]예상 판매량 조회 [3]종료 >> ");
			input = scan.nextInt();
			if (input == 1) {
				System.out.print("물건 이름 : ");
				String pname = scan.next();
				System.out.print("단가 : ");
				int pprice = scan.nextInt();
				System.out.print("수량 : ");
				int pamount = scan.nextInt();

				// productclass 객체를 만들어서 넣겠다고 선언한 ArrayList에 넣음(객체가 가진 주소 채 저장)
				productclass pro = new productclass(pname, pprice, pamount);
				prolist.add(pro);
			} else if (input == 2) {
				if (prolist.size() == 0) {
					System.out.println("추가된 물건이 없습니다.");
				} else {
					System.out.println("제품명\t단가\t수량");
					int total = 0;
					for (int i = 0; i < prolist.size(); i++) {
						System.out.print(prolist.get(i).getName() + "\t");
						System.out.print(prolist.get(i).getUnitPrice() + "원\t");
						System.out.println(prolist.get(i).getAmount() + "개\t");
						total += prolist.get(i).getUnitPrice() * prolist.get(i).getAmount();
					}
					System.out.println("판매시 매출 : " + total + "원");
				}
			}
		}
		System.out.println("프로그램 종료");
	}

}
