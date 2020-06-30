package javaJDBC_bookinfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class bookinfo_insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pst = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String dbid = "system";
			String dbpw = "12345";

			conn = DriverManager.getConnection(url, dbid, dbpw);

			// �Է��� ������� �н����带 �����ϴ� �ڵ� �ۼ�

			System.out.print("CODE�Է� : ");
			String code = scan.next();
			System.out.print("TITLE�Է� : ");
			String title = scan.next();
			System.out.print("PRICE�Է� : ");
			String price = scan.next();
			System.out.print("AUTHOR�Է� : ");
			String author = scan.next();
			System.out.print("PUBLISHER�Է� : ");
			String publisher = scan.next();

			String sql = "insert into bookinfo values(?, ?, ?, ?, ?)";

			pst = conn.prepareStatement(sql);
			pst.setString(1, code);
			pst.setString(2, title);
			pst.setString(3, price);
			pst.setString(4, author);
			pst.setString(5, publisher);

			int cnt = pst.executeUpdate();
			// 5. SQL������ �����Ŵ
			// java������ ����Ǿ����� ������ Ȯ�κҰ����ؼ� cnt�� ��� �����ߴ��� Ȯ���ؼ� ����ؾ���
			if (cnt > 0) {
				System.out.println(cnt + "�� ��ɼ���");
			} else {
				System.out.println("��ɽ���");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// ������ conn�� pst�� ���� ��� ������ �����ϰ� �ɷ� ������ ���� �� ������ ��� �۾� ���� �� �ݵ�� �ش� ��θ� �ݾ��־���Ѵ�.
			try {
				// �� ��쵵 ������� �ȵ��� �𸣴� ��Ȳ�̴� try ~catch ������ ������Ѿ� �����۵���
				pst.close();
				conn.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
