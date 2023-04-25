package member.model;

import java.time.LocalDate;

public class Register {
	private String userid;
	private String passwd;
	private String username;
	private String birth;
	private String gender;
	private String email;
	private String tel;

	private LocalDate registerDate = LocalDate.now();

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public LocalDate getRegisterDate() {
		return registerDate;
	}

	public String disp() {
		return "아이디 : " + userid + "\n" + "비밀번호 : " + passwd + "\n" + "이름 : " + username + "\n" + "생년월일 : " + birth
				+ "\n" + "성별 : " + gender + "\n" + "이메일 : " + email + "\n" + "휴대전화 : " + tel + "\n" + "가입일 : "
				+ registerDate;
	}

}