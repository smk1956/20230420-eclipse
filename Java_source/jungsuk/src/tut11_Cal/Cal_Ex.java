package tut11_Cal;

import tut11_Cal.model.Calculator;

public class Cal_Ex {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setNum1(200);
		c.setNum2(-1);
		System.out.println(c.getNum1());
		System.out.println(c.getNum2());

		System.out.println(c.getNum1() * c.getNum2());

	}
}
