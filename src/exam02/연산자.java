package exam02;

public class 연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사칙연산자 +, -, *, /(몫을 구함), %(나눈 나머지를 구함)
		int a = 10, b = 5;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		int c = 10, d = 3;
		System.out.println(c+d);
		System.out.println(c-d);
		System.out.println(c*d);
		System.out.println((float)c/d);
		System.out.println(c%(double)d);
		//컴퓨터는 실수를 표현할 때 근사치로 표현해서 가장 가까운 숫자로 표시해버림
		System.out.println((double)c/d);
	
		//증감연산자
		int e = 10, f = 15;
		e++; //1번 실행당 1씩 값이 증가
		System.out.println(e);
		//실행키 ctrl + f11
		System.out.println(++e); //일단 1을 올리고 결과처리
		System.out.println(e++); //처리를 하고 1을 올림(현재는 13상태)
		System.out.println(e++ + f); //먼저 계산을 하고 e에 값을 올림
		System.out.println(e);
	
		// %%   and연산자
		// ||   or연산자
		// !    not연산자
		// &    1 true,  0 false  비트연산자
		// 시프트연산자 (별로 사용안하는 기능)
		
		//삼항연산자  (조건문) ? (실행문1-참일때 실행) : (실행문2-거짓일때 실행)
		//증감연산자, 산술연산자, 비교연산자, 논리연산자, 삼항연산자, 대입연산자 순으로 진행됨
	}

}
