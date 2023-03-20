package day0126.array;

import java.util.Arrays;

public class ArrayEx4 {

	public static void main(String[] args) {
		int[] nums = new int[10];

		for (int i = 0; i < 10; i++) {
			nums[i] = i;
		}
		System.out.println(Arrays.toString(nums));

		for (int i = 0; i < 100; i++) {
			int r = (int) (Math.random() * 10);// 0~9
			int temp = nums[0];
			nums[0] = nums[r];
			nums[r] = temp;
		}
		System.out.println(Arrays.toString(nums));

		int[] nums1 = new int[45];
		for (int i = 1; i <= 45; i++) {
			nums1[i - 1] = i;
		}
		System.out.println(Arrays.toString(nums1));
		for (int i = 0; i < 100; i++) {
			int r = (int) (Math.random() * 45);// 0~44 총 45개
			int temp = nums1[0];
			nums1[0] = nums1[r];
			nums1[r] = temp;
		}
		System.out.println(Arrays.toString(nums1));
		for (int j = 0; j < 6; j++) {
			System.out.print(nums1[j] + " ");
		}
	
	}

}
