package model;

public class Member { // 캡슐화
	//객체
	//1번. 필드
	private String userid;
	private String passwd;
	private int age;
	private double salary;
	

	
	//생성자 : 객체 초기화 - 처음 값으로 어떤 걸 설정할 건지..
	//사용해도 되고 않해도 되고
	//생성자 만드는 규칙
	//생성자 오버로딩
//	public Member() {} // 빈 값 생성자는 생략 가능
//	public Member(String str) {
//		System.out.println(str);
//	}
//	public Member(String uid, String pwd) {
//		System.out.println(uid + " / " + pwd);
//	}
	
	//getter(사용할 때), setter(저장할 때) -> private 있는 필드에 저장
	public String getUserid() {
		return userid;
	}
	public void setUserid(String uid) {
		//저장하기 전에 유효성 검사를 해보기
		if(uid.equals("")) {
			this.userid = "busanit";
//			System.out.println("아이디는 빈 값이 될 수 없습니다.");
	}else {
		System.out.println("사용하셔도 되는 아이디 입니다.");
		this.userid = uid; 
		/* 
		 * main에 입력한 userid를 객체페이지(this)의 필드에 아이디 값을 저장하시오.
		 * this.userid 객체 안에 있는 userid
		 * 그냥 userid new 에 저장 
		*/
	}
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}	
	// 객체 지향언어에서 보안 문제나 데이터 보호를 위한 캡슐화 때문에
	
}
