package day0127.array;

public class CharArrayEx {
	// char : 문자
	// char[] : 문자 여러개
	// String : 문자 여러개(문자열)
	public static void main(String[] args) {

		char[] carr = { 'A', 'B', 'C' };
		System.out.println(carr);//char[] == String 
								 //저장된 문자들을 하나의 문자열로 합쳐서 출력해준다.
		String s = "ABC";
		System.out.println(s);
		
		int[] iarr = {1,2,3,4};
		System.out.println(iarr);//배열 주소 출력 (타입@주소)

	}

}
