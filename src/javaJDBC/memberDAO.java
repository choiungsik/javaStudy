package javaJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class memberDAO {

	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet result;

	private void getConnection() {

		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, db_id, db_pw);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("클래스오류");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("sql오류");
		}
	}

	private void close() {
		try {
			// 이 경우도 진행될지 안될지 모르는 상황이니 try ~catch 문으로 실행시켜야 정상작동함
			if (result != null) {
				result.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}

		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	public int join(memberVO vo) {

		int cnt = 0;

		try {
			getConnection();

			String sql = "insert into tests values(?, ?, ?, ?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			psmt.setString(3, vo.getName());
			psmt.setInt(4, vo.getAge());

			System.out.println("|");
			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;
	}

	public String login(memberVO vo) {

		String name = null;

		try {
			getConnection();

			String sql = "select * from tests where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());

			result = psmt.executeQuery();

			if (result.next()) {
				name = result.getString("name");
			}
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			close();
		}

		return name;
	}

	public ArrayList<memberVO> selectAll() {

		ArrayList<memberVO> list = new ArrayList<memberVO>();
		
		try {
			getConnection();
			
			String sql = "select * from tests";
			psmt = conn.prepareStatement(sql);
			result = psmt.executeQuery();
			
			while (result.next()) {
				String id = result.getString("ID");
				String name = result.getString("NAME");
				int age = result.getInt("AGE");
				memberVO vo = new memberVO(id, name, age);
				list.add(vo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return list;
	}
	
	public int delete(memberVO vo) {

		int cnt = 0;

		try {
			getConnection();

			String sql = "delete tests where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;
	}
	

}
