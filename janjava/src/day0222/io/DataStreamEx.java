package day0222.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamEx {
	public static void main(String[] args) {
		// 파일에 기본형 데이터 출력 스트림
		try (FileOutputStream fos = new FileOutputStream("data.txt");
			DataOutputStream dos = new DataOutputStream(fos)	){
			
			dos.writeInt(100);
			dos.writeBoolean(true);
			dos.writeUTF("Test");
			dos.writeFloat(3.14f); 
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
		//파일로부터 기본형 데이터를 읽어 오는 스트림
		try (FileInputStream fis = new FileInputStream("data.txt");
			DataInputStream dis = new DataInputStream(fis)){
			
			System.out.println(dis.readInt()+10);
			System.out.println(dis.readBoolean());
			System.out.println(dis.readUTF());
			System.out.println(dis.readFloat());
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}









