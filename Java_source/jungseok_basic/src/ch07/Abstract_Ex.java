package ch07;

//상속 : abstract
//CRUD = 모든 프로그램에 기본 : 팀장이 사용하는 이름을 표준화 한다고 가정....
abstract class CRUD {
	abstract void create();

	abstract void read();

	abstract void update();

	abstract void delete();

}

//인사과 프로그램
class Insa_Pro extends CRUD {

	@Override
	void create() {
		System.out.println("인사과 회원가입을 진행합니다.");

	}

	@Override
	void read() {
		System.out.println("인사과 회원을 조회합니다.");

	}

	@Override
	void update() {
		System.out.println("인사과 회원정보를 수정합니다.");

	}

	@Override
	void delete() {
		System.out.println("인사과 회원정보를 삭제합니다.");

	}

}

//자재과 프로그램
class Jajae_Pro extends CRUD {

	@Override
	void create() {
		System.out.println("자재과 회원가입을 진행합니다.");

	}

	@Override
	void read() {
		System.out.println("자재과 회원을 조회합니다.");

	}

	@Override
	void update() {
		System.out.println("자재과 회원정보를 수정합니다.");

	}

	@Override
	void delete() {
		System.out.println("자재과 회원정보을 삭제합니다.");

	}

}

public class Abstract_Ex {

	public static void main(String[] args) {
		CRUD insa = new Insa_Pro();

		CRUD jajae = new Jajae_Pro();

		insa.create();
		jajae.create();

		insa.read();
		jajae.read();
	}
}
