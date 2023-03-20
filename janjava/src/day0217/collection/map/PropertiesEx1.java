package day0217.collection.map;

import java.util.Properties;

public class PropertiesEx1 {
	public static void main(String[] args) {

		Properties prop = System.getProperties();
		prop.list(System.out);//Properties객체에 저장된 모든 속성을 화면에 출력
	}
}
