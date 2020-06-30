package InputStrim;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadCSV {

	public ArrayList<EnergyVO> getList() {
		// 1. 파일의 위치와 정보를 담는 객체 생성
		File file = new File("C:\\Users\\smhrd\\Documents\\카카오톡 받은 파일\\chartlib\\광주광역시 계약구분별 사용량 데이터.csv");
		ArrayList<EnergyVO> list = new ArrayList<EnergyVO>();
		// 2. 파일객체를 읽어들여서 값을 꺼내는 Input 스트림 생성
		// 파일을 못찾을 수 있어서 try ~ catch문으로 예외처리를 만들어야함.
		try {
			Scanner sc = new Scanner(file);
			sc.nextLine(); // 맨 위의 구분은 한글형태라 엑셀에서 제거하거나 변수에 저장하기 전에 한라인을 보내버리고 저장시키면 정상적으로 작동함
			while (sc.hasNext()) {
				// 한줄씩 출력해서 가져오는데 다음줄에 값이 없을 때까지 가져옴 hasNext로 다음 값이 있는지 확인해 true, false를 받고
				// nextLine으로 값을 가져옴
				String line = sc.nextLine();
				// csv파일은 ,를 기준으로 열이 되어있어 기준으로 잘라서 출력해야함
				// split으로 자른 값은 배열형태로 나오니 각각의 값을 뽑아서 vo
				String division = line.split(",")[0];
				int usage = Integer.parseInt(line.split(",")[1]);
				String month = line.split(",")[2];
				
				EnergyVO vo = new EnergyVO(division, usage, month);
				list.add(vo);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;

	}

}
