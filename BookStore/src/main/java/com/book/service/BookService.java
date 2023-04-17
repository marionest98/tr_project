package com.book.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.book.dao.BookDao;
import com.book.dto.Book;
import com.book.dto.Customer;


@Service
public class BookService {
	
	@Autowired
	BookDao dao;
	
	public List<Book> bookAll() {
		return dao.bookAll();
	};
	
	public List<Customer> customerAll() {
		return dao.customerAll();
	};
	
	public List<Map<String, Object>> searchOders(Date startdate, Date enddate) {
		HashMap<String, Date> dates = new HashMap<String, Date>();
		dates.put("startdate", startdate);
		dates.put("enddate", enddate);
		return dao.searchOders(dates);
	};
	
	public List<Map<String, Object>> searchOdersName(String name) {
		return dao.searchOdersName(name);
	};
	
	@Transactional
	public void addBook(Book b) {
		dao.addBook(b);
		//dao.addBook(b);
	}
}
