package ch06;

class Order {

	String orderID; // 주문번호
	String custommerName; // 고객명
	String productCode; // 상품코드
	String productName; // 상품명
	int productPrice;// 상품가격
	int productCount; // 상품 수량
	String addr; // 배송지
	boolean isMember; // 회원인지 아닌지
	String title;
	String url;

	public Order() {
	}

	public Order(String title) {
		this.title = title;
	}

	public Order(String title, String url) {
		this.title = title;
		this.url = url;
	}

	// 주문 상품 내용 출력
	public void disp() {
		System.out.println("---------------------------------");
		System.out.println(title + " - " + url);
		System.out.println("---------------------------------");
		System.out.println("주문번호 : " + orderID);
		System.out.println("고객명 : " + custommerName);
		System.out.println("상품코드 : " + productCode);
		System.out.println("상품명 : " + productName);
		System.out.println("상품가격 : " + productPrice);
		System.out.println("상품수량 : " + productCount + "개");
		System.out.println("배송지 : " + addr);
		System.out.println("회원여부 : " + isMember);
		System.out.println("---------------------------------------");

	}

}

public class ObjectOrder_Ex03 {

	public static void main(String[] args) {
		Order o = new Order("상품주문시스템", "https://oder.koreait.com");
		o.orderID = "K20230428";
		o.custommerName = "코리아IT";
		o.productCode = "020230428";
		o.productName = "Java의 정석 기초편";
		o.productPrice = 25000;
		o.productCount = 3;
		o.addr = "부산광역시";
		o.isMember = false;

		// 출력
		o.disp();

	}
}
