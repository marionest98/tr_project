package day0222.io;

import java.io.*;

public class BufferTest2 {
//BufferedReader - readLine() : 한줄씩 읽어오기 -> String
//							  : 읽어올 내용이 없으면 null 리턴
	
	public static void main(String[] args) {
		try (FileReader fr = new FileReader("reader.txt");
			BufferedReader br = new BufferedReader(fr)){
			
			String msg;
			while((msg = br.readLine()) != null) {
				System.out.println(msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
