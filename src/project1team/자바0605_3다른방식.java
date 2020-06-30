package project1team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 자바0605_3다른방식 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// list1 은 배열형태, list2 는 리스트형태
		Scanner scan = new Scanner(System.in);
		ArrayList list2 = new ArrayList<>();
		// int list1[] = new int[5];
		// int change = 0;

		for (int i = 0; i < 5; i++) {
			System.out.printf((i + 1) + "번째 수 입력 : ");
			//list1[i] = scan.nextInt();
			list2.add(scan.nextInt());
		}
		//list1을 배열형태로 만들어서 collections를 활용하지 못함.
		Collections.sort(list2);
		System.out.println("정렬 후");
		for (int i = 0; i < list2.size(); i++) {
			System.out.print(list2.get(i) + " ");
		}
	}
}
