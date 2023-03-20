package day0217.collection.set;

import java.util.HashSet;

public class HashSetEx1 {

	public static void main(String[] args) {
		Object[] arr = { "1", "1", 1, 2, "2", "3", "3" };
		HashSet<Object> set = new HashSet<>();

		for (Object o : arr) {
			set.add(o);
			//이미 저장된 객체와 같은 타입이라면
			//hashcode()실행 - 리턴값이 다르면 저장, 같으면
			//equals() - true 저장X, false 저장O
		}
		System.out.println(set);
	}

}
