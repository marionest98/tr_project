package day0313.jdbc.bookstore;

import java.sql.*;
import java.util.*;

public class BookStoreMain {

	private static Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/madang", "madang", "madang");
	}

	public static void main(String[] args) {
		// 모든 부서 조회
		Connection conn = null;
		try {
			conn = getConnection();

			BookStoreService service = new BookStoreService(); // BookStoreService의 메소드를 호출하기 위해 객체생성
			Scanner s = new Scanner(System.in);
			while (true) {
				System.out.println("메뉴를 선택하세요.");
				System.out.println("======================");
				System.out.println("1.책 이름 검색 2.고객 이름 검색 \n" + "3.주문 내역 확인 4.책 추가 5.책 삭제 6.부서명 검색");
				System.out.println("======================");
				int menu = s.nextInt();
				if (menu == 1) {
					service.searchBook(conn);
				} else if (menu == 2) {
					service.searchCustomer(conn);
				} else if (menu == 3) {
					service.checkOrders(conn);
				} else if (menu == 4) {
					service.addBook(conn);
				} else if (menu == 5) {
					service.deleteBook(conn);
				} else if (menu == 6) {
					//service.searchDept(conn);
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