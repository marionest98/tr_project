package day0217.collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListSet {

	public static void main(String[] args) {
		// List 준비
		List<String> list = Arrays.asList("L", "I", "S", "T", "L");
		System.out.println("list : " + list);
		// Set으로 변환 (생성자)
		Set<String> set = new HashSet<>(list);

		// 결과 출력
		System.out.println(set);
		set.add("A");
		System.out.println(set);

		// Set으로 변환 (copyOf())

		// Set.copyOf() 메소드가 리턴하는 Set 객체는 unmodifiable 객체로,
		// 더 이상 값을 추가하거나, 삭제, 변경할 수 없음
		Set<String> set2 = Set.copyOf(list);
		
		// 결과 출력
		System.out.println(set2);
		// set2.add("A"); // UnsupportedOperationException 발생
		

	}

}
