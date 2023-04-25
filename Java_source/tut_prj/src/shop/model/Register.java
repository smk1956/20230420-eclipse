package shop.model;

public class Register {
	private String userid;
	private String passwd;

	/* 생성자 */
	/* 생성자의 이름은 같고 매개 변수의 개수를 다르게 해서 표현하는 것을 생성자 오버로딩 */

	public Register() {
	}

	public Register(String title) {
		System.out.println("=== " + title + " 쇼핑몰 > 회원가입 페이지 ===");
	}

	public Register(String title, String version) {
		System.out.println("=== " + title + " 쇼핑몰 (" + version + ") > 회원가입 페이지 ===");
	}

	public Register(String title, String version, String tel) {
		System.out.println("=== " + title + " 쇼핑몰 (" + version + ") > 회원가입 페이지 [" + tel + "] ===");
	}

	/* getter, setter */

	public String getUserid() {
		return userid;
	}

	public void setUserid(String uid) {
		if (uid.equals("")) {
			System.out.println("아이디를 입력해 주세요.");
		} else { // 객체명.length(); : 배열 길이 값을 구할대
			// 짧게
			if (uid.length() < 8) {
				System.out.println("아이디 길이가 너무 짧습니다.\n아이디는 8자리 이상 12자리 이하로 입력해 주세요.");
				// 길게
			} else if (uid.length() > 12) {
				System.out.println("아이디 길이가 너무 깁니다.\n아이디는 8자리 이상 12자리 이하로 입력해 주세요.");
				// 알맞게
			} else
				System.out.println("사용하셔도 되는 아이디 입니다.");

		}
		this.userid = uid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String pwd) {
		if (!pwd.equals("") && pwd.length() >= 8) { // 빈값x : 입력 -> 8자리이상 : 정상
			System.out.println("사용하셔도 되는 비밀번호입니다. \n로그인 페이지로 이동합니다.");
		} else {
			System.out.println("아이디를 다시 입력해 주세요.");
		}
		this.passwd = pwd;
	}

	// method : 고통작업 또는 관리를 쉽게 하기 위해서(동작) = 유지/보수를 편하게 하기위해
	// 아이디 : userid
	// 비밀번호 : 12345

	public String disp() {
		return "아이디 : " + this.userid + " \n비밀번호 : " + this.passwd + "";
	}

}
