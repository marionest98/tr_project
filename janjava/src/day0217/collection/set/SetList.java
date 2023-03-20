package day0217.collection.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetList {

	public static void main(String[] args) {
		// Set 준비
		Set<String> set = new HashSet<>(Arrays.asList("L","I","S","T"));
		System.out.println(set);
		
		// Set을 List로 변환 (생성자)
		List<String> list = new ArrayList<>(set);
		
		// 결과 출력
		System.out.println(list);//[S, T, I, L]
		list.add("A");
		System.out.println(list);//[S, T, I, L, A]
		
		// Set을 List로 변환 (List.copyOf())
		List<String> list2 = List.copyOf(set);
		
		// 결과 출력
		System.out.println(list2);//[S, T, I, L]

	}

}
