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
			System.out.print("[1]�α��� [2]ȸ������ [3]��ü��ȸ [4]���� >> ");
			int choice = scan.nextInt();

			if (choice == 1) {
				System.out.println("======�α���======");
				System.out.print("���̵� : ");
				String id = scan.next();
				System.out.print("��й�ȣ : ");
				String pw = scan.next();

				memberVO vo = new memberVO(id, pw);
				String name = dao.login(vo);

				if (name != null) {
					System.out.println(name + "�� ȯ���մϴ�!");
				} else {
					System.out.println("�α��ο� �����߽��ϴ�.");
				}

			} else if (choice == 2) {

				System.out.println("======ȸ������======");
				System.out.print("���̵� �Է� : ");
				String input_id = scan.next();
				System.out.print("��й�ȣ �Է� : ");
				String input_pw = scan.next();
				System.out.print("�̸� �Է� : ");
				String input_name = scan.next();
				System.out.print("���� �Է� : ");
				int input_age = scan.nextInt();

				memberVO vo = new memberVO(input_id, input_pw, input_name, input_age);
				int cnt = dao.join(vo);

				if (cnt > 0) {
					System.out.println("ȸ������ ����");
				} else {
					System.out.println("ȸ������ ����");
				}

			} else if (choice == 3) {

				System.out.println("======��ü��ȸ======");
				ArrayList<memberVO> list = dao.selectAll();
				for (int i = 0; i < list.size(); i++) {
					System.out.print(i+1+".");
					System.out.print(list.get(i).getId()+" ");
					System.out.print(list.get(i).getName()+" ");
					System.out.println(list.get(i).getAge());
				}
				
			} else {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}

		}

	}

}
