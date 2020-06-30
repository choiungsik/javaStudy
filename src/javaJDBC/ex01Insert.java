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
		// 1. oracle에서 제공하는 library파일을 import하기
		// 프로젝트폴더에서 Build Path - Configue Build Path 접속
		// Java Build Path - Libraries - Add External JARS - 폴더 내 JAR 선택 - Apply
		// jar폴더가 있는 경로를 선택하여 우리가 사용할 JAR파일을 선택해 import시킨다.

		// 2. 동적로딩(외부에서 클래스파일을 받아서 로딩하는 것)
		// java는 개발자가 어떤 DBMS를 사용할지 모르니 forname에 어떤 것을 사용하는지 입력해야함
		// 이 때 우리가 찾는 파일이 있는지 확인할 수 없기 때문에 trycatch문으로 실행하도록 만들어야한다.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String dbid = "system";
			String dbpw = "12345";
			// 3. DB로 가서 실제 DBID와 DBPW를 인증받는 절차를 getConnection을 통해 진행함
			// 성공적으로 인증을 받았으면 DB를 핸들링 할 수 있는 Connection 객체를 리턴함(이때 java.sql에 있는 Connection을
			// 가져와야함)
			conn = DriverManager.getConnection(url, dbid, dbpw);

			if (conn != null) {
				System.out.println("연결성공");
			} else {
				System.out.println("연결실패");
			}

			System.out.println("ID입력 : ");
			String ID = scan.next();
			System.out.println("PW입력 : ");
			String PW = scan.next();
			System.out.println("NICK입력 : ");
			String NICK = scan.next();

			System.out.println();
			String sql = "insert into member values(?, ?, ?)";

			pst = conn.prepareStatement(sql);
			// 4. sql문을 준비하는 단계
			// preparedStatement 는 sql에 이상이 없을 경우 나옴
			// 입력되는 물음표에 어떤 값이 들어가는지 변수로 저장해서 지정할 수 있다.
			pst.setString(1, ID);
			pst.setString(2, PW);
			pst.setString(3, NICK);

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
