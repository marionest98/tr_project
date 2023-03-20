package day0313.jdbc.bookstore;

import java.sql.*;
import java.util.*;

public class BookStoreService {
	BookStoreDao dao = new BookStoreDao();
	
	public void searchBook(Connection conn) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("책이름을 입력해주세요> ");
		String bookname = scanner.nextLine();		
		List<BookDTO> blist = dao.searchBook(conn, bookname);
		if (blist.size() == 0) {
			System.out.println("입력하신 책은 없습니다.");
		} else {
			System.out.println("책들 정보");
			for (BookDTO book : blist) {
				System.out.println(book);
			}
		}
		System.out.println("========END========");		
	}
	
	public void searchCustomer(Connection conn) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("고객이름을 입력해주세요> ");
		String name = scanner.next();		
		List<CustomerDTO> clist = dao.searchCustomer(conn, name);
		if (clist.size() == 0) {
			System.out.println("입력하신 고객은 없습니다.");
		} else {
			System.out.println("고객들 정보");
			for (CustomerDTO customer : clist) {
				System.out.println(customer);
			}
		}
		System.out.println("========END========");		
	}
	
	public void checkOrders(Connection conn) {
		List<OrderDTO> olist = dao.checkOrders(conn);
		System.out.println("전체 주문 정보");
		for (OrderDTO order : olist) {
			System.out.println(order);
		}
		System.out.println("========END========");
	}
	
	public void addBook(Connection conn) {
		int bookid = dao.getMBI(conn);
		Scanner scanner = new Scanner(System.in);		
		
		System.out.print("추가할 책이름> ");
		String bookname = scanner.nextLine();
		
		System.out.print("추가할 책출판사> ");
		String publisher = scanner.nextLine();
		
		System.out.print("추가할 책가격> ");
		int price = scanner.nextInt();
		
		BookDTO dto = new BookDTO(bookid, bookname, publisher, price);
		int i = dao.addBook(conn, dto);
		if(i != 0) {
			System.out.println(dto + " 추가 완료");
		}	
		
	}
	
	public void deleteBook(Connection conn) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("삭제할 책번호> ");
		int bookid = scanner.nextInt();
		BookDTO dto = new BookDTO(bookid, null, null, 0);
		int i = dao.deleteBook(conn, bookid);
		if(i != 0) {
			System.out.println(bookid+" 삭제 완료");
		}else {
			System.out.println("입력하신 책이 없습니다.");
		}		
	}	
}
