package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * 작업순서
 * 1. 드라이버 로딩
 * 2. DB접속 및 연결객체 얻어오기
 */
public class DBTestMain {
	
	public static void main(String[] args) {
		try {
			// 1단계 : 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 완료");
			
			String url = "jdbc:oracle:thin:@192.168.217.202:1521/KOPODA";
			String user = "da2204";
			String password = "rladbsgh1";
			
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB접속 성공 : " + conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}













