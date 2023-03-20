package day0120.operator;

public class OperatorEx1 {
    //부호 연산자 + / - 변수
	public static void main(String[] args) {
		int num = -10;
		
		System.out.println(+num);
		System.out.println(-num);//부호를 바꿔준다.
		System.out.println(num);//원본 데이터는 변하지 않음
		System.out.println();
		
		num = -num;//num에 저장된 데이터를 바꾸려면 항상 저장(=)까지 해야한다.
		System.out.println(+num);
		System.out.println(-num);
		System.out.println(num);
	}

}
