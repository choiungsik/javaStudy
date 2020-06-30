package exam02;

import java.util.Scanner;

public class 큰수_작은수_차이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// 뒤에 ln이 없으면 바로 옆에 입력된다.
		System.out.print("첫번째 입력 >> ");
		int num1 = scan.nextInt();
		System.out.print("두번째 입력 >> ");
		int num2 = scan.nextInt();
		
		int res = num1>num2 ? num1-num2 : num2-num1;
		String str = String.format("두 수의 차이 : %d", res);
		String str2 = String.format("%d와 %d의 차이 : %d", num1, num2, res);
		System.out.println(str);
		System.out.println(str2);
	}

}
