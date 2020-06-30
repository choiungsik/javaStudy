package exam02;

import java.util.Scanner;

public class while반복문2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		while(true) {
			System.out.print("숫자 입력 : ");
			int num = scan.nextInt();
			// +=와 같은 특수기호는 int와 동시 사용이 불가능			
			sum += num;
			System.out.println("누적결과 : "+sum);
			if (num == -1) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
		
	}

}
