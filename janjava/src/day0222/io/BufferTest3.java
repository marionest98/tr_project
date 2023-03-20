package day0222.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferTest3 {
	public static String consoleInput(String input) throws IOException {
		System.out.print(input + " : ");
		// 화면과 연결된 스트림이 2byte로 늘어남
		InputStreamReader isr = new InputStreamReader(System.in);
		// 버퍼를 사용하는 스트림
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}

	public static void main(String[] args) throws IOException {
		
		String id = consoleInput("id");
		String password = consoleInput("password");
		
		System.out.println("아이디".getBytes());
		System.out.write("아이디".getBytes());
		System.out.println();
		System.out.printf("id : %s, password : %s", id, password);
	}

}
