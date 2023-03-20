package day0217.util.date;

import java.util.*;
import java.text.*;

class DateFormatEx3 {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		Date d = null;
		try {
			// d = df.parse(" 17일 2월 2023년 ");//예외발생
			d = df.parse("2023년 2월 17일");
			System.out.println(df2.format(d));
		} catch (Exception e) {
			System.out.println("패턴이 일치하지 않습니다.");
		}

		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));

	} // main
}