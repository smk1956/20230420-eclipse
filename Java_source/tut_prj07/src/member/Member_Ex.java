package member;

import java.util.Scanner;

import member.model.Register;

public class Member_Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 배열을 이용하여 1명

		Register[] reg = new Register[2];
		// reg[0] = new Register();

		for (int i = 0; i < 2; ++i) {
			reg[i] = new Register(); // 객체
			reg[i].setUserid("Userid");
			reg[i].setPasswd("12345");
		}

	}

}
