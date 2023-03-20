package day0222.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx2 {
	public static void main(String[] args) {
	
		try (FileInputStream fis = new FileInputStream("input2.txt");){
			
			byte[] b = new byte[fis.available()];
			int len;
			
			while((len = fis.read(b)) != -1 ) {
				/*
				 * for(int i = 0; i < len; i++) { System.out.print((char)b[i]); }
				 */
				System.out.print(new String(b));
				System.out.println(" : "+len+"byte 읽음");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println("end");
	}
}
