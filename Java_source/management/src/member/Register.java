package member;

public class Register {
	public static void main(String[] args) {

		// 인사과에서 만드는 사원관리 프로그램
		Member insa = new Member(); // 사용할 준비
		insa.userid = "busanit";
		insa.passwd = "12345";
		insa.age = 30;
		insa.salary = 10.00;

		disp("1", "인사과");
		System.out.println("아이디 : " + insa.userid);
		System.out.println("비밀번호 : " + insa.passwd);
		System.out.println("나이 : " + insa.age);
		System.out.println("급여 : " + insa.salary);

//		String insa_user = "busanit";
//		String insa_passwd = "12345";
//		int insa_age = 30;
//		double insa_salary = 10.00;

		System.out.println("");

		// 자재과에서 만드는 사원관리 프로그램
		Member jajae = new Member();
		jajae.userid = "Seoulit";
		jajae.passwd = "09876";
		jajae.age = 30;

		disp("2", "자재과");
		System.out.println("아이디 : " + jajae.userid);
		System.out.println("비밀번호 : " + jajae.passwd);
		System.out.println("나이 : " + jajae.age);

//		String jajae_user = "seoulit";
//		String jajae_passwd = "12345";
//		int jajae_age = 30;
//		double jajae_salary = 10.00;
	}

	public static void disp(String cnum, String buseo) {
		System.out.println(buseo + " 사원관리 프로그램 " + cnum);
	}
}
