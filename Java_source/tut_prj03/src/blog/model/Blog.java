package blog.model;

public class Blog {

	private String emailadr;
	private String passwd;
	private String name;
	private String title;
	private String contect;
	private int view;
	private int i;

	public String getEmailadr() {
		return emailadr;
	}

	public void setEmailadr(String emailadr) {
		this.emailadr = emailadr;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContect() {
		return contect;
	}

	public void setContect(String contect) {
		this.contect = contect;
	}

	public int getView() {
		return view;
	}

	public void setView(int view) {

		this.view = view;
	}

	public String disp() {
		return "이메일주소 : " + this.emailadr + "\n" + "비밀번호 : " + this.passwd + "\n" + "이름 : " + this.name + "\n"
				+ "블로그제목 : " + this.title + "\n" + "블로그내용 : " + this.contect + "\n" + "조회수 : " + this.view + "회";
	}

}
