package company;

import company.model.Register;

public class Register_Ex {

	public static void main(String[] args) {
		Register member1 = new Register();
		member1.setUserid("KoreaIt");
		member1.setPasswd("12345");
		member1.setName("이근호");
		member1.setGrade(5);
		member1.setAddr("부산광역시");
		member1.setTel("000-0000-0000");

		Register member2 = new Register();
		member2.setUserid("SeoulIt");
		member2.setPasswd("12345");
		member2.setName("홍길동");
		member2.setGrade(3);
		member2.setAddr("서울특별시");
		member2.setTel("000-0000-0000");

		Register member3 = new Register();
		member3.setUserid("DeaguIt");
		member3.setPasswd("12345");
		member3.setName("김아무개");
		member3.setGrade(1);
		member3.setAddr("대구광역시");
		member3.setTel("000-0000-0000");

		System.out.println(member1.disp());
		System.out.println("");
		System.out.println(member2.disp());
		System.out.println("");
		System.out.println(member3.disp());

	}
}
