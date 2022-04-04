package javaproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library implements Serializable{

	// 이 두개의 리스트에 정보 저장
	public static List<Book> bookList = new ArrayList<Book>();
	public static List<Member> memberList = new ArrayList<Member>();
	
	// 최고 권한자 생성
	static {
		if(Library.memberList.isEmpty()) {
			Member admin = new Member(Admin.getUserNumber(), Admin.getUsername(), Admin.getPassword());
			Library.memberList.add(0, admin);
		}
	}
	
	//member, book numbering 초기화
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
	
	// Input Data Process
		public static void initializeLibrary() {
			
			FileInputStream fis = null;
			ObjectInputStream ois = null;
			
			try {
				
				File f = new File("C:/test/library.txt");
				if(f.exists()) {
					fis = new FileInputStream(f);
					ois = new ObjectInputStream(fis);
					
					HashMap<String, Object> map = (HashMap)ois.readObject();
					Object mapBookList = map.get("bookList");
					Library.bookList = (ArrayList)mapBookList;
					
					Object mapMemberList = map.get("memberList");
					Library.memberList = (ArrayList)mapMemberList;
					
				} else {
					System.out.println("처음 시작합니다.");
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if(ois != null) {
					try {
						ois.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
				
				if(fis != null) {
					try {
						fis.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
			}
			
		}
		
		// Output Data Process
		public static void saveLibrary() {
			
			FileOutputStream fos = null;
			ObjectOutputStream oos = null;
			
			String path = "C:/test";
			File dir = new File(path);
			
			if(!dir.exists()) {
				try {
					dir.mkdir();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			try {
				
				fos = new FileOutputStream("C:/test/library.txt");
				oos = new ObjectOutputStream(fos);
				
				Map<String, Object> data = new HashMap<String, Object>();
				data.put("memberList",Library.memberList);
				data.put("bookList",Library.bookList);
				
				oos.writeObject(data);
				
				System.out.println("저장 완료");
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if(oos != null) {
					try {
						oos.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
				
				if(fos != null) {
					try {
						fos.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
			}
		}
	
}
