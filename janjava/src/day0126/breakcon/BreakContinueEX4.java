package day0126.breakcon;

public class BreakContinueEX4 {

	public static void main(String[] args) {
		label:
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(j == 2) {
					//break label;
					continue label;
				}
				System.out.println(i + " " + j);
			}
		}

	}

}
