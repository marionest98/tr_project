package day0125.forex;

public class ForEx3 {

	public static void main(String[] args) {
		// 0 ~ 10까지 합
		// 1 ~ 20까지 홀수의 합
		// 1 ~ 20까지 4의 배수의 합
		int s1 = 0;
		for (int i = 1; i <= 10; i++) {
			s1 += i;
		}
		System.out.println(s1);
		int s2 = 0;
		for (int i = 1; i <= 20; i += 2) {
			s2 += i;
		}
		System.out.println(s2);

		int s22 = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
				s22 += i;
			}
		}
		System.out.println(s22);

		int s3 = 0;
		for (int i = 4; i <= 20; i += 4) {
			s3 += i;
		}
		System.out.println(s3);

		int s33 = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 4 == 0) {
				s33 += i;
			}
		}
		System.out.println(s33);
	}

}
