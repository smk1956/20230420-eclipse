package ch07;

class Company {
	String userid;
	String passwd;

	public void disp() {
		System.out.println("아이디 : " + userid + "\n비밀번호 : " + passwd + "");
	}

	public void divName() {
		System.out.println("부서이름 : ");
	}

}

//인사과 회원가입
class Insa extends Company {
	String insaCode;

	@Override
	public void disp() {
		System.out.println("인사과 아이디, 인사과 비밀번호");
	}

	@Override
	public void divName() {

	}

}

//자재과 회원가입
class Jajae extends Company {
	String jajaeCode;

	@Override
	public void disp() {
		System.out.println("자재과 아이디, 자재과 비밀번호");
	}

	@Override
	public void divName() {

	}

}

public class Field_Ex02 {

	public static void main(String[] args) {

	}
}
