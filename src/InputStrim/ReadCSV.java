package InputStrim;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadCSV {

	public ArrayList<EnergyVO> getList() {
		// 1. ������ ��ġ�� ������ ��� ��ü ����
		File file = new File("C:\\Users\\smhrd\\Documents\\īī���� ���� ����\\chartlib\\���ֱ����� ��౸�к� ��뷮 ������.csv");
		ArrayList<EnergyVO> list = new ArrayList<EnergyVO>();
		// 2. ���ϰ�ü�� �о�鿩�� ���� ������ Input ��Ʈ�� ����
		// ������ ��ã�� �� �־ try ~ catch������ ����ó���� ��������.
		try {
			Scanner sc = new Scanner(file);
			sc.nextLine(); // �� ���� ������ �ѱ����¶� �������� �����ϰų� ������ �����ϱ� ���� �Ѷ����� ���������� �����Ű�� ���������� �۵���
			while (sc.hasNext()) {
				// ���پ� ����ؼ� �������µ� �����ٿ� ���� ���� ������ ������ hasNext�� ���� ���� �ִ��� Ȯ���� true, false�� �ް�
				// nextLine���� ���� ������
				String line = sc.nextLine();
				// csv������ ,�� �������� ���� �Ǿ��־� �������� �߶� ����ؾ���
				// split���� �ڸ� ���� �迭���·� ������ ������ ���� �̾Ƽ� vo
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
