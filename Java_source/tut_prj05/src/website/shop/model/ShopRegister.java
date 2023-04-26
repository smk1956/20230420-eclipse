package website.shop.model;

import website.member.User;

public class ShopRegister extends User {
	// field(맴버변수)
	// 아이디, 비밀번호, 포인트

	private int point;

	// Constructor(생성자)
	public ShopRegister() {
	}

	// getter, setter

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	// method
	public String disp() {
		return "아이디 : " + super.userid + "\t비밀번호 : " + super.passwd + "\t 포인트 : " + this.point + "";
	}
}
