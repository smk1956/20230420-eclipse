package member.model;

public class Member {
	private String userid;
	private String passwd;
	private String username;
	private String birth;
	private double money;

	public Member() {
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

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public String disp() {
		return "아이디 : " + userid + "\t비밀번호" + passwd + "\t이름" + username + "\t나이" + birth + "\t급여" + money;
	}
}
