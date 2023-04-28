package ch06;

class Tv {
	/*
	 * -필드- 색깔 빨강, 파랑, 초록 : String tv on, off : Boolean channel 12, 3, 4, 5, 6, 67,
	 * 7 : int
	 */
	String col;
	boolean pow; // false -> true : !pow
	int cha;

	public Tv() {
	}

	public Tv(String col) {
		this.col = col;
	}

	// Tv전원을 on, off 하는 동작
	public void pow() {

	}

	public void chaUp() {
		++cha;
	}

	public void chaDown() {
		--cha;
	}

}

public class Object_Ex01 {

	public static void main(String[] args) {
//		Tv t = new Tv();
//		Tv t1 = new Tv("red");
		Tv t2 = new Tv("blue");
//		Tv t3 = new Tv("green");

		t2.cha = 1;

		t2.chaUp();
		t2.chaUp();
		System.out.println("Tv 색상 : " + t2.col);
		System.out.println("현재 채널 : " + t2.cha);

	}
}
