package javaJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ex03delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

			// 입력한 ID를 삭제하는 문장
			// 단 삭제할 경우 기존에 데이터가 있어야하는데 연결한 DB가 커밋되기전 상태라면 추가된 데이터가 없는 것으로 생각되어 명령이 실패할 수
			// 있으니 주의할것(필히 commit!)

			System.out.print("삭제할 ID입력 : ");
			String ID = scan.next();

			String sql = "delete member where id = ?";

			pst = conn.prepareStatement(sql);
			pst.setString(1, ID);

			int cnt = pst.executeUpdate();
			// 5. SQL문장을 실행시킴
			// java에서는 실행되었는지 문장을 확인불가능해서 cnt로 몇개가 성공했는지 확인해서 출력해야함
			if (cnt > 0) {
				System.out.println(cnt + "개 명령성공");
			} else {
				System.out.println("명령실패");
			}

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
