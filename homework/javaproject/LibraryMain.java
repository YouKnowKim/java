package javaproject;

public class LibraryMain {

	public static void main(String[] args) {
		
		MemberService memberService = MemberService.getInstance();
		AdminService adminService = AdminService.getInstance();
		
		adminService.registerBook();
		adminService.registerBook();
		
		memberService.signUp();
		memberService.logIn();
		memberService.bookRental();
		memberService.bookRental();
		memberService.myRentalBooks();
		adminService.selectAllBooks();
		
	}

}
