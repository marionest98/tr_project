package day0125.forex;

public class MultiForEx2 {
//자바 별 찍기
	public static void main(String[] args) {

		for (int i = 0; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
/*		******
		*****
		****
		***
		**
		*
*/
		//System.out.println("------");
		for (int i = 0; i <= 5; i++) {

			for (int j = 5; j >= 0; j--) {
				if (i >= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
/*		     *
 * 		    **
 *         ***
 *        ****
 *       *****
 *      ******   
 */
		for (int i = 0; i <= 5; i++) {
			
		}
	}//main

}//class
