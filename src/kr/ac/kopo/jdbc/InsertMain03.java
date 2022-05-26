package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertMain03 {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@192.168.217.202:1521/KOPODA";
			String user = "da2204";
			String password = "rladbsgh1";

			conn = DriverManager.getConnection(url, user, password);

			String id = "kim";
			String name = "김길동";

			String sql = "insert into t_test(id, name) values(?, ?) ";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, name);

			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행이 삽입되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
