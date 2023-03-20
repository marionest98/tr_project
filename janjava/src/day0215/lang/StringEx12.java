package day0215.lang;

public class StringEx12 {

	public static void main(String[] args) {
		String str = "abcdefg/hijklmn/opqrstu/vwxyz";
		
		String[] eng = str.split("/");
		
		for(String en : eng) {
			System.out.println(en.substring(0, 1).toUpperCase()+en.substring(1));
		}		
	
//		예상 결과
//		Abcdefg
//		Hijklmn
//		Opqrstu
//		Vwxyz

	}

}
