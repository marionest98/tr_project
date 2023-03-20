package day0216.collection.list;

public class Member {
// 아이디(mid:int), 이름(mname:String)을 저장하는 클래스
	private int mid;
	private String mname;
	
	public Member(int mid, String mname) {
		this.mid = mid;
		this.mname = mname;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	@Override
	public String toString() {
		return "Member [아이디=" + mid + ", 이름=" + mname + "]";
	}
	
	
	
}
