package day0310.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx2 {
//select * from book
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
		
		try {
			// 2. db접속 - connection - url, user, password
				Connection conn = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/madang", "madang", "madang");
			// 3. sql 문 실행
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("select * from book"); 
				//select문 = executeQuery
				while (rs.next()) {
					//int bookid = rs.getInt("bookid");
					String bookname = rs.getString("bookname");
					String publisher = rs.getString(3);
					int price = rs.getInt(4);
					
					System.out.printf("이름 :%s 출판사 :%s 가격 :%d\n",bookname,publisher,price);
				}
				
				rs.close();
				stmt.close();
				conn.close();
				
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
