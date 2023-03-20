package day0222.io;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
		try (FileReader fr = new FileReader("reader.txt");){
			char[] arr = new char[10];
			int i;
			while((i = fr.read(arr)) != -1) {
				System.out.println(arr);
			}
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println("end");

	}

}
