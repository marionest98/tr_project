package com.book.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.book.dto.Book;
import com.book.dto.Customer;

@Mapper
public interface BookDao {
	
	@Select("select * from book order by bookid")
	public List<Book> bookAll();
	
	@Select("select * from customer order by custid")
	public List<Customer> customerAll();
	
	@Select("select name, bookname, orderdate, saleprice from orders inner join customer inner join book on customer.custid = orders.custid and book.bookid = orders.bookid where orderdate between #{startdate} and #{enddate}")
	public List<Map<String, Object>> searchOders(HashMap<String, Date> dates);
	
	@Select("select name, bookname, orderdate, saleprice  from orders inner join customer inner join book on customer.custid = orders.custid and book.bookid = orders.bookid where name like concat('%', #{name},'%')")
	public List<Map<String, Object>> searchOdersName(String name);
	
	@Insert("insert into book (bookid, bookname, publisher, price) values(#{bookid},#{bookname},#{publisher},#{price})")
	public int addBook(Book book);
}
