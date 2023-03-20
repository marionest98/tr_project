package day0223.net;

import java.net.*;
import java.io.*;

public class TcpIpClient {
	public static void main(String args[]) {
		try {
			String serverIP = "192.168.0.2";
			
			System.out.println("서버에 연결중입니다. 서버IP :" + serverIP);
			
			Socket socket = new Socket(serverIP, 7777);
			
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			System.out.println("서버로부터 받은 메세지 :"+ dis.readUTF());
			System.out.println("연결을 종료합니다.");
			
			dis.close();
			socket.close();
			System.out.println("연결이 종료되었습니다.");
		} catch(ConnectException ce) {
			ce.printStackTrace();
		} catch(IOException ie) {
			ie.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	} // main
} // class