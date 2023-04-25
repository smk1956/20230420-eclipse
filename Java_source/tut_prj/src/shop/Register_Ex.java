package shop;

import shop.model.Register;

public class Register_Ex {

	public static void main(String[] args) {
		// Register.java 파일이 복사
		Register person = new Register("코리아 IT", "ver1.0", "010-010-0100");

		person.setUserid("koreit123");
		person.setPasswd("12345678");

		// Register.java 파일이 한장 더 복사
		Register person2 = new Register();
		person2.setUserid("Seoulit123");
		person2.setPasswd("123456789");

		Register person3 = new Register();
		person3.setUserid("Deaguit1234");
		person3.setPasswd("123456789");

		// 생성자는 객체 초기값을 지정하는\

		// 저장 : setter

		/* 아이디 */
//		person.setUserid("userid123");

		/* 비밀번호 */
//		person.setPasswd("12341234");

		// 출력 : getter
//		System.out.println("입력하신 아이디 : " + person.getUserid());
//		System.out.println(person.getPasswd());

		System.out.println(person.disp());
		System.out.println(person2.disp());
		System.out.println(person3.disp());

	}
}
