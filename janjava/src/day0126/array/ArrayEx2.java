package day0126.array;

public class ArrayEx2 {

	public static void main(String[] args) {

		int[] score = { 100, 98, 100, 88, 90 };
		
		int sum = 0;
		double avg = 0.0;
		
		for(int i : score) {
			sum += i;
		}
		avg = (double)sum/score.length;
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
	}

}
