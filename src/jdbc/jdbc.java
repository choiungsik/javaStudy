package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbc {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet result = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "hr";
			String dbpw = "hr";
			
			conn = DriverManager.getConnection(url, dbid, dbpw);
			String sql = "select * from tests where id = ? and pw = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, "2");
			pst.setString(2, "2");
			
			result = pst.executeQuery();
			
			while(result.next()) {
				String id = result.getString(1);   // 첫번째에 오는 ID값 출력
				String pw = result.getString(2);   // 두번째에 오는 PW값 출력
				String name = result.getString(3);   // 세번째에 오는 NICK값 출력
				int age = result.getInt(4);
				
				System.out.println(id + "\t" + pw + "\t" + name + "\t" + age);
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			// 현업에서는 추가적으로 오류마다 에러설명 등을 올릴 수 있어 나누는 것이 좋음
		} finally {
			
			try {
				if (result != null) {
					result.close();
				}
				if (pst != null) {
					pst.close();
				}
				if (conn != null) {
					conn.close();					
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
	}
	
}
