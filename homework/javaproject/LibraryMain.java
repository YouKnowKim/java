package javaproject;

import java.util.Scanner;

public class LibraryMain {

	// 파일 입출력으로 변환시 numbering에 문제가 생기므로 시작하자마자 바로 초기화 필요
	public static void main(String[] args) {
		
//		inMemory();
		saveFile();

	}

	
	public static void inMemory() {

		Scanner scanner = new Scanner(System.in);

		MemberService memberService = MemberService.getInstance();
		AdminService adminService = AdminService.getInstance();

		Library.listInitialize();

		while (true) {
			System.out.println("1.로그인\t2.회원가입\t0.종료");
			int chooseMain;
			try {
				chooseMain = Integer.parseInt(scanner.nextLine());
			}catch(Exception e) {
				System.out.println("선택지에서 골라주세요...");
				continue;
			}
			

			if (chooseMain == 1) {
				memberService.logIn();
				if (LibrarySession.user != null && LibrarySession.user.getUserNumber() == 0) {
					while (true) {
						System.out.println("1.회원관리\t2.도서관리\t3.로그아웃");
						int chooseAdmin;
						try {
							chooseAdmin = Integer.parseInt(scanner.nextLine());
						} catch (Exception e) {
							System.out.println("선택지에서 골라주세요...");
							continue;
						}
						if (chooseAdmin == 1) {
							while (true) {
								System.out.println("1.모든 회원 리스트\t2.회원 검색\t3.회원 상태 변경\t4.이전으로");
								int chooseMember;
								try {
									chooseMember = Integer.parseInt(scanner.nextLine());									
								}catch (Exception e) {
									System.out.println("선택지에서 골라주세요...");
									continue;
								}
								try {
									if (chooseMember == 1) {
										adminService.selectAllMembers();
									} else if (chooseMember == 2) {
										adminService.selectMembers();
									} else if (chooseMember == 3) {
										adminService.updateMemberState();
									} else {
										break;
									}
								} catch (Exception e) {
									System.out.println("선택지에서 골라주세요...");
									continue;
								}
								
							}

						} else if (chooseAdmin == 2) {
							while (true) {
								System.out.println("1.책 등록\t2.책 모두조회\t3.책 검색\t4.책 제목수정\t5.책 제거\t6.이전으로");
								int chooseBook;
								try {
									chooseBook = Integer.parseInt(scanner.nextLine());									
								} catch (Exception e) {
									System.out.println("선택지에서 골라주세요...");
									continue;
								}
								try {
									if (chooseBook == 1) {
										adminService.registerBook();
									} else if (chooseBook == 2) {
										adminService.selectAllBooks();
									} else if (chooseBook == 3) {
										adminService.selectBook();
									} else if (chooseBook == 4) {
										adminService.updateBook();
									} else if (chooseBook == 5) {
										adminService.removeBook();
									} else {
										break;
									}
								} catch (Exception e) {
									System.out.println("오류발생");
									continue;
								}
								
							}
						} else {
							memberService.logOut();
							break;
						}
					}
				} else if (LibrarySession.user != null) {
					while (true) {
						System.out.println("1.나의 도서관리\t2.나의 비밀번호변경\t3.로그아웃\t4.회원탈퇴");
						int chooseThree = Integer.parseInt(scanner.nextLine());
						if (chooseThree == 1) {
							while (true) {
								System.out.println("1.책 모두조회\t2.책 검색\t3.책 대여\t4.대여한 책리스트\t5.책 연장\t6.책 반납\t7.이전으로");
								int chooseMember;
								try {
									chooseMember = Integer.parseInt(scanner.nextLine());
								}catch(Exception e) {
									System.out.println("선택지에서 골라주세요...");
									continue;
								}
								try {
									if (chooseMember == 1) {
										memberService.selectAllBooks();
									} else if (chooseMember == 2) {
										memberService.selectBook();
									} else if (chooseMember == 3) {
										memberService.bookRental();
									} else if (chooseMember == 4) {
										memberService.myRentalBooks();
									} else if (chooseMember == 5) {
										memberService.extendDeadline();
									} else if (chooseMember == 6) {
										memberService.returnMybook();
									} else {
										break;
									}
								} catch (Exception e) {
									System.out.println("잘못된 선택입니다...");
									continue;
								}
								
							}
						} else if (chooseThree == 2) {
							memberService.changePassword();
							break;
						} else if (chooseThree == 3) {
							memberService.logOut();
							break;
						} else {
							memberService.unregister();
							break;
						}
					}

				}
			} else if (chooseMain == 2) {
				memberService.signUp();
			} else {
				System.out.println("프로그램 종료");
				return;
			}
		}
	}
	
