package day0127.array;

public class MultiArrayEx {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6}};
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
			
		}
		System.out.println();
		for(int[] iarray : arr) {
			for(int i : iarray) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
