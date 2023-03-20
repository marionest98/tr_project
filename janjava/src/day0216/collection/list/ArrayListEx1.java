package day0216.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArrayListEx1 {
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(new Integer(1));
		list1.add(4);
		list1.add(6);
		list1.add(0);
		list1.add(3);
		
		for(int i : list1) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		List<Integer> list2 = list1.subList(1, 3);
		System.out.println(list2);
		
		Collections.sort(list1);
		System.out.println(list1);
			
		System.out.println(list1.get(0));

		System.out.println(list1.remove(1));
		System.out.println(list1);
		
	}
}












