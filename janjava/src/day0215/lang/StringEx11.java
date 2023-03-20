package day0215.lang;

public class StringEx11 {
	public static void main(String[] args) {
		
		String str = "cat,dog,pig,tiger,horse";
		
		String[] animal = str.split(",");
		
		for(String an : animal) {
			System.out.println(an);
		}
		String str2 = String.join("/",animal);
		System.out.println(str2);
		
	}
}








