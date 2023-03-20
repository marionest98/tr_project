package day0215.lang;

public class StringEx14 {
	public static void main(String[] args) {
		String sObj = "Hello";//Hello(x10)
		setValue(sObj);
		System.out.println(sObj);//Hello(x10)
	}
	
	private static void setValue(String str) {
		str.replace("H", "h");//hello(x101)
		str += " World"; // Hello(x10) + World(x11) = Hello World(x20)
		System.out.println(str);//Hello World(x20)
	}
}
