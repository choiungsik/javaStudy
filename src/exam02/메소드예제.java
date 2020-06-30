package exam02;

import java.util.Scanner;

public class 메소드예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수입력 : ");
		int num1 = scan.nextInt();
		Scanner scan1 = new Scanner(System.in);
		System.out.print("두번째 정수입력 : ");
		int num2 = scan1.nextInt();
		Scanner scan2 = new Scanner(System.in);
		System.out.print("세번째 정수입력 : ");
		int num3 = scan2.nextInt();
		System.out.println(addNumber(num1, num2, num3));
		
		add(num1, num2);
		sub(num1, num2);
		mul(num1, num2);
		div(num1, num2);
		
		
	}
	
	public static int addNumber(int num1, int num2, int num3) {
		return num1+num2+num3;
	}

	public static void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	public static void sub(int num1, int num2) {
		if (num1 > num2) {
		System.out.println(num1-num2);
		} else {
			System.out.println(num2-num1);
		}
	}
	public static void mul(int num1, int num2) {
		System.out.println(num1*num2);
	}
	public static void div(int num1, int num2) {
		System.out.println(num1/num2);
	}
}
