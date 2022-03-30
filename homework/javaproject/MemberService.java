package javaproject;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class MemberService {

	private static MemberService instance = new MemberService();

	public static MemberService getInstance() {
		if (MemberService.instance == null) {
			MemberService.instance = new MemberService();
		}
		return MemberService.instance;
	}

	private MemberService() {

	}

	Scanner scanner = new Scanner(System.in);

	// 회원가입
	public void signUp() {

		boolean check = true;
		String username = "";
		String password = "";
		String name = "";

		while (check) {
			System.out.print("(이메일주소)아이디 입력 : ");
			username = scanner.nextLine();

			for (Member member : Library.memberList) {
				if (member.getUsername().equals(username)) {
					System.out.println("중복된 아이디 입니다. 다른 아이디 입력 필요");
					break;
				}
			}
			check = false;
		}

		check = true;
		while (check) {
			System.out.print("비밀번호 입력 : ");
			password = scanner.nextLine();
			System.out.print("비밀번호 확인 : ");
			String checkPassword = scanner.nextLine();

			if (password.equals(checkPassword)) {
				check = false;
			} else {
				System.out.println("비밀번호가 같지 않습니다. 다시 입력하세요");
			}
		}

		System.out.print("이름 입력 : ");
		name = scanner.nextLine();

		Library.memberList.add(new Member(username, password, name));

	}

	// 로그인
	public void logIn() {
		boolean check = true;
		String username = null;
		String password = null;
		String myPassword = null;
		int memberState = 0;
		int myNumber = 0;

		while (check) {
			System.out.print("아이디를 입력하세요. ");
			username = scanner.nextLine();
			for (Member member : Library.memberList) {
				if (member.getUsername().equals(username)) {
					check = false;
					myPassword = member.getPassword();
					myNumber = member.getUserNumber();
					memberState = member.getMemberState();
				}
			}
			if (memberState == 2) {
				System.out.println("탈퇴한 회원입니다.");
				return;
			}
			if (check) {
				System.out.println("존재하지 않는 아이디 입니다.");
			}
		}

		check = true;
		while (check) {
			System.out.print("비밀번호를 입력하세요.");
			password = scanner.nextLine();
			if (password.equals(myPassword)) {
				LibrarySession.user = new Member(myNumber);
				check = false;
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}
	}

	// 로그아웃
	public void logOut() {
		LibrarySession.user = null;
		System.out.println("로그아웃 되었습니다.");
	}

	// 회원탈퇴
	public void unregister() {
		Member tempMember;
		for (int i = 0; i < Library.memberList.size(); i++) {
			if (LibrarySession.user.getUserNumber() == Library.memberList.get(i).getUserNumber()) {
				tempMember = Library.memberList.get(i);
				tempMember.setMemberState(2);
				Library.memberList.set(i, tempMember);
				logOut();
				System.out.println("회원 탈퇴 완료");
			}
		}
	}

	// 비밀번호 변경
	public void changePassword() {

		boolean check = true;
		String password = null;
		Member tempMember;

		check = true;
		while (check) {
			System.out.print("새로운 비밀번호 입력 : ");
			password = scanner.nextLine();
			System.out.print("비밀번호 확인 : ");
			String checkPassword = scanner.nextLine();

			if (password.equals(checkPassword)) {
				for (int i = 0; i < Library.memberList.size(); i++) {
					if (Library.memberList.get(i).getUserNumber() == LibrarySession.user.getUserNumber()) {
						tempMember = Library.memberList.get(i);
						tempMember.setPassword(checkPassword);
						Library.memberList.set(i, tempMember);
					}
				}
				System.out.println("다시 로그인 하세요");
				logOut();
				check = false;
			} else {
				System.out.println("비밀번호가 같지 않습니다. 다시 입력하세요");
			}
		}

	}

	// 책 조회 (모두검색)
	public void selectAllBooks() {

		Calendar rentDay;
		Calendar returnDay;

		if (Library.bookList.size() != 0) {
			System.out.println("번호\t제목\t대여한날짜\t반납예정일\t연체확인");
			for (Book book : Library.bookList) {
				System.out.printf("%d\t%s\t", book.getBookNo(), book.getBookName());

				if (book.getRentDay() == null) {
					System.out.printf("없음\t");
				} else {
					rentDay = book.getRentDay();
					int year = rentDay.get(Calendar.YEAR);
					int month = rentDay.get(Calendar.MONTH) + 1;
					int day = rentDay.get(Calendar.DAY_OF_MONTH);
					System.out.printf("%d년 %d월 %d일", year, month, day);
				}

				if (book.getReturnDay() == null) {
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
					int totalDay = (int) ((returnDay.getTimeInMillis() - now.getTimeInMillis()) / 1000 / 60 / 60 / 24);
					if (totalDay >= 1) {
						System.out.printf("%d일 연체", totalDay);
					} else {
						System.out.print("없음");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("책이 없습니다!");
		}

	}

	// 책 이름 검색
	public void selectBook() {

		System.out.print("검색할 제목 일부분 또는 전체를 입력해주세요.");
		String search = scanner.nextLine();
		Calendar rentDay;
		Calendar returnDay;
		List<Book> searchBook = new ArrayList<Book>();

		for (Book book : Library.bookList) {
			if (book.getBookName().indexOf(search) != -1) {
				searchBook.add(book);
			}
		}

		if (searchBook.size() != 0) {
			System.out.println("번호\t제목\t대여한날짜\t반납예정일\t연체확인");
			for (Book book : searchBook) {
				System.out.printf("%d\t%s\t", book.getBookNo(), book.getBookName());

				if (book.getRentDay() == null) {
					System.out.printf("없음\t");
				} else {
					rentDay = book.getRentDay();
					int year = rentDay.get(Calendar.YEAR);
					int month = rentDay.get(Calendar.MONTH) + 1;
					int day = rentDay.get(Calendar.DAY_OF_MONTH);
					System.out.printf("%d년 %d월 %d일", year, month, day);
				}

				if (book.getReturnDay() == null) {
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
					int totalDay = (int) ((returnDay.getTimeInMillis() - now.getTimeInMillis()) / 1000 / 60 / 60 / 24);
					if (totalDay >= 1) {
						System.out.printf("%d일 연체", totalDay);
					} else {
						System.out.print("없음");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("검색된 책이 없습니다!");
		}
	}
	
	//책 대여하기 (1. 책이 존재하는지 확인 2. 나의memberState확인 3. 대여중인지 확인)
	public void bookRental() {
		
		int bookNo = -1;
		boolean check = true;
		int tempNo = -1;
		Member rentMember = new Member();
		
		System.out.print("대여할 책 번호를 입력해주세요. ");
		while(check) {
			bookNo = Integer.parseInt(scanner.nextLine());
			for(int i =0; i<Library.bookList.size(); i++) {
				if(Library.bookList.get(i).getBookNo() == bookNo) {
					tempNo = i;
					check = false;
				}
			}
			if(check) {
				System.out.println("적절한 책 번호를 입력해주세요.");
			}
			
		}
		
		for(Member member : Library.memberList) {
			if(member.getUserNumber() == LibrarySession.user.getUserNumber()) {
				rentMember = member;
			}
		}
		
		if(rentMember.getMemberState() == 1) {
			System.out.println("대여정지 회원입니다. ");
			return;
		}
		
		if(Library.bookList.get(tempNo).getRentMember() == null) {
			Book book = Library.bookList.get(tempNo);
			book.setRentMember(rentMember);
			
			Calendar now = Calendar.getInstance();
			book.setRentDay(now);
			
			Calendar returnDay = Calendar.getInstance();
			returnDay.setTimeInMillis(now.getTimeInMillis() + 7*24*60*60*1000);
			book.setReturnDay(returnDay);
			
			Library.bookList.set(tempNo, book);
			
			for(int i=0; i<Library.memberList.size(); i++) {
				if(Library.memberList.get(i).getUserNumber() == LibrarySession.user.getUserNumber()) {
					List<Book> tempBookList = new ArrayList<Book>();
					if(rentMember.getRentList() == null) {
						tempBookList.add(book);
					} else {
						tempBookList = rentMember.getRentList();
						tempBookList.add(book);
					}
					
					rentMember.setRentList(tempBookList);
					Library.memberList.set(i, rentMember);
					System.out.println("대여가 완료되었습니다.");
				}
			}
		} else {
			System.out.println("다른 회원이 대여중인 책입니다.");
		}
		
		
	}
	
	// 대여한 책 리스트 (책 리스트 번호로 Library에 있는 책 정보를 가져와서 보여주어야함 어쨋든 수정 필요)
	public void myRentalBooks() {
		Member tempMember = new Member();
		
		for(Member member : Library.memberList) {
			if(member.getUserNumber() == LibrarySession.user.getUserNumber()) {
				tempMember = member;
			}
		}
		
		if(tempMember.getRentList() == null) {
			System.out.println("대여한 책이 없습니다");
			return;
		} else {
			for(Book book : tempMember.getRentList()) {
				System.out.println(book.toString());
			}
		}
	}
	
	//책 반납하기
	public void returnMybook() {
		
	}
	
	//책 연장하기 (1번만)
	public void extendDeadline() {
		
	}
}






















