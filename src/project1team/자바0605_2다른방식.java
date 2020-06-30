package project1team;

import java.util.Scanner;

public class 자바0605_2다른방식 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력 >> ");
		int num = scan.nextInt();
		int result1[] = new int[num];
		int num_count = num;
		int count = 0;
		
		// math.pow를 통해서 구해야하는 자리 수까지 구하기
		// math.pow(2.i)는 2의 i승 값을 구하는데 이를 통해 이진법의 자리수를 찾아감
		for (int i = 0; i < num; i++) {
			if (num < Math.pow(2, i)) {
				count = i;
				break;
			}
		}
		// 배열을 이용해서 저장하고 거기에서 역출력하는 방안
		for (int i = 0; i < count; i++) {
			if (num_count % 2 == 0) {
				result1[i] = 0;
				num_count /= 2;
			} else {
				result1[i] = 1;
				num_count /= 2;
			}
		}
		
		for (int i = count -1; i >= 0; i--) {
			System.out.print(result1[i]+ " ");
			
		}
	}

}
