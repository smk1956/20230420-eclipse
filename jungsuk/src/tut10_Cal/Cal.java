package tut10_Cal;
//다른 폴더에 있는 자바 파일 불러올 때는 import

import tut10_Cal.model.Calculator;

public class Cal {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		// ~안에 .(포인터)
		cal.disp("코리아아이티");
		System.out.println(cal.add(12, 3));
		System.out.println(cal.add(12, 3, 4));
		System.out.println(cal.sub(10, 7));
		System.out.println(cal.mul(3, 10, 6));
		System.out.println(cal.div(10, 2));

	}
}
