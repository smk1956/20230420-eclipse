package ch07;

class Human {
	String username;
	int age;

	public void eat() {
		System.out.println("부모에서 출력되는 eat 메소드");
	}

	public void sleep() {
		System.out.println("부모에서 출력되는 sleep 메소드");
	}
}

class Students extends Human {
	String stdNum;

	@Override
	public void eat() {
		System.out.println("학생이 식사를 합니다.");
	}

	@Override
	public void sleep() {
		System.out.println("학생이 피곤해서 잠을 잡니다.");
	}

}

class Person extends Human {
	String psNum;

	@Override
	public void eat() {
		System.out.println("일반인이 식사를 합니다.");
	}

	@Override
	public void sleep() {
		System.out.println("일반인이 피곤해서 잠을 잡니다.");
	}

}

public class Human_Ex {

	public static void main(String[] args) {
//		Students std = new Students();
//		std.username = "홍길동";
//		std.age = 18;
//
//		System.out.println(std.username + " / " + std.age);
//		std.eat();
//		System.out.println("------------------------------");
//		Person p = new Person();
//		p.username = "일반인1";
//		p.age = 100;
//
//		System.out.println(p.username + " / " + p.age);
//		p.eat();
//		p.sleep();

		// 왼쪽에 부모를 적고 오른쪽에 출력할 생성자
		// 다향성
		Human h1 = new Students();
		Human h2 = new Person();

		h1.username = "홍길동1";
		h1.age = 18;
		System.out.println(h1.username + " / " + h1.age);
		h1.eat();
		h1.sleep();

		System.out.println("-------------------------------------");

		h2.username = "홍길동2";
		h2.age = 30;
		System.out.println(h2.username + " / " + h2.age);
		h2.eat();
		h2.sleep();

	}
}
