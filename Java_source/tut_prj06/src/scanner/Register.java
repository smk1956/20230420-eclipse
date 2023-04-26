package scanner;

public class Register {
	// 아이디, 비밀번호, 이름
	private String userid;
	private String passwd;
	private String username;

	public Register() {
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String disp() {
		return "";
	}

}
