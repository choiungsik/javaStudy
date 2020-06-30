package exam01;

import java.util.ArrayList;

public class arrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList객체 생성
		ArrayList<String> list = new ArrayList<String>();
		
		// 데이터 추가
		list.add("사과");
		list.add("포도");
		
		// 데이터 가져오기
		System.out.println(list.get(1));
		
		// 원하는 위치에 데이터 추가(기존에 있는 데이터는 다음 위치로 이동)
		list.add(1, "배");
		
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		// 요소의 길이 확인
		System.out.println("list의 길이 : "+list.size());
		
		// 데이터 삭제
		list.remove(0);
		System.out.println(list.get(0));
		
		// 데이터 전체 삭제
		list.clear();
		System.out.println(list.get(0));
	}

}
