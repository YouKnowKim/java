package javaproject;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class AdminService {
	
	// singleton 
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
	public void selectAllBooks() {
		
		Calendar rentDay;
		Calendar returnDay;
		
		if(Library.bookList.size() != 0) {
			System.out.println("번호\t제목\t대여회원\t대여한날짜\t반납예정일\t연체확인");
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
					rentDay = book.getRentDay();
					int year = rentDay.get(Calendar.YEAR);
					int month = rentDay.get(Calendar.MONTH) + 1;
					int day = rentDay.get(Calendar.DAY_OF_MONTH);
					System.out.printf("%d년 %d월 %d일\t", year, month, day);
				}
				
				if(book.getReturnDay() == null) {
					System.out.printf("없음\t");
					System.out.printf("없음");
				} else {
					returnDay = book.getReturnDay();
					int year = returnDay.get(Calendar.YEAR);
					int month = returnDay.get(Calendar.MONTH) + 1;
					int day = returnDay.get(Calendar.DAY_OF_MONTH);
					System.out.printf("%d년 %d월 %d일\t", year, month, day);
					
					Calendar now = Calendar.getInstance();
					int nowYear = now.get(Calendar.YEAR);
					int nowMonth = now.get(Calendar.MONTH) + 1;
					int nowDay = now.get(Calendar.DAY_OF_MONTH); 
					int totalDay = (int)((returnDay.getTimeInMillis() - now.getTimeInMillis())/1000/60/60/24);
					if(totalDay*(-1) >= 1) {
						System.out.printf("%d일 연체", totalDay);
					} else {
						System.out.print("없음");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("책이 없습니다! 등록해주세요");
		}
		
	}
	
	//책 이름 검색
	public void selectBook() {
		
		System.out.print("검색할 제목 일부분 또는 전체를 입력해주세요.");
		String search = scanner.nextLine();
		Calendar rentDay;
		Calendar returnDay;
		List<Book> searchBook = new ArrayList<Book>();
		
		for(Book book : Library.bookList) {
			if(book.getBookName().indexOf(search) != -1) {
				searchBook.add(book);
			}
		}
		
		if(searchBook.size() != 0) {
			System.out.println("번호\t제목\t대여회원\t대여한날짜\t반납예정일\t연체확인");
			for(Book book : searchBook) {
				System.out.printf("%d\t%s\t",book.getBookNo(), book.getBookName());
				
				if(book.getRentMember() == null) {
					System.out.printf("없음\t");
				} else {
					System.out.printf("%s\t",book.getRentMember().getUsername());
				}
				
				if(book.getRentDay() == null) {
					System.out.printf("없음\t");
				} else {
					rentDay = book.getRentDay();
					int year = rentDay.get(Calendar.YEAR);
					int month = rentDay.get(Calendar.MONTH) + 1;
					int day = rentDay.get(Calendar.DAY_OF_MONTH);
					System.out.printf("%d년 %d월 %d일", year, month, day);
				}
				
				if(book.getReturnDay() == null) {
					System.out.printf("없음\t");
					System.out.printf("없음");
				} else {
					returnDay = book.getRentDay();
					int year = returnDay.get(Calendar.YEAR);
					int month = returnDay.get(Calendar.MONTH) + 1;
					int day = returnDay.get(Calendar.DAY_OF_MONTH);
					System.out.printf("%d년 %d월 %d일\t", year, month, day);
					
					Calendar now = Calendar.getInstance();
					int nowYear = now.get(Calendar.YEAR);
					int nowMonth = now.get(Calendar.MONTH) + 1;
					int nowDay = now.get(Calendar.DAY_OF_MONTH); 
					int totalDay = (int)((returnDay.getTimeInMillis() - now.getTimeInMillis())/1000/60/60/24);
					if(totalDay >= 1) {
						System.out.printf("%d일 연체", totalDay);
						System.out.println();
					} else {
						System.out.print("없음");
						System.out.println();
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("검색된 책이 없습니다!");
		}
	}
	
	// 책정보 수정
	public void updateBook() {
		
		boolean check = true;
		int updateBookNumber = -1;
		Book tempBook = null;
		int bookNo = 0;
		
		System.out.print("수정할 책 번호를 입력해주세요.");
		while(check) {
			updateBookNumber = Integer.parseInt(scanner.nextLine());
			for(int i=0; i<Library.bookList.size(); i++) {
				if(Library.bookList.get(i).getBookNo() == updateBookNumber) {
					bookNo = i;
					tempBook = Library.bookList.get(i);
					check = false;
				}
			}
			
			if(tempBook==null) {
				System.out.println("존재하는 책 번호를 입력해주세요.");
			}
		}
		
		System.out.print("수정될 책 제목을 입력해주세요.");
		String newBookName = scanner.nextLine();
		
		tempBook.setBookName(newBookName);
		Library.bookList.set(bookNo, tempBook);
		
	}
	
	//등록된 책 제거
	public void removeBook() {
		
		boolean check = true;
		int deleteBookNo = -1;
		
		System.out.print("제거할 책 번호를 입력하세요.");
		while(check) {
			deleteBookNo = Integer.parseInt(scanner.nextLine());
			for(int i=0; i<Library.bookList.size(); i++) {
				if(Library.bookList.get(i).getBookNo() == deleteBookNo) {
					if(Library.bookList.get(i).getRentMember() !=null) {
						System.out.println("대여중인 책입니다. 제거 불가");
						return;
					} else {
						Library.bookList.remove(i);
						check = false;
					}
					
				}
			}
			
			if(check) {
				System.out.print("존재하는 책 번호를 입력해주세요.");
			}
		}
	}
	
	// 모든 회원 리스트
	public void selectAllMembers() {
		if(Library.memberList.size()<=1) {
			System.out.println("회원이 없습니다!");
		} else {
			System.out.println("번호\t아이디\t비밀번호\t이름\t회원상태(0:대여가능 1:대여금지 2:탈퇴상태)");
			for(Member member : Library.memberList) {
				if(!member.getUsername().equals("root")) {				
					System.out.printf("%d\t%s\t%s\t%s\t%d\n",member.getUserNumber(), member.getUsername(), member.getPassword(), member.getName(), member.getMemberState());
				}
			}
		}
	}
	
	// username을 통한 회원 리스트
	public void selectMembers() {
		
		List<Member> searchMember = new ArrayList<Member>();
		
		System.out.print("검색할 회원 아이디를 입력해주세요. ");
		String tempUsername = scanner.nextLine();
		
		for(Member member : Library.memberList) {
			if(member.getUsername().indexOf(tempUsername) != -1) {
				searchMember.add(member);
			}
		}
		
		if(searchMember.size() == 0) {
			System.out.println("검색 회원이 없습니다.");
		} else {
			System.out.println("번호\t아이디\t비밀번호\t이름\t회원상태(0:대여가능 1:대여금지 2:탈퇴상태)");
			for(Member member : searchMember) {
				if(!member.getUsername().equals("root")) {				
					System.out.printf("%d\t%s\t%s\t%s\t%d\n",member.getUserNumber(), member.getUsername(), member.getPassword(), member.getName(), member.getMemberState());
				}
			}
		}
		
	}
	
	// 회원 상태 변경
	public void updateMemberState() {
		
		boolean check = true;
		int memberNo = -1;
		int memberState = -1;
		Member tempMember = new Member();
		int tempNo = -1;

		System.out.print("회원 번호를 입력해주세요. ");
		while(check) {
			memberNo = Integer.parseInt(scanner.nextLine());
			
			for(int i=0; i<Library.memberList.size(); i++) {
				if(Library.memberList.get(i).getUserNumber() == memberNo) {
					tempMember = Library.memberList.get(i);
					tempNo = i;
					check = false;
				}
			}
			
			if(check) {
				System.out.println("존재하는 회원 번호를 입력하세요.");
			}
			
		}
		
		System.out.print("1.대여가능\t2.대여금지\t3.탈퇴처리");
		memberState = Integer.parseInt(scanner.nextLine()) - 1;
		tempMember.setMemberState(memberState);
		
		Library.memberList.set(tempNo, tempMember);
		System.out.println("회원 상태 변경 완료");
	}
	
	
}













