package scanner;

import java.util.Scanner;

public class Scanner_Ex {

	public static void main(String[] args) {
		// 출력타입 변수명 = new 출력타입();
		Register r = new Register(); // Register.java 복사
		Scanner sc = new Scanner(System.in);

		System.out.println("===== 코리리아IT 회원가입 =====");
		System.out.println("");

		System.out.print("아이디 입력 > ");
		String uid = sc.next();

		System.out.print("비밀번호 입력 > ");
		String pwd = sc.next();

		System.out.print("이름 입력 > ");
		String nm = sc.next();

		r.setUserid(uid);
		r.setPasswd(pwd);
		r.setUsername(nm);

		System.out.println("");
		System.out.println("===== 코리아IT 회원 목록 ======");
		System.out.println("");

		System.out.println("아이디 : " + r.getUserid());
		System.out.println("비밀번호 : " + r.getPasswd());
		System.out.println("이름 : " + r.getUsername());

		// 키보드를 통해 입력
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("정수를 입력하세요 : ");
//		int num = sc.nextInt();
//		System.out.println("입력하신 정수는 " + num + "입니다.");
//		System.out.println("");
//
//		System.out.print("Userid 입력 : ");
//		String userid = sc.next();
//		System.out.println("가입하신 아이디는 " + userid + "입니다.");
//		System.out.println("");
//
//		System.out.print("Salary 입력(급여는 소수점 1자리 까지 입력해 주세요.) : ");
//		double salary = sc.nextDouble();
//		System.out.println("***님이 수령하는 급여 : " + salary + "원.");

	}
}
