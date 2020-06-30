package exam02;

import java.util.Scanner;

public class while반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자를 입력받는데 홀수인지 짝수의 갯수를 확인하고 -1이 입력되었을 때 종료하는 프로그램
		
		Scanner scan = new Scanner(System.in);
		int count_o = 0;     // 홀수는 보통 odd
		int count_t = 0;     // 짝수는 보통 even
		
		while (true) {
			System.out.print("숫자 입력 : ");
			int num = scan.nextInt();
			if (num == -1) {
				System.out.println("종료되었습니다.");
				break;
			}if (num%2==0) {
				count_t++;
			}else {
				count_o++;
			}
			System.out.println("짝수개수 : "+count_t);
			System.out.println("홀수개수 : "+count_o);
		}
		
	}

}
