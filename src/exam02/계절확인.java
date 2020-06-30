package exam02;

import java.util.Scanner;

public class 계절확인 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("월 입력 : ");
int mon = scan.nextInt();

// switch는 값이 참일 때 break를 만날 때까지 실행하므로 이를 통해 여러값을 같이 넣어둘 수 있다.
switch (mon) {
case 12:
case 1:
case 2:
	System.out.println(mon+"월은 겨울입니다.");
	break;

case 3:
case 4:
case 5:
	System.out.println(mon+"월은 봄입니다.");
	break;

case 6:
case 7:
case 8:
	System.out.println(mon+"월은 여름입니다.");
	break;
	
case 9:
case 10:
case 11:
	System.out.println(mon+"월은 가을입니다.");
}
	}

}
