package ch08;

import java.util.ArrayList;
import java.util.List;

public class Collection_Ex01 {

	public static void main(String[] args) {
		// 고정배열 : 참조타입 = Reference Type - 참조타입의 빈 값은 null
//		String[] str = new String[] { "Kim", "Lee", "Park", "Choi", "Jeong" };
//		System.out.println("전체 가입 회원 수 : " + str.length + "명");
//
//		str[2] = null;
//		str[3] = null;
//
//		for (String s : str) {
//			System.out.println(s);
//		}
//		// List배열 : 참조타입 = Reference Type - 참조 타입의 빈 값은 null
//		// 다형성 : Lsit (부모) 를 상속 받아서 ArrayList(자식)를 구현
//		// List<객체명> 변수명 = new ArrayList<객체명>(10);
//		// 100, 200
//		List<String> list = new ArrayList<>();
//		list.add("Kim");
//		list.add("Lee");
//		list.add("Park");
//		list.add("Choi");
//		list.add("Jeong");
//
//		list.remove("Park");
//		list.remove("Choi");
//
//		System.out.println("가입한 회원 수 : " + list.size() + "명");
//		for (String st : list) {
//			System.out.println(st);
//		}
//		System.out.println("------------------------------------");
//
//		// 12345입력
//		// 정수를 출력하는 List 배열
//
//		List<Integer> aList = new ArrayList<>();
//		// 배열이 비어 있는지 체크하기
//		// if(aList.size() == 0) {}
//		if (aList.size() == 0) {
//			System.out.println("가입된 회원이 없습니다.");
//
//		} else {
//			System.out.println("가입된 회원 수 : " + aList.size() + "명");
//
//		}
//
//		System.out.println("-----------------------------------------");
//
//		aList.add(100);
//		aList.add(200);
//		aList.add(300);
//		aList.add(400);
//
//		if (aList.isEmpty()) {
//			System.out.println("등록된 게시물이 없습니다.");
//		} else {
//			System.out.println("등록된 게시물 수 : " + aList.size() + "개");
//			System.out.println("---등록된 계시물 목록을 보여 줍니다.---");
//			for (Integer num : aList) {
//				System.out.println(num);
//			}
//		}

		// 회원가입(userid) - List
		// 아이디 저장 - 개수 출력 -> 목록 출력
		List<String> aList = new ArrayList<>();
		aList.add("KoreaIt");
		aList.add("BusanIt");
		aList.add("SeoulIt");

		aList.remove("SeoulIt"); // remove 하나의 객체만 지울때
//		aList.clear(); // clear 리스트목록을 다 지울때

		if (aList.size() == 0) { // = if(aList.isEmpty() ){}
			System.out.println("등록된 회원이 없습니다.");
		} else {
			System.out.println("등록된 회원 : " + aList.size() + "명");
			System.out.println("");
			System.out.println("-----------등록된 회원을 보여 줍니다----------");
			for (String str : aList) {
				System.out.println(str);
			}g
		}
	}
}
