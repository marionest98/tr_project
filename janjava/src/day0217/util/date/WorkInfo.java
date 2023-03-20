package day0217.util.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class WorkInfo {
	private String date;//시작일을 문자열로 저장 yyyy/MM/dd형식으로 저장할 곳
	private String work;//작업 이름 저장
	private int days;//작업 일수
	public WorkInfo(String date, String work, int days) {
		this.date = date;
		this.work = work;
		this.days = days;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
		
	public void printInfo() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date start = null;
		
		try {
			start = sdf.parse(date);
		}catch(ParseException e) {
			System.out.println("잘못된 값이 입력되었습니다.(종료)");
			return;
		}		
		
		Calendar c = Calendar.getInstance();
		c.setTime(start); //Date -> Calendar
		c.add(Calendar.DATE, days);
		Date end = c.getTime(); //Calendar -> Date
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		System.out.println(work+"의 시작일은 "+sdf2.format(start)+ "이고 "+sdf2.format(end)+"까지 수행해야합니다.");
	}
	

}
