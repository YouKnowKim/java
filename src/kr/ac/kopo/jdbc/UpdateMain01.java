package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;

public class UpdateMain01 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			
			conn = new ConnectionFactory().getConnection();
			conn.setAutoCommit(false);
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("검색할 아이디를 입력 : ");
			String id = scanner.nextLine();
			System.out.print("수정할 이름을 입력 : ");
			String name = scanner.nextLine();
			
			String sql = "update t_test set name = ? where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, id);
			
			int cnt = pstmt.executeUpdate();
			conn.commit();
			System.out.println(cnt + "행 수정완료");
			
			while(true);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(pstmt, conn);
		}
	}
}
