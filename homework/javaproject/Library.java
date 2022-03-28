package javaproject;

import java.io.Serializable;
import java.util.List;

public class Library implements Serializable{

	private static List<Book> bookList;
	private static List<Member> memberList;
	
	public static List<Book> getBookList() {
		return bookList;
	}
	public static void setBookList(List<Book> bookList) {
		Library.bookList = bookList;
	}
	public static List<Member> getMemberList() {
		return memberList;
	}
	public static void setMemberList(List<Member> memberList) {
		Library.memberList = memberList;
	}
	
	
}
