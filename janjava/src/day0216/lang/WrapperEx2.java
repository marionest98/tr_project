package day0216.lang;
//String -> int
public class WrapperEx2 {
	public static void main(String[] args) {
		int i = new Integer("100").intValue();	//100
		int i2 = Integer.parseInt("100");//100
		Integer i3 = Integer.valueOf("100");//100
		
		int i4 = Integer.parseInt("100",2); // 숫자, 진수
		int i5 = Integer.parseInt("100",8);
		int i6 = Integer.parseInt("100",16);
		int i7 = Integer.parseInt("FF",16);
		
		System.out.println("\"100\",2 :"+i4);
		System.out.println("\"100\",8 :"+i5);
		System.out.println("\"100\",16 :"+i6);
		System.out.println("\"FF\",16 :"+i7);
	}
}
