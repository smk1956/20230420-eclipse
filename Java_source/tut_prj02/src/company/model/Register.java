package company.model;

public class Register {
	private String userid;
	private String passwd;
	private String name;
	private int grade;
	private String addr;
	private String tel;

	// 객체 초기화(생성자) : new 사용
	public Register() {
	}

	// 값 저장(setter), 값 출력(getter)
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	// 접근권한 : 1: Guest, 2,3,4 회원, 5: 관리자
	public void setGrade(int grade) {
		if (grade == 1) {
			System.out.println("Guest님 안녕하세요.");
		} else if (grade < 4 && grade >= 1) {
			System.out.println("***회원님 안녕하세요.");
		} else if (grade >= 5) {
			System.out.println("관리자 페이지로 이동합니다.");
		} else {
			System.out.println("정상적인 부여된 등급이아닙니다 \n관리자에게 문의하세요.");
		}
		this.grade = grade;

	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		if (tel.length() > 13) {
			System.out.println("잘못된 전화번호 형식입니다. \n확인하세요.");
			this.tel = "000-0000-0000";
		} else {
			this.tel = tel;
		}

	}

	// 출력 메소드 : disp()
	// 아이디, 비밀번호, 이름, 등급, 주소, 전화번호

	public String disp() {
		return "Userid : " + this.userid + "\n" + "Password : " + this.passwd + "\n" + "name : " + this.name + "\n"
				+ "Grade : " + this.grade + "\n" + "Addr : " + this.addr + "\n" + "Tel : " + this.tel;
	}

}
