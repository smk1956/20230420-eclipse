package scanner;

import java.util.Scanner;

public class Menu_Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean run = true;
		while (run) { // 무한반복 //프로그램 누가 언제 사용할 지 모르기에 계속 실행, System.exit(0);
			System.out.println("========== 코리아IT 그룹웨어 ==========");
			System.out.println("---------- 아래 메뉴를 선택하세요 ----------");
			System.out.println("1. 회원가입 2.회원조회 3.회원수정 4.회원삭제 5.종료");
			System.out.println("---------------------------------------");
			System.out.print("Enter your Select Number > ");
			int num = sc.nextInt();

			switch (num) {
			case 1:

				int count = sc.nextInt();
				System.out.println("회원가입을 진행합니다.");
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

					System.out.print("이름 입력 : ");
					String un = sc.next();
					reg[i].setUsername(un);

				}
				break;

			case 2:
				System.out.println("가입된 회원을 조회 합니다.");
				System.out.println("");
				break;

			case 3:
				System.out.println("회원수정을 수정합니다.");
				System.out.println("");
				break;

			case 4:
				System.out.println("회원삭제을 진행합니다.");
				System.out.println("");
				break;

			default:
				System.out.println("시스템을 종료합니다.");
				System.exit(0);

			}
		}

	}
}
