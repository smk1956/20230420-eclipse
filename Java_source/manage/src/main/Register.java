package main;

import model.Member;
//같은 폴더에 없으면 import 패키지명
public class Register {
	public static void main(String[] args) {
//		new Member(); 생성자를 만드는 코드 : 초기화 작업
		Member insa = new Member();//빈값으로 초기화
//		Member insa1 = new Member("Busanit Academy");//아이디만 넣고 초기화
//		Member insa2 = new Member("Busanit Academy", "12345");//아이디 비밀번호만 넣고 초기화
//		Member insa3 = new Member();//아이디 비밀번호 나이 넣고 초기화
//		Member insa4= new Member();//아이디 비밀번호 나이 급여 넣고 초기화
		insa.setUserid("");
		System.out.println(insa.getUserid());
	}
}
