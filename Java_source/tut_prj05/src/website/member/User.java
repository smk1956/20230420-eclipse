package website.member;

public class User {
	// protected : 같은 폴더에 있거나 나를 상속 받는 자식에게만 사용할 수 있게
	protected String userid;
	protected String passwd;

	public User() {
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

	public String disp() {
		return "";
	}
}
