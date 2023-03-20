package day0125.exercise;
/**
 * 
 * @author soldesk
 * 클래스 설명....
 * Exrcise1입니다.
 */
public class Exercise1 {
	/**
	 * 
	 * @param args : 값을 받아옵니다.
	 * 각 자리수를 출력합니다.
	 */
	public static void main(String[] args) {
		int num = 365;
		int h = num / 100;//백의 자리 : 3
		
		num %= 100;//65
		int t = num / 10;//십의 자리 : 6 
		
		num %= 10;//5
		
		int o = num;//일의 자리 : 5
		System.out.println("백의 자리 : "+ h);
		System.out.println("십의 자리 : "+ t);
		System.out.println("일의 자리 : "+ o);

	}

}
