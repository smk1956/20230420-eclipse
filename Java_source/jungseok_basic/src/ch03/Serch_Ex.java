package ch03;

public class Serch_Ex {

	public static void main(String[] args) {
		// 문자를 입력 : char A -> 숫자
		// 문자를 입력 : char Z -> 숫자

		// ASCII : American Standard Code for Information Interchange, 미국 정보 교환 표준 부호
//		char a = 'A';
//		System.out.println((int) a); // 65
//
//		char z = 'Z';
//		System.out.println((int) z); // 90
//
//		char a1 = 'a';
//		System.out.println((int) a1); // 97
//
//		char z2 = 'z';
//		System.out.println((int) z2); // 122
//
//		// if 논리연산자 && ||
//		// 글자 1
//		char ch = 'Z';
//		char c = 'A';
//		if ((c >= 'A' && c <= 'Z') || (ch >= 'a' && ch <= 'z')){
//			System.out.println("입력하신 문자는 영어입니다.");
//
//		}else {
//			System.out.println("입력하신 문자는 영어가 아닙니다.");
//		}

		// 문자 변수에 저장
		// 선택 변수
		// while -> switch -> if
//		Scanner sc = new Scanner(System.in);
//		System.out.print("메뉴선택 > ");
//		int sel = sc.nextInt();
//
//		boolean run = true;
//		while (run) {
//			switch (sel) {
//			case 1:
//				System.out.print("판독할 문자 입력 > ");
//				int num = sc.nextInt();
//				System.out.println("");
//				System.out.println("영어인지 확인합니다.");
//				if ((num >= 'A' && num <= 'Z') || (num >= 'a' && num <= 'z'))
//					System.out.println("입력하신 문자는 영어입니다.");
//				
//				else
//					System.out.println("입력하신 문자는 영어가 아닙니다.");
//					break;
//			default:
//				System.out.println("잘못입력 하셨습니다. \t시스템을 종료합니다.");
//				System.exit(0);
//				break;
//			}
//		}

//		Scanner sc = new Scanner(System.in);
//		System.out.print("메뉴선택 > ");
//		int sel = sc.nextInt();
//
//		boolean run = true;
//		while (run) {
//			switch (sel) {
//			case 1:
//				System.out.print("판독할 문자 입력 > ");
//				String word = sc.next();
//				char ch = word.charAt(0); // 띄어쓰기를 기준으로 첫글자만 가져오기
//
//				System.out.println("");
//				System.out.println("영어인지 확인합니다.");
//				System.out.println("");
//
//				if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
//					System.out.println("입력하신 문자는 영어입니다.");
//
//				else
//					System.out.println("입력하신 문자는 영어가 아닙니다.");
//				break;
//			default:
//				System.out.println("잘못입력 하셨습니다. \t시스템을 종료합니다.");
//				System.exit(0);
//				break;
//			}
//		}

		/*
		 * while(true, false){ switch(매개변수) { case 동작할변수: 명령어 break;
		 * 
		 * case 동작할변수: 명령어 break;
		 * 
		 * default : 명령어 break;
		 * 
		 * }
		 * 
		 * }
		 */

	}
}
