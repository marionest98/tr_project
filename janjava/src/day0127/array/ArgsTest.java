package day0127.array;

public class ArgsTest {
	// main : 프로그램 시작점
	public static void main(String[] args) {
		// String[] args : 시작시 필요한 값이 있다면 전달받는 공간
		//				   값이 몇개 필요할지 모르기 때문에 배열을 사용함
		//				   값을 입력하지 않으면 빈배열이 생성된다
		// 인수, 인자, argument, 파라미터(전달받는 값)
		
		if(args.length == 0) {
			System.out.println("argument값이 없습니다.");
		}else {
			for(String s : args) {
				System.out.println(s);
			}
		}

	}

}
