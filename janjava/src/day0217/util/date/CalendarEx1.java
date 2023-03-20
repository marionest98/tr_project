package day0217.util.date;

import java.util.Calendar;

class  CalendarEx1{
	public static void main(String[] args) 	{
				StringBuilder sb = new StringBuilder("2023년중 ");
				Calendar now = Calendar.getInstance();
				int week_yy = now.get(Calendar.WEEK_OF_YEAR);
				int yy = now.get(Calendar.YEAR);
				int mm = now.get(Calendar.MONTH)+1;//1월이 0을 기억한다.
				int dd = now.get(Calendar.DAY_OF_MONTH);
				sb.append(week_yy);
				sb.append("주째인 ");
				sb.append(yy);
				sb.append("년 ");
				sb.append(mm);
				sb.append("월 ");
				sb.append(dd);
				sb.append("일");
				System.out.println(sb.toString());
			}
		}










