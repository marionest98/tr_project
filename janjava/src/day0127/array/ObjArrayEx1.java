package day0127.array;

public class ObjArrayEx1 {

	public static void main(String[] args) {
		String[] sarr1 = new String[3];
		sarr1[0] = "java";
		sarr1[1] = "JSP";
		sarr1[2] = "Spring";
		
		for(String s : sarr1) {
			System.out.println(s);
		}
		
		String[] s1 = {"A", "B", "C"};
		String[] s2 = new String[] {"D", "E", "F"};
		
		for(String ss : s1) {
			System.out.println(ss);
		}

	}

}
