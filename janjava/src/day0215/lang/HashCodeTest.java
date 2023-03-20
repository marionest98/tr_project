package day0215.lang;

public class HashCodeTest {

	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		
		String str1 = "A";
		String str2 = new String("A");
		String str3 = "B";
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		System.out.println(System.identityHashCode(str1));//실제 주소값
		System.out.println(System.identityHashCode(str2));
	
	}

}
