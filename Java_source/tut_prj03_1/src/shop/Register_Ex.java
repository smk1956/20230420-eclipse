package shop;

public class Register_Ex {

	public static void main(String[] args) {
		// 회원가입 2명 가입(...)
		// 고정배열 + for(일반for, 향상된 for)

		// 1. 공간생성 : 데이터 타입 [] 배열명 = new 데이터타입[공간개수];
		// 2. 생성자 만들기 : 배열마다 생성자를 만들어 주기
		// 3. 값 입력 : setter를 이용해서 값을 저장하기
		// 4. for를 이용해서 출력 : disp()를 이용해서 출력하기

//		Register[] member = new Register[2];
//		member[0] = new Register();// Register.java 복사
//		member[1] = new Register();// Register.java 복사
//
//		member[0].setUserid("busnait");
//		member[0].setPasswd("12345");
//		member[0].setUsername("이근호");
//		member[0].setIntroduce("안녕하세요");
//
//		member[1].setUserid("seoulit");
//		member[1].setPasswd("12345");
//		member[1].setUsername("홍길동");
//		member[1].setIntroduce("안녕하세요");

		// 글자 길이는 length(), 배열길이는 length;
		// for(int i = 0; i < 배열길이; ++i) {출력내용} = 일반 for문
		for (int i = 0; i < member.length; ++i) {
			System.out.println("-----------------------");
			System.out.println(member[i].disp());
//		}
//
//		// for(출력값타입 변수명 : 배열명) {변수명으로 출력} = 향상된 for문
//		for (Register r : member) {
//			System.out.println("======================");
//			System.out.println(r.disp());
//		}

			// Login
//			Login login = new Login();
//			dbInfo db = new dbInfo();
//			login.setUserid("koreait");
//			login.setPasswd("1234");
//
//			if (login.getUserid().equals(db.db_userid) && login.getPasswd().equals(db.db_passwd)) {
//				System.out.println("사이드 메인으로 이동합니다");
//			} else {
//				System.out.println("다시 로그인 해 주세요.");
//			}

//		Register member1 = new Register();
//		member1.setUserid("koreait");
//		member1.setPasswd("12345");
//		member1.setUsername("이근호");
//		member1.setIntroduce("안녕하세요");
//		member1.getRegisterDate();
//
//		Register member2 = new Register();
//		member2.setUserid("seoulit");
//		member2.setPasswd("12345");
//		member2.setUsername("홍길동");
//		member2.setIntroduce("안녕하세요");
//		member2.getRegisterDate();
//
//		System.out.println(member1.disp());
//		System.out.println("");
//		System.out.println(member2.disp());
		}
	}
}
