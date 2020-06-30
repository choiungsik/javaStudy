package javaJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ex01Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pst = null;
		Scanner scan = new Scanner(System.in);
		// 1. oracle���� �����ϴ� library������ import�ϱ�
		// ������Ʈ�������� Build Path - Configue Build Path ����
		// Java Build Path - Libraries - Add External JARS - ���� �� JAR ���� - Apply
		// jar������ �ִ� ��θ� �����Ͽ� �츮�� ����� JAR������ ������ import��Ų��.

		// 2. �����ε�(�ܺο��� Ŭ���������� �޾Ƽ� �ε��ϴ� ��)
		// java�� �����ڰ� � DBMS�� ������� �𸣴� forname�� � ���� ����ϴ��� �Է��ؾ���
		// �� �� �츮�� ã�� ������ �ִ��� Ȯ���� �� ���� ������ trycatch������ �����ϵ��� �������Ѵ�.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String dbid = "system";
			String dbpw = "12345";
			// 3. DB�� ���� ���� DBID�� DBPW�� �����޴� ������ getConnection�� ���� ������
			// ���������� ������ �޾����� DB�� �ڵ鸵 �� �� �ִ� Connection ��ü�� ������(�̶� java.sql�� �ִ� Connection��
			// �����;���)
			conn = DriverManager.getConnection(url, dbid, dbpw);

			if (conn != null) {
				System.out.println("���Ἲ��");
			} else {
				System.out.println("�������");
			}

			System.out.println("ID�Է� : ");
			String ID = scan.next();
			System.out.println("PW�Է� : ");
			String PW = scan.next();
			System.out.println("NICK�Է� : ");
			String NICK = scan.next();

			System.out.println();
			String sql = "insert into member values(?, ?, ?)";

			pst = conn.prepareStatement(sql);
			// 4. sql���� �غ��ϴ� �ܰ�
			// preparedStatement �� sql�� �̻��� ���� ��� ����
			// �ԷµǴ� ����ǥ�� � ���� ������ ������ �����ؼ� ������ �� �ִ�.
			pst.setString(1, ID);
			pst.setString(2, PW);
			pst.setString(3, NICK);

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
