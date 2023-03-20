package day0216.collection.list;

import java.util.*;

public class LinkedListExample {
	public static void main(String[] args) {
		
		//마지막 자리에 데이터를 추가하거나 검색하는 경우는 arraylist가 빠름
		//중간에 저장된 객체를 제거, 중간에 삽입하는 경우 linkedlist 빠름
		//list 내의 정보가 빈번하게 병경이 이뤄지는 경우는 linkedlist를 사용
				
		List<String> l1 = new ArrayList<>();
		List<String> l2 = new LinkedList<>();
		
		long start;
		long end;
		
		start = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			l1.add(0, String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("ArrayList : "+(end - start));
		start = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			l2.add(0, String.valueOf(i));
		}
		end = System.nanoTime();
	
		System.out.println("LinkedList : "+(end - start));
	}
}