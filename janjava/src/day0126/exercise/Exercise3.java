package day0126.exercise;

public class Exercise3 {

	public static void main(String[] args) {
		//3. int num, 타입의 변수 이 있을 때 각 자리의 합을 더한 결과를 출력하는 코드를 작성하세요
		//예를 들어 int num = 12345;인 경우 1+2+3+4+5의 결과를 출력하면 됩니다.
		int num = 12345;
		int sum = 0;
		while(num > 0) {
			sum += num%10;
			num /= 10;
			if(num%10>=1) {
				System.out.print(num%10+"+");
			}else {
				System.out.print("=");
			}
		}
		System.out.println(sum);

	}

}
