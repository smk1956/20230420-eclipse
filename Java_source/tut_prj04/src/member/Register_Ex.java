package member;

import member.model.Register;

public class Register_Ex {

	public static void main(String[] args) {
		Register[] member = new Register[5];
		member[0] = new Register();
		member[1] = new Register();
		member[2] = new Register();
		member[3] = new Register();
		member[4] = new Register();

		member[0].setUserid("korea");
		member[0].setPasswd("12345");
		member[0].setUsername("홍길동1");
		member[0].setBirth("2000.01.01");
		member[0].setGender("남자");
		member[0].setEmail("aaa@gmail.com");
		member[0].setTel("000-0000-0000");

		member[1].setUserid("korea1");
		member[1].setPasswd("12345");
		member[1].setUsername("홍길동2");
		member[1].setBirth("2000.02.02");
		member[1].setGender("남자");
		member[1].setEmail("bbb@gmail.com");
		member[1].setTel("111-1111-1111");

		member[2].setUserid("korea2");
		member[2].setPasswd("12345");
		member[2].setUsername("홍길동3");
		member[2].setBirth("2000.03.03");
		member[2].setGender("여자");
		member[2].setEmail("ccc@gmail.com");
		member[2].setTel("222-2222-2222");

		member[3].setUserid("korea3");
		member[3].setPasswd("12345");
		member[3].setUsername("홍길동3");
		member[3].setBirth("2000.03.03");
		member[3].setGender("남자");
		member[3].setEmail("ddd@gmail.com");
		member[3].setTel("333-3333-3333");

		member[4].setUserid("korea4");
		member[4].setPasswd("12345");
		member[4].setUsername("홍길동4");
		member[4].setBirth("2000.04.04");
		member[4].setGender("여자");
		member[4].setEmail("eee@gmail.com");
		member[4].setTel("010-0101-0101");

		for (Register r : member) {
			System.out.println("======================");
			System.out.println(r.disp());
		}
	}

}
