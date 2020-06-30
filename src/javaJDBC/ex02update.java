package javaJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ex02update {

	public static void main(String[] args) {
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

			System.out.print("ID�Է� : ");
			String ID = scan.next();
			System.out.print("������ PW�Է� : ");
			String PW = scan.next();

			String sql = "update member set pw = ? where id = ?";

			pst = conn.prepareStatement(sql);
			pst.setString(1, PW);
			pst.setString(2, ID);

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
