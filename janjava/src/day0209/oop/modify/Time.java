package day0209.oop.modify;

public class Time {
	
	private int hour;
	private int minite;
	
	public Time(int hour, int minite) {
		this.hour = hour;
		this.minite = minite;
	}
	//getter 값을 리턴(read)
	public int getHour() {
		return hour;
	}
	//setter 변수에 값을 저장(write)
	public void setHour(int hour) {
		if(hour < 0 || hour>23) {
			return;
		}
		this.hour = hour;
	}
	public int getMinite() {
		return minite;
	}
	public void setMinite(int minite) {
		if(minite < 0 || minite > 59) {
			return;
		}
		this.minite = minite;
	}
	
	

}
