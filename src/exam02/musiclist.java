package exam02;

import java.util.ArrayList;
import java.util.Scanner;

public class musiclist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<String> musiclist = new ArrayList<String>();

		int input = 0;
		int num = 0;
		while (input != 4) {
			System.out.print("[1]노래추가 [2]노래삭제 [3]노래조회 [4]종료 >> ");
			input = scan.nextInt();
			if (input == 1) {
				musicAdd(scan, musiclist);
			}
			if (input == 2) {
				musicRemove(scan, musiclist);
			}
			if (input == 3) {
				musicList(musiclist);
			}
			System.out.println("=========================");
		}
		System.out.println("프로그램 종료");
	}

	private static void musicList(ArrayList<String> musiclist) {
		int num;
		num = 0;
		System.out.println("====== 현재 재생 목록 =======");
		if (musiclist.size() == 0) {
			System.out.println("재생 목록이 없습니다.");
		} else {
			for (String i : musiclist) {
				num++;
				System.out.println(num + "." + i);
			}
		}
	}

	private static void musicRemove(Scanner scan, ArrayList<String> musiclist) {
		int num;
		System.out.print("[1]선택삭제 [2]전체삭제 >> ");
		int input1 = scan.nextInt();
		num = 0;
		if (input1 == 1) {
			System.out.println("====== 현재 재생 목록 =======");
			if (musiclist.size() == 0) {
				System.out.println("재생 목록이 없습니다.");
			} else {
				for (String i : musiclist) {
					num++;
					System.out.println(num + "." + i);
				}
				System.out.print("제거할 노래선택 >> ");
				int n = scan.nextInt();
				musiclist.remove(n - 1);
				System.out.println("노래가 삭제되었습니다.");
			}
		} else if (input1 == 2) {
			musiclist.clear();
			System.out.println("모든 노래가 삭제되었습니다.");
		}
	}

	private static void musicAdd(Scanner scan, ArrayList<String> musiclist) {
		System.out.print("[1]마지막 위치에 추가 [2]원하는 위치에 추가 >> ");
		int input1 = scan.nextInt();
		if (input1 == 1) {
			System.out.print("추가할 노래를 입력하세요 >> ");
			String mu = scan.next();
			musiclist.add(mu);
		} else {
			System.out.print("원하는 위치를 입력하세요 >> ");
			int n = scan.nextInt();
			System.out.print("추가할 노래를 입력하세요 >> ");
			String mu = scan.next();
			musiclist.add(n + 1, mu);
		}
		System.out.println("노래추가가 완료되었습니다.");
	}

}
