package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

/*
 * 아이디 입력 : park
 * 이름 입력 : 박길동
 * 1개 행을 삽이하였습니다.
 */

public class InsertMain02 {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			// 1단계 : 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공.");
			
			// 2단계 DB접속 및 Connection 객체 얻기
			String url = "jdbc:oracle:thin:@192.168.217.202:1521/KOPODA";
			String user = "da2204";
			String password = "rladbsgh1";
			
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("conn : " + conn);
			
			System.out.print("아이디 입력 : ");
			String id = scanner.nextLine();
			
			System.out.print("이름 입력 : ");
			String name = scanner.nextLine();
			
			// 3단계 : sql 실행객체 얻어오기
			stmt = conn.createStatement();
			String sql = "insert into t_test(id, name) values('" + id + "', '" + name + "') ";
			
			// 4단계 : sql 실행 및 결과 얻어오기
			int cnt = stmt.executeUpdate(sql);
			System.out.println("총 " + cnt + "개 행이 삽입되었습니다.");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5단계 : 접속 종료
			if(stmt != null) {
				try {
					stmt.close();									
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}
}
