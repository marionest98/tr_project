package day0313.jdbc.bookstore;

import java.util.Date;

public class OrderDTO {
	
	private int orderid;
	private Date orderdate;  
	private String bookname;
	private String name;
	public OrderDTO() {
	}
	public OrderDTO(int orderid, Date orderdate, String bname, String name) {
		this.orderid = orderid;
		this.orderdate = orderdate;
		this.bookname = bookname;
		this.name = name;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public Date getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bname) {
		this.bookname = bname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "OrderDTO [orderid=" + orderid + ", orderdate=" + orderdate + ", bookname=" + bookname + ", name=" + name
				+ "]";
	}

	
	
}
