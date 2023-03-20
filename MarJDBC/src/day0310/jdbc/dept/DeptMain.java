package day0310.jdbc.dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class DeptMain {

	private static Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/madang", "madang", "madang");
	}

	public static void main(String[] args) {
		// 모든 부서 조회
		Connection conn = null;
		try {
			conn = getConnection();

			DeptService service = new DeptService(); // DeptService의 메소드를 호출하기 위해 객체생성
			Scanner s = new Scanner(System.in);
			while (true) {
				System.out.println("메뉴를 선택하세요.");
				System.out.println("======================");
				System.out.println("1.모든 부서 정보 조회 2.특정 부서 조회 \n" + "3.부서 추가 4.부서명 수정 5.부서 삭제 6.부서명 검색");
				System.out.println("======================");
				int menu = s.nextInt();
				if (menu == 1) {
					service.deptAll(conn);
				} else if (menu == 2) {
					service.deptOne(conn);
				} else if (menu == 3) {
					service.addDept(conn);
				} else if (menu == 4) {
					service.updateDept(conn);
				} else if (menu == 5) {
					service.deleteDept(conn);
				} else if (menu == 6) {
					service.searchDept(conn);
				} else {
					System.out.println("프로그램 종료");
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
