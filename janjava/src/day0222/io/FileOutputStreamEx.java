package day0222.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("output.txt",true);){
			byte[] bArr = new byte[26];
			char c = 'A';
			for(int i = 0; i < bArr.length; i++) {
				bArr[i] = (byte) c;
				c++;
			}
			fos.write(bArr);
			fos.write((byte)'A');
			fos.write('B');
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println("end");
	}

}
