package website;

import website.groupware.model.GRPRegister;
import website.shop.model.ShopRegister;

public class Website_Ex {

	public static void main(String[] args) {
		// grp : 2명
		// shop : 3명
		// 출력타입[] 배열명 = new 출력타입[2]; // 메모리 공간 설정 : 빈 객체를 복사해 둠
		// 배열명[idx] = new 출력타입(); //메모리 공간에 빈 객체를 각각 복사

		GRPRegister[] grp = new GRPRegister[2];
		grp[0] = new GRPRegister(); // 생성자 : 빈 객체 파일이 1장 복사
		grp[1] = new GRPRegister(); // 생성자 : 빈 객체 파일이 2장 복사

		grp[0].setUserid("grp01");
		grp[0].setPasswd("12345");
		grp[0].setGid("koreait");

		grp[1].setUserid("grp02");
		grp[1].setPasswd("1234");
		grp[1].setGid("seoulit");

		ShopRegister[] shop = new ShopRegister[3];
		shop[0] = new ShopRegister(); // 생성자 : 빈 객체 파일이 1장 복사
		shop[1] = new ShopRegister(); // 생성자 : 빈 객체 파일이 2장 복사
		shop[2] = new ShopRegister(); // 생성자 : 빈 객체 파일이 3장 복사

		shop[0].setUserid("Mall01");
		shop[0].setPasswd("12345");
		shop[0].setPoint(1000);

		shop[1].setUserid("Mall02");
		shop[1].setPasswd("1234");
		shop[1].setPoint(2000);

		shop[2].setUserid("Mall03");
		shop[2].setPasswd("123456");
		shop[2].setPoint(3000);

		System.out.println("================for================");
		for (int i = 0; i < shop.length; ++i) {
//			System.out.println((i + 1) + "번 : " + shop[i].disp());
			System.out.println((shop.length - i) + "번 : " + shop[i].disp());
		}
		System.out.println("=========================================");

		for (int i = 0; i < grp.length; ++i) {
//			System.out.println((i + 1) + "번 회원정보 : " + grp[i].disp());
			System.out.println((grp.length - i) + "번 회원정보 : " + grp[i].disp()); // 역순으로 표시
		}

//		System.out.println("=============for   each=============");
//		for (ShopRegister s : shop) {
//			System.out.println(s.disp());
//		}
//
//		System.out.println("=============================================");
//
//		for (GRPRegister g : grp) {
//			System.out.println(g.disp());
//		}

	}

}
