package exam01;

import java.util.Scanner;

public class switch문장 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("번호를 선택하세요.(1~2)");
		int number = scan.nextInt();
		
		switch (number) {
		case 1 :
			System.out.println(1);
			break;
		case 2 :
			System.out.println(2);
			break;
		default :
			System.out.println("해당 값이 없습니다.");
			break;
		}
	}

}
