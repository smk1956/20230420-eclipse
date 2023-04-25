package blog;

import blog.model.Blog;

public class Blog_Ex {

	public static void main(String[] args) {
		Blog member = new Blog();
		member.setEmailadr("aaa@gmail.com");
		member.setPasswd("12345");
		member.setName("이근호");
		member.setTitle("국비수업");
		member.setContect("java수업내용");
		member.setView(10);

		System.out.println(member.disp());
	}

}
