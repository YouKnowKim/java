package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import kr.ac.kopo.util.ConnectionCloud;

/*
 * 작업순서
 * 1. 드라이버 로딩
 * 2. DB접속 및 연결객체 얻어오기
 */
public class DBTestMain {
	
	public static void main(String[] args) {
		try {
			Connection conn = new ConnectionCloud().getConnection();
			System.out.println(conn);
			System.out.println(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}













