package ncs.test1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		HashMap<String, String[]> map = new HashMap<>();
		String[] m1 = {"기생충","괴물","관상"};  
		String[] m2 = {"도둑들","수상한 그녀","은밀하게 위대하게"};
		String[] m3 = {"지아이조","레드","광해"};
		map.put("송강호", m1); 
		map.put("김수현", m2);
		map.put("이병헌", m3);
		int cnt = 0;
		Scanner s = new Scanner(System.in);
		String ac = s.next();
		Set<String> names = map.keySet();
		for(String n : names) {
			if(n.equals(ac)) {
				System.out.println(Arrays.toString(map.get(n)));
				cnt++;
				break;
			}//if		
		}//for
		if(cnt==0) {
			System.out.println("배우없음");
		}//if	
		
	}//main

}//class
