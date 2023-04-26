package member;

import java.util.Scanner;

import member.model.Member;

public class Member_Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean run = true;
		while (run) {
			System.out.println("===== 메뉴를 선택하세요 =====");
			System.out.println(" 1.회원가입 2.회원목록 3.종료");
			System.out.print("번호를 입력해 주세요 > ");

			int num = sc.nextInt();
			int count = sc.nextInt();

			switch (num) {

			case 1:

				System.out.println("회원가입을 진행합니다.");
				int count = sc.nextInt();
				Member[] reg = new Member[count];
				for (int i = 0; i < reg.length; ++i) {
					reg[i] = new Member();

					System.out.print("아이디 입력 : ");
					String uid = sc.next();
					reg[i].setUserid(uid);

					System.out.print("비밀번호 입력 : ");
					String pwd = sc.next();
					reg[i].setPasswd(pwd);

					System.out.print("이름 입력 : ");
					String un = sc.next();
					reg[i].setUsername(un);

					System.out.print("나이 입력 : ");
					String br = sc.next();
					reg[i].setBirth(br);

					System.out.print("급여 입력 : ");
					double mo = sc.nextDouble();
					reg[i].setMoney(mo);

				}

				break;

			case 2:
				System.out.println("회원목록을 불러옵니다.");
				System.out.println("");

				break;

			default:
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
			}
		}

	}

}
