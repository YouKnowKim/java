package javaproject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Library implements Serializable{

	public static List<Book> bookList = new ArrayList<Book>();
	public static List<Member> memberList = new ArrayList<Member>();
	
	// 최고 권한자 생성
	static {
		if(Library.memberList.isEmpty()) {
			Member admin = new Member(Admin.getUserNumber(), Admin.getUsername(), Admin.getPassword());
			Library.memberList.add(0, admin);
		}
	}
	
	//초기화
	public static void listInitialize() {
		if(Library.memberList.size() != 0 && Library.memberList != null) {
			int memListIndex = Library.memberList.size() - 1; 
			
			Member.setMemberNumbering(Library.memberList.get(memListIndex).getUserNumber());
		}
		
		if(Library.bookList.size() != 0 && Library.bookList != null) {
			int bookListIndex = Library.bookList.size() - 1;
			
			Book.setBookNumbering(Library.bookList.get(bookListIndex).getBookNo());
		}
		
	}
	
	
}
