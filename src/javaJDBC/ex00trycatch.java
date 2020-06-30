package javaJDBC;

public class ex00trycatch {

	public static void main(String[] args) {
		/*
		 * Java파일 실행되는 과정 - java -> 컴파일 -> .class -> 실행 
		 * 오류의 2가지 1. 컴파일 오류, 2. 런타임오류
		 * 컴파일오류는 문법적 오류 
		 * 런타임오류 : 실행이 되야 알수 있는 오류 (파일찾을 때 (열기) / DB / 네트워크 등) 
		 * try ~ catch(예외처리) 교재 p 152
		 */

		System.out.println("실행시작");

		// try는 프로그램을 실행하는 부분
		try {
			System.out.println(2 / 0);
		} catch (Exception e) {
			// catch는 오류가 났을 때 들어오는 부분
			System.out.println("오류발생");
			e.printStackTrace();
		}
		// 오류가 나면 catch쪽에 있는 명령문을 실행시켜 나머지 문장을 정상적으로 작동시킴
		// e.printStackTrace()를 통해서 어떤 오류가 났는지를 확인 할 수 있음(e라는 변수에 오류정보를 가지고 있음)
		finally {
			System.out.println("try ~ catch 종료");
		}
		// finally는 try~catch 마지막에 무조건 실행되는 명령어(오류가 나도 안나도 무조건 실행됨)

		System.out.println("실행완료");

	}

}
