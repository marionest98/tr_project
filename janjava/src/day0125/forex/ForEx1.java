package day0125.forex;

public class ForEx1 {

	public static void main(String[] args) {
		int summary = 0;
		
		for(int i = 1; i <= 100; i++) {
			summary = summary + i;
		}
		
		System.out.println(summary);
		
		
		int sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		
		System.out.println("1부터 5까지의 합 : " + sum);

	}

}
