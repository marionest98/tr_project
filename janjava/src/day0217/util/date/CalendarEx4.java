package day0217.util.date;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class CalendarEx4 {

	public static void main(String[] args) {
		TimeZone time = TimeZone.getTimeZone("Asia/Bangkok");
		Locale locale = new Locale("en");//영문
		Calendar c = Calendar.getInstance(time, locale); 
		System.out.println(
		(c.get(Calendar.MONTH) + 1) + "월 " + c.get(Calendar.DATE) + "일 "
		+c.get(Calendar.HOUR_OF_DAY) + "시 "
				);
	}

}
