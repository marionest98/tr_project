package day0310.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEX3 {
//customer테이블에 6, '손흥민', '영국 토트넘' '010-1111-1111' 입력
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
				try {
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/madang", "madang", "madang");
					stmt = conn.createStatement();					
					int x = stmt.executeUpdate("insert into customer values(6,'손흥민', '영국 토트넘','010-1111-1111')");	
					//insert or update문 = executeUpdate	
					if(x == 1) {						
						System.out.printf("입력 완료");
					}else {
						System.out.println("입력 실패");
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					if(stmt != null) {
						try {stmt.close();} catch (SQLException e) {}
					}
					if(conn != null) {
						try {conn.close();} catch (SQLException e) {}
					}					
				}
		
	}

}
