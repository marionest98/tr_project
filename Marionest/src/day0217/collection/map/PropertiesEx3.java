package day0217.collection.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx3 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//1. properties객체 생성
		Properties p = new Properties();
		//2. 읽어올 properties파일의 경로 지정
		String path = PropertiesEx3.class.getResource("data.properties").getPath();
		//String path = "data.properties";//프로젝트 폴더에..
		//3. 읽어와서 properties객체에 저장
		 p.load(new FileInputStream(path));   
		//학생의 이름
		//학생 성적의 총점, 평균을 출력하세요.
		 String name = p.getProperty("name");
		 String[] score = p.getProperty("score").split(",");
		 int sum = 0;
		 for(String s : score) {
			 sum += Integer.parseInt(s);
		 }
		 System.out.println("학생의 이름 : "+name);
		 System.out.println("총점 : "+ sum+", 평균 : "+ (sum/score.length));
	}
}





