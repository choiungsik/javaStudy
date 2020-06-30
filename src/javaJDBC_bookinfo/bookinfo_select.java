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
			// insert, update, delete, create : executeUpdate를 활용해서 받음
			// 리턴은 명령에 성공한 횟수
			
			// select : executeQuery를 활용해서 받음
			// 리턴은 검색된 데이터를 받음

			// 나오는 결과에 값이 있을 경우 True를 출력하는 .next()를 통해 반복문을 돌림
			while(result.next()) {
				String code = result.getString(1);   // 첫번째에 오는 코드값 출력
				String title = result.getString(2);   // 두번째에 오는 제목값 출력
				String price = result.getString(3);   // 세번째에 오는 가격값 출력
				String author = result.getString(4);    // 네번째에 오는 작가명값 출력
				String publisher = result.getString(5);  // 다섯번째에 오는 제조사값 출력
				System.out.println("코드 : A10"+code);
				System.out.println("제목 : "+title);
				System.out.println("가격 : "+price.substring(0,3)+","+price.substring(2,5));
				System.out.println("저자 : "+author);
				System.out.println("출판사 : "+publisher);
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
