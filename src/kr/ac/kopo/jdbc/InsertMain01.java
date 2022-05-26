package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

// id : 'hong' name : '홍길동' 레코드 삽입

/*
 * 작업순서
 * 1. 드라이버 로딩
 * 2. DB 접속 및 Connection 얻어오기
 * 3. sql 실행 객체 얻어오기
 * 4. 쿼리 실행 및 결과 얻어오기
 * 5. 접속 종료
 */

public class InsertMain01 {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
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
			
			// 3단계 : sql 실행객체 얻어오기
			stmt = conn.createStatement();
			String sql = "insert into t_test(id, name) values('hong', '홍길동') ";
			
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
















