package day0313.jdbc.bookstore;

import java.sql.*;
import java.util.*;

public class BookStoreDao {
	// 1.책이름검색
	// select * from book where bookname like ?
	public List<BookDTO> searchBook(Connection conn, String bookname) {
		List<BookDTO> blist = new ArrayList<>();
		String sql = "select * from book where bookname like ?";
		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, "%" + bookname + "%");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				BookDTO dto = new BookDTO();
				dto.setBookid(rs.getInt("bookid"));
				dto.setBookname(rs.getString("bookname"));
				dto.setPublisher(rs.getString("publisher"));
				dto.setPrice(rs.getInt("price"));
				blist.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return blist;
	}

	// 2.고객이름검색
	// select * from customer where name = ?
	public List<CustomerDTO> searchCustomer(Connection conn, String name) {
		List<CustomerDTO> clist = new ArrayList<>();
		String sql = "select * from customer where name like ?";
		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, "%" + name + "%");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				CustomerDTO dto = new CustomerDTO();
				dto.setCustid(rs.getInt("custid"));
				dto.setName(rs.getString("name"));
				dto.setAddress(rs.getString("address"));
				dto.setPhone(rs.getString("phone"));
				clist.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clist;
	}

	// 3.주문내역확인(주문번호, 고객명,책이름,주문일자)
	// select * from book b, customer c, orders o where b.bookid = o.bookid and
	// c.custid = o.custid;
	public List<OrderDTO> checkOrders(Connection conn) {
		List<OrderDTO> olist = new ArrayList<>();
		
		String sql = "select * from book b, customer c, orders o where b.bookid = o.bookid and c.custid = o.custid order by orderid";
		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				OrderDTO dto = new OrderDTO();
				dto.setOrderid(rs.getInt("orderid"));
				dto.setOrderdate(rs.getTimestamp("orderdate"));
				dto.setBookname(rs.getString("bookname"));
				dto.setName(rs.getString("name"));
				
				olist.add(dto);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return olist;
	}

	// 4.책추가
	//select max(bookid)+1 from book
	//insert into book values(?(bookid), ?(bookname), ?(publisher), ?(price))
	public int getMBI(Connection conn) {
		int i = 0;
		String sql = "select max(bookid)+1 from book";
		try (PreparedStatement pstmt = conn.prepareStatement(sql)){
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				i = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return i;
	}
	
	public int addBook(Connection conn, BookDTO dto) {
		int i = 0;
		String sql = "insert into book values(?,?,?,?)";
		try (PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setInt(1, dto.getBookid());
			pstmt.setString(2, dto.getBookname());
			pstmt.setString(3, dto.getPublisher());
			pstmt.setInt(4, dto.getPrice());
			i = pstmt.executeUpdate();		
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return i;
	}
	//delete from book where bookid = 54
	public int deleteBook(Connection conn, int bookid) {
		int i = 0;
		String sql = "delete from book where bookid = ?";
		try (PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setInt(1, bookid);
			i = pstmt.executeUpdate(); 
		} catch (SQLException e) {
			e.printStackTrace();
		}				
		return i;
	}
	
	
}
