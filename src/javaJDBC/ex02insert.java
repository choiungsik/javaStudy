package javaJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ex02insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. oracle에서 제공하는 lib파일을 import
		Connection conn = null;
		PreparedStatement pst = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. 동적로딩(java는 개발자가 어떤 DBMS를 사용할지 모름)

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "system";
			String dbpw = "12345";

			conn = DriverManager.getConnection(url, dbid, dbpw);
			// 3.DB로 가서 실제 DBID와 DBPW를 인증받는 절차
			// 성공적으로 인증을 받았으면 DB를 핸들링 할 수 있는
			// Connection 객체를 리턴

			if (conn != null) {
				System.out.println("연결성공");

			} else {
				System.out.println("연결실패");
			}

			String sql = "insert into member values('1','1','1')";

			pst = conn.prepareStatement(sql);
			// 4. SQL문을 준비
			// SQL문에 이상이 없을 때 PreparedStatement 리턴

			pst.executeUpdate();
			// 5.SQL문을 실행

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 연결한 conn과 pst를 놔둘 경우 서버에 과부하가 걸려 서버가 죽을 수 있으니 모든 작업 종료 후 반드시 해당 통로를 닫아주어야한다.
			try {
				// 이 경우도 진행될지 안될지 모르는 상황이니 try ~catch 문으로 실행시켜야 정상작동함
				pst.close();
				conn.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
