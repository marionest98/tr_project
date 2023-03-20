package day0210.oop.interfaceex;

public class BookTest {

	public static void main(String[] args) {
		Book book1 = new Book("SQL Plus", 50000, 5.0);
		//Book book2 = new Book("Java 2.0", 40000, 3.0);
		//Book book3 = new Book("JSP Servlet", 60000, 6.0);
		
		Book[] books = { book1,
						new Book("java 2.0", 40000, 3.0),
						new Book("JSP Servlet", 60000, 6.0)
						};
		
		System.out.println("책이름\t\t"+"가격\t"+"할인율\t"+"할인후금액");
		System.out.println("--------------------------------------------");
		for(Book b : books) {
			System.out.println(b.getBookName()+"\t"+
								b.getBookPrice()+"\t"+
								b.getBookDiscountRate()+"%\t"+
								b.getDiscountRate()+"원");
			System.out.println(b);//참조변수 출력시 toString()호출
		}
	}
}
