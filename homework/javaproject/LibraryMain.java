package javaproject;

public class LibraryMain {

	public static void main(String[] args) {
		
		MemberService memberService = MemberService.getInstance();
		AdminService adminService = AdminService.getInstance();
		
		memberService.signUp();
		memberService.signUp();
		memberService.signUp();

		adminService.selectAllMembers();
		adminService.selectMembers();
		
	}

}