	public static void saveFile() {
		Library.initializeLibrary(); // file io

		Scanner scanner = new Scanner(System.in);

		MemberService memberService = MemberService.getInstance();
		AdminService adminService = AdminService.getInstance();

		Library.listInitialize(); // file io

		while (true) {
			System.out.println("1.로그인\t2.회원가입\t0.종료");
			int chooseMain;
			try {
				chooseMain = Integer.parseInt(scanner.nextLine());
			}catch(Exception e) {
				System.out.println("선택지에서 골라주세요...");
				continue;
			}
			

			if (chooseMain == 1) {
				memberService.logIn();
				if (LibrarySession.user != null && LibrarySession.user.getUserNumber() == 0) {
					while (true) {
						System.out.println("1.회원관리\t2.도서관리\t3.로그아웃");
						int chooseAdmin;
						try {
							chooseAdmin = Integer.parseInt(scanner.nextLine());
						} catch (Exception e) {
							System.out.println("선택지에서 골라주세요...");
							continue;
						}
						if (chooseAdmin == 1) {
							while (true) {
								System.out.println("1.모든 회원 리스트\t2.회원 검색\t3.회원 상태 변경\t4.이전으로");
								int chooseMember;
								try {
									chooseMember = Integer.parseInt(scanner.nextLine());									
								}catch (Exception e) {
									System.out.println("선택지에서 골라주세요...");
									continue;
								}
								try {
									if (chooseMember == 1) {
										adminService.selectAllMembers();
									} else if (chooseMember == 2) {
										adminService.selectMembers();
									} else if (chooseMember == 3) {
										adminService.updateMemberState();
									} else {
										break;
									}
								} catch (Exception e) {
									System.out.println("선택지에서 골라주세요...");
									continue;
								}
								
							}

						} else if (chooseAdmin == 2) {
							while (true) {
								System.out.println("1.책 등록\t2.책 모두조회\t3.책 검색\t4.책 제목수정\t5.책 제거\t6.이전으로");
								int chooseBook;
								try {
									chooseBook = Integer.parseInt(scanner.nextLine());									
								} catch (Exception e) {
									System.out.println("선택지에서 골라주세요...");
									continue;
								}
								try {
									if (chooseBook == 1) {
										adminService.registerBook();
									} else if (chooseBook == 2) {
										adminService.selectAllBooks();
									} else if (chooseBook == 3) {
										adminService.selectBook();
									} else if (chooseBook == 4) {
										adminService.updateBook();
									} else if (chooseBook == 5) {
										adminService.removeBook();
									} else {
										break;
									}
								} catch (Exception e) {
									System.out.println("오류발생");
									continue;
								}
								
							}
						} else {
							memberService.logOut();
							break;
						}
					}
				} else if (LibrarySession.user != null) {
					while (true) {
						System.out.println("1.나의 도서관리\t2.나의 비밀번호변경\t3.로그아웃\t4.회원탈퇴");
						int chooseThree = Integer.parseInt(scanner.nextLine());
						if (chooseThree == 1) {
							while (true) {
								System.out.println("1.책 모두조회\t2.책 검색\t3.책 대여\t4.대여한 책리스트\t5.책 연장\t6.책 반납\t7.이전으로");
								int chooseMember;
								try {
									chooseMember = Integer.parseInt(scanner.nextLine());
								}catch(Exception e) {
									System.out.println("선택지에서 골라주세요...");
									continue;
								}
								try {
									if (chooseMember == 1) {
										memberService.selectAllBooks();
									} else if (chooseMember == 2) {
										memberService.selectBook();
									} else if (chooseMember == 3) {
										memberService.bookRental();
									} else if (chooseMember == 4) {
										memberService.myRentalBooks();
									} else if (chooseMember == 5) {
										memberService.extendDeadline();
									} else if (chooseMember == 6) {
										memberService.returnMybook();
									} else {
										break;
									}
								} catch (Exception e) {
									System.out.println("잘못된 선택입니다...");
									continue;
								}
								
							}
						} else if (chooseThree == 2) {
							memberService.changePassword();
							break;
						} else if (chooseThree == 3) {
							memberService.logOut();
							break;
						} else {
							memberService.unregister();
							break;
						}
					}

				}
			} else if (chooseMain == 2) {
				memberService.signUp();
			} else {
				System.out.println("프로그램 종료");
				Library.saveLibrary(); // file io
				return;
			}
		}
	}
}
