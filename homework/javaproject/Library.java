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
	
	
}
