package javaproject;

public class LibraryMain {

	public static void main(String[] args) {
		
		MemberService memberService = MemberService.getInstance();
		memberService.signUp();
		memberService.logIn();
		System.out.println(LibrarySession.user.getUserNumber());
		memberService.unregister();
		memberService.logIn();

	}

}
