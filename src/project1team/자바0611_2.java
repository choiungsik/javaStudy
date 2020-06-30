package project1team;

import java.util.Scanner;

public class 자바0611_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("확인할 단어를 입력하세요 : ");
		String word = scan.next();
		System.out.println(getMiddle(word));
	}	
	public static String getMiddle(String a) {
		String result = "";
		char[] array = new char[a.length()];
		for (int i = 0; i < array.length; i++) {
			array[i] = a.charAt(i);
		}
		
		if (a.length()%2 == 0) {
			System.out.print(array[array.length/2-1]);
			System.out.println(array[array.length/2]);
		} else {
			System.out.println(array[array.length/2]);
		}
		return result;
	}
}
