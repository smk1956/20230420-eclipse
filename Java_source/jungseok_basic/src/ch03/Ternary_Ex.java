package ch03;

public class Ternary_Ex {

	public static void main(String[] args) {
		// 조건 ? 참 : 거짓
		// 아이디 비밀번호 비교해서 참이면 마이페이지 : 로그인
		String db_userid = "koreait";
		String db_passwd = "12345";

		// form -> input
		String userid = "koreait";
		String passwd = "12345";
		// login
//		if (db_userid.equals(userid)) {
//			System.out.println("마이페이지로 이동합니다.");
//		} else {
//			System.out.println("아이디 또는 비밀번호가 틀렸습니다.\t다시 로그인 해 주세요.");
//		}

		String result = ((db_userid.equals(userid) && (db_passwd.equals(passwd)))) ? "마이페이지로 이동합니다."
				: "아이디 또는 비밀번호가 틀렸습니다.\n다시 로그인 해 주세요.";
		System.out.println(result);

		// true, false
		boolean isFlag = false; // 반전

		if (!isFlag)
			System.out.println(!isFlag);
		else
			System.out.println("");

		System.out.println((isFlag) ? !isFlag : "1");
	}
}
