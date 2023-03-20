package day0206.oop.method;

public class ReturnEx {
	
	int max(int a, int b) {
		int result = 0;
		
		if(a > b) {
			result = a;
		}else {
			result = b;
		}
		
		return result;
	}

}
