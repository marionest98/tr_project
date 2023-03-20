package day0208.oop.inheritance;

import java.text.SimpleDateFormat;
import java.util.Date;//ctrl + shift + 'o'


public class ImportTest {

	public static void main(String[] args) {

		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("y/mm/dd hh:mm:ss a");
		String str = sdf.format(now);
		System.out.println("현재시간 : " + str);

	}

}
