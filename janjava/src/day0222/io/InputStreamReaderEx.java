package day0222.io;

import java.io.*;

public class InputStreamReaderEx {
	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("reader.txt");
			InputStreamReader isr = new InputStreamReader(fis)){
			int i;
			char[] c = new char[10];
			while((i = isr.read(c)) != -1) {
				System.out.println(c);
			}
		
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
