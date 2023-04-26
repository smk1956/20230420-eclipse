package member;

import java.util.Scanner;

import member.model.Register;

public class Register_Ex {

	public static void main(String[] args) {
		// 3명 회원을 강닙하는 프로그램 : 배열(공간) -> new 빈 객체 -> for(setter) -> for(getter)
		Scanner sc = new Scanner(System.in);
		System.out.print("가입할 회원 수를 입력해 주세요 :");
		int count = sc.nextInt();

		System.out.println("");
		System.out.println("===== 코리리아IT 회원가입 =====");
		System.out.println("");
		Register[] reg = new Register[count];
		for (int i = 0; i < reg.length; ++i) {
			reg[i] = new Register();

			System.out.print("아이디 입력 : ");
			String uid = sc.next();
			reg[i].setUserid(uid);

			System.out.print("비밀번호 입력 : ");
			String pwd = sc.next();
			reg[i].setPasswd(pwd);

		}
		System.out.println("");
		System.out.println("===== 회원목록을 출력합니다 =====");
		for (Register r : reg) {
			System.out.println(r.disp());
		}
	}

}
