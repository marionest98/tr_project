package day0126.exercise;

public class Exercise4 {

	public static void main(String[] args) {
		//방정식 2x+4y=10의 모든 해를 구하시오
		//단 x,y는 정수이고 0~10사이의 값이다
		for(int x=0; x<=10; x++) {
			for(int y=0; y<=10; y++) {
				if(2*x + 4*y == 10) {
					System.out.printf("x=%d, y=%d \n",x,y);
				}
			}
		}

	}

}
