package javaJDBC_bookinfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class bookinfo_select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pst = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String dbid = "system";
			String dbpw = "12345";

			conn = DriverManager.getConnection(url, dbid, dbpw);

			String sql = "select * from bookinfo";

			pst = conn.prepareStatement(sql);

			ResultSet result = pst.executeQuery();
			// insert, update, delete, create : executeUpdate�� Ȱ���ؼ� ����
			// ������ ��ɿ� ������ Ƚ��
			
			// select : executeQuery�� Ȱ���ؼ� ����
			// ������ �˻��� �����͸� ����

			// ������ ����� ���� ���� ��� True�� ����ϴ� .next()�� ���� �ݺ����� ����
			while(result.next()) {
				String code = result.getString(1);   // ù��°�� ���� �ڵ尪 ���
				String title = result.getString(2);   // �ι�°�� ���� ���� ���
				String price = result.getString(3);   // ����°�� ���� ���ݰ� ���
				String author = result.getString(4);    // �׹�°�� ���� �۰��� ���
				String publisher = result.getString(5);  // �ټ���°�� ���� �����簪 ���
				System.out.println("�ڵ� : A10"+code);
				System.out.println("���� : "+title);
				System.out.println("���� : "+price.substring(0,3)+","+price.substring(2,5));
				System.out.println("���� : "+author);
				System.out.println("���ǻ� : "+publisher);
				System.out.println("====================");
				
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
