package day0216.collection.list;

import java.util.*;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;

	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	//회원 추가
	public void addMember(Member mem) {
		arrayList.add(mem);
		System.out.println(mem.getMid()+"회원 추가");
	}
	
	//회원 삭제
	public boolean removeMember(int mid) {
		for(int i=0; i < arrayList.size();i++) {
			Member m = arrayList.get(i);
			int memberid = m.getMid();
			if(mid == memberid) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(mid+"회원은 존재하지 않습니다.");
		return false;
	}
	//전체 회원 list 보여주기
	public void showAllMember() {
		System.out.println("-----------회원명단------------");
		for(Member m : arrayList) {
			System.out.println(m);
		}
		System.out.println("----------------------------");
		
	}
	
	
}
