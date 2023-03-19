package day0217.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapEx1 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		
		map.put("myid", "1234"); 
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		//키가 같은 값을 또 저장하면 value값을 (새로 저장한 값으로)변경한다.
		
		System.out.println(map); 
		
		Set<String> keys = map.keySet();
		
		Iterator<String> kIter = keys.iterator();
		while(kIter.hasNext()) {
			String k = kIter.next();
			String v = map.get(k);
			System.out.printf("%s의 매핑값은 %s입니다.\n", k ,v);
		}
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력하세요.");
			System.out.print("id : ");
			String id = s.next();
			
			System.out.print("password : ");
			String password = s.next();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력하세요.");
				continue;
			}else {
				if((map.get(id)).equals(password)) {
					System.out.println("id와 비밀번호가 일치합니다.");
					break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력하세요.");
				}
			}
		}
		
	}
}





