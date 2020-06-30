package javaJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class ex1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String db_id = "hr";
		String db_pw = "hr";

		memberDAO dao = new memberDAO();

		while (true) {
			System.out.print("[1]로그인 [2]회원가입 [3]전체조회 [4]종료 >> ");
			int choice = scan.nextInt();

			if (choice == 1) {
				System.out.println("======로그인======");
				System.out.print("아이디 : ");
				String id = scan.next();
				System.out.print("비밀번호 : ");
				String pw = scan.next();

				memberVO vo = new memberVO(id, pw);
				String name = dao.login(vo);

				if (name != null) {
					System.out.println(name + "님 환영합니다!");
				} else {
					System.out.println("로그인에 실패했습니다.");
				}

			} else if (choice == 2) {

				System.out.println("======회원가입======");
				System.out.print("아이디 입력 : ");
				String input_id = scan.next();
				System.out.print("비밀번호 입력 : ");
				String input_pw = scan.next();
				System.out.print("이름 입력 : ");
				String input_name = scan.next();
				System.out.print("나이 입력 : ");
				int input_age = scan.nextInt();

				memberVO vo = new memberVO(input_id, input_pw, input_name, input_age);
				int cnt = dao.join(vo);

				if (cnt > 0) {
					System.out.println("회원가입 성공");
				} else {
					System.out.println("회원가입 실패");
				}

			} else if (choice == 3) {

				System.out.println("======전체조회======");
				ArrayList<memberVO> list = dao.selectAll();
				for (int i = 0; i < list.size(); i++) {
					System.out.print(i+1+".");
					System.out.print(list.get(i).getId()+" ");
					System.out.print(list.get(i).getName()+" ");
					System.out.println(list.get(i).getAge());
				}
				
			} else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}

	}

}
