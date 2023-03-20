package day0217.collection.map;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesEx2 {
	public static void main(String[] args) {
		Properties prop = new Properties();
		
		prop.put("timeout", "30");
		prop.setProperty("size", "10");
		prop.setProperty("ip", "192.168.0.2");
		
		Enumeration names = prop.propertyNames();
		
		while(names.hasMoreElements()) {
			String name = (String)names.nextElement();
			System.out.println(name+" = "+prop.getProperty(name));
		}
		
		prop.setProperty("size", "20");
		System.out.println("size = "+prop.getProperty("size"));
		
		System.out.println();
		prop.list(System.out);
		
		
	}

}
