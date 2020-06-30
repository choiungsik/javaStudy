package javaJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ex04select {

	public static void main(String[] args) {
		// member테이블에 전체데이터 검색해서 콘솔창에 출력
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
			// insert, update, delete, create : executeUpdate를 활용해서 받음
			// 리턴은 명령에 성공한 횟수
			
			// select : executeQuery를 활용해서 받음
			// 리턴은 검색된 데이터를 받음

			// 나오는 결과에 값이 있을 경우 True를 출력하는 .next()를 통해 반복문을 돌림
			while(result.next()) {
				String id = result.getString(1);   // 첫번째에 오는 ID값 출력
				String pw = result.getString(2);   // 두번째에 오는 PW값 출력
				String nick = result.getString(3);   // 세번째에 오는 NICK값 출력
				
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
