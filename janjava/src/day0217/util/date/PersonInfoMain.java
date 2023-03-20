package day0217.util.date;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class PersonInfoMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String date;
		do {
			System.out.print("시작일(yyyy/MM/dd) > ");
			date = s.next();
		}while(!matchDate(date));		
		System.out.print("작업명> ");
		s.nextLine();// 엔터값 읽어옴
		String work = s.nextLine();
		System.out.print("작업일> ");
		int days = s.nextInt();
		WorkInfo wi = new WorkInfo(date, work, days);		
		wi.printInfo();
	}
	//문자열의 패턴 검사
	public static boolean matchDate(String date) {
		String regex = "[0-9]{4}/[0-9]{2}/[0-9]{2}";//정규표현식
		return date.matches(regex);
	}

}
