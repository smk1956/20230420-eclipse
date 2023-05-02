package ch07;

class Members {
//	String userid;
//	String passwd;
//	int age;
//	String company;
//
//	public Members() {
//	}
//
//	public Members(String company) {
//		this.company = company;
//	}

	// 필드
	int num1;
	int num2;

	// 메소드
	public void add(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;

		System.out.println(this.num1 + this.num2);
	}
}

public class Field_Ex {

	public static void main(String[] args) {
//		Members member1 = new Members("코리아IT");
//		member1.userid = "koreait";
//		member1.passwd = "12345";
//		member1.age = 20;
//
//		System.out.println(member1.company);
//		System.out.println(member1.userid);
//		System.out.println(member1.passwd);
//		System.out.println(member1.age);
		Members m = new Members();
		m.add(10, 20);
	}
}
