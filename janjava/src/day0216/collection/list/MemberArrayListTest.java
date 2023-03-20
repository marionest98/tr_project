package day0216.collection.list;

public class MemberArrayListTest {
	public static void main(String[] args) {
		Member m1 = new Member(1001, "홍길동");
		Member m2 = new Member(1002, "이길동");
		Member m3 = new Member(1003, "고길동");
		Member m4 = new Member(1004, "엄길동");
		
		MemberArrayList mlist = new MemberArrayList();
		
		mlist.addMember(m1);
		mlist.addMember(m3);
		mlist.addMember(m2);
		mlist.addMember(m4);
		
		if(mlist.removeMember(m2.getMid())) {
			System.out.println(m2.getMid());
		}
		mlist.removeMember(0);
		
		mlist.showAllMember();
		
		mlist.removeMember(m2.getMid());
		mlist.showAllMember();
		mlist.removeMember(1005);
		mlist.showAllMember();
		
	}

}
