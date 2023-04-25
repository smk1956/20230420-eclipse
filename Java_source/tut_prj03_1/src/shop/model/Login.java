package shop.model;

public class Login {
	// 필드 : 실제 값이 저장되는곳
	// => 생성자를 이용해서 초기값을 지정 : 초기값은0, 1, 2,...
	private String companyName; // 회사이름
	private String ver; // version
	private String tel; // 전화번호
	private String userid; // 아이디
	private String passwd; // 비밀번호

	// 프로그램이 시작되면 처음 작업

	public Login() {
	} // default Constructor : 기본 생성자(필수)

	public Login(String companyName) {
		this.companyName = companyName;
	}

	public Login(String companyName, String ver) {
		this();
		this.ver = ver;
	}

	public Login(String companyName, String ver, String tel) {
		this();
		this.tel = tel;
	}

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

	public String getCompanyName() {
		return companyName;
	}

	public String getVer() {
		return ver;
	}

	public String getTel() {
		return tel;
	}

}
