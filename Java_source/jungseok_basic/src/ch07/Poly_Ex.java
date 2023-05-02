package ch07;

//class Parent{}
//
//class Child extends Parent {}
//
//class GrandChild extends Child {}

class TeamManager {
	public void disp() {
		System.out.println("내용은 마음대로");
	}

	public void login() {
		System.out.println("로그인");
	}
}

class Sawan extends TeamManager {

	@Override
	public void disp() {
		System.out.println("회원목록을 출력합니다");
	}

	@Override
	public void login() {
		System.out.println("로그인 프로그램을 실행합니다");
	}

}

public class Poly_Ex {

	public static void main(String[] args) {

		// 다형성이나 오버라이딩은 상속을 기반으로 유지, 관리를 편하게 하려고 사용
//		GrandChild gc = new GrandChild();
//		Child c = new GrandChild();
//		Parent p = new GrandChild();
//	
//		Child c1 = (Child) new Parent();

	}
}
