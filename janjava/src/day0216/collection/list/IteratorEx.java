package day0216.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
//Iterator : 컬렉션 내 저장된 객체를 읽어오는 방법을 표준화 한 interface
//hasNext() : 이후에 요소가 더 있는지 체크. 다음 요소가 있다면 true
//next() : 다음 요소를 반환
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(3);
		list.add("A");
		list.add("B");
		list.add("C");
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}	
		//iter.next();
		
	}

}
