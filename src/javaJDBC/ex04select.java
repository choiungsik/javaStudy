package javaJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ex04select {

	public static void main(String[] args) {
		// member���̺� ��ü������ �˻��ؼ� �ܼ�â�� ���
		Connection conn = null;
		PreparedStatement pst = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String dbid = "system";
			String dbpw = "12345";

			conn = DriverManager.getConnection(url, dbid, dbpw);

			String sql = "select * from member";

			pst = conn.prepareStatement(sql);

			ResultSet result = pst.executeQuery();
			// insert, update, delete, create : executeUpdate�� Ȱ���ؼ� ����
			// ������ ��ɿ� ������ Ƚ��
			
			// select : executeQuery�� Ȱ���ؼ� ����
			// ������ �˻��� �����͸� ����

			// ������ ����� ���� ���� ��� True�� ����ϴ� .next()�� ���� �ݺ����� ����
			while(result.next()) {
				String id = result.getString(1);   // ù��°�� ���� ID�� ���
				String pw = result.getString(2);   // �ι�°�� ���� PW�� ���
				String nick = result.getString(3);   // ����°�� ���� NICK�� ���
				
				System.out.println(id + "\t" + pw + "\t" + nick);
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				pst.close();
				conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
