package day0310.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//6번 고객의 전화번호가 '010-0000-6666'으로 변경됨
//update customer set phone = '010-0000-6666' where custid = 6
public class JDBCEx4 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/madang", "madang", "madang");
			pstmt = conn.prepareStatement("update customer set phone = ? where custid = ?");
			pstmt.setString(1, "010-0000-6666");
			pstmt.setInt(2, 6);

			int x = pstmt.executeUpdate(); // 실행

			if (x == 1) {
				System.out.println("전화번호 변경");
			} else {
				System.out.println("없는 고객번호입니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}

	}

}
