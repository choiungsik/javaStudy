package javaJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ex02insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. oracle���� �����ϴ� lib������ import
		Connection conn = null;
		PreparedStatement pst = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. �����ε�(java�� �����ڰ� � DBMS�� ������� ��)

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "system";
			String dbpw = "12345";

			conn = DriverManager.getConnection(url, dbid, dbpw);
			// 3.DB�� ���� ���� DBID�� DBPW�� �����޴� ����
			// ���������� ������ �޾����� DB�� �ڵ鸵 �� �� �ִ�
			// Connection ��ü�� ����

			if (conn != null) {
				System.out.println("���Ἲ��");

			} else {
				System.out.println("�������");
			}

			String sql = "insert into member values('1','1','1')";

			pst = conn.prepareStatement(sql);
			// 4. SQL���� �غ�
			// SQL���� �̻��� ���� �� PreparedStatement ����

			pst.executeUpdate();
			// 5.SQL���� ����

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
