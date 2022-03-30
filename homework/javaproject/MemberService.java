package javaproject;

import java.util.Scanner;

public class MemberService {
	
	private static MemberService instance = new MemberService();
	
	public static MemberService getInstance() {
		if(MemberService.instance == null) {
			MemberService.instance = new MemberService();
		}
		return MemberService.instance;
	}
	
	private MemberService() {
		
	}

	Scanner scanner = new Scanner(System.in);

	//회원가입
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
		String username=null;
		String password=null;
		String myPassword=null;
		int memberState=0;
		int myNumber=0;
		
		while(check) {
			System.out.print("아이디를 입력하세요. ");
			username = scanner.nextLine();
			for(Member member : Library.memberList) {
				if(member.getUsername().equals(username)) {
					check=false;
					myPassword = member.getPassword();
					myNumber = member.getUserNumber();
					memberState = member.getMemberState();
				}
			}
			if(memberState == 2) {
				System.out.println("탈퇴한 회원입니다.");
				return;
			}
			if(check) {
				System.out.println("존재하지 않는 아이디 입니다.");
			}
		}
		
		check = true;
		while(check) {
			System.out.print("비밀번호를 입력하세요.");
			password = scanner.nextLine();
			if(password.equals(myPassword)) {
				LibrarySession.user = new Member(myNumber);
				check = false;
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}
	}
	
	//로그아웃
	public void logOut() {
		LibrarySession.user = null;
		System.out.println("로그아웃 되었습니다.");
	}
	
	//회원탈퇴
	public void unregister() {
		Member tempMember;
		for(int i=0; i<Library.memberList.size(); i++) {
			if(LibrarySession.user.getUserNumber() == Library.memberList.get(i).getUserNumber()) {
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
				for(int i=0; i<Library.memberList.size(); i++) {
					if(Library.memberList.get(i).getUserNumber() == LibrarySession.user.getUserNumber()) {
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
}
