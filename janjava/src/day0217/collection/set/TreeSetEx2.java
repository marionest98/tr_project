package day0217.collection.set;

import java.util.TreeSet;

class Member implements Comparable<Member>{
	int id;
	String name;
	
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Member o) {
		//return id - o.id;
		return name.compareTo(o.name);
	}
	
	
	
}
public class TreeSetEx2 {
	public static void main(String[] args) {
		TreeSet<Member> members = new TreeSet<>();
		// compareTo() 사용해서 정렬해서 저장하고 있음
		Member m1 = new Member(1, "kim");
		Member m2 = new Member(3, "bred");
		Member m3 = new Member(2, "smith");
		Member m4 = new Member(4, "smith");
		Member m5 = new Member(2, "smith");
		
		members.add(m5);
		members.add(m4);
		members.add(m1);
		members.add(m2);
		members.add(m3);
		
		
		System.out.println(members);
	}

}

