package javaproject;

import java.util.Scanner;

public class AdminService {
	
	private static AdminService instance = new AdminService();
	
	public static AdminService getInstance() {
		if(AdminService.instance == null) {
			AdminService.instance = new AdminService();
		}
		return AdminService.instance;
	}
	
	private AdminService() {
		
	}
	
	Scanner scanner = new Scanner(System.in);

	// 책 등록
	public void registerBook() {
		System.out.print("책 이름 입력 : ");
		String bookName = scanner.nextLine();
		
		Library.bookList.add(new Book(bookName));
	}
	
	//책 조회 (모두검색)
	public void selectBook() {
		System.out.println("번호\t제목\t대여회원\t대여한 날짜\t반납예정일\t연체확인");
		for(Book book : Library.bookList) {
			System.out.printf("%d\t%s\t",book.getBookNo(), book.getBookName());
			
			if(book.getRentMember() == null) {
				System.out.printf("없음\t");
			} else {
				System.out.printf("%s\t",book.getRentMember().getUsername());
			}
			
			if(book.getRentDay() == null) {
				System.out.printf("없음\t");
			} else {
				System.out.printf("");
			}
		}
	}
}













