package day0222.exam;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileMove {

	public static void main(String[] args) {		
		Scanner s = new Scanner(System.in);	
		System.out.print("이동시킬 파일 : ");
		String path = s.next();
		File old = new File(path);
		
		System.out.print("파일을 이동시킬 경로 : ");
		String move = s.next();
		
		File nw = new File(move, old.getName());
				
		try (FileInputStream fis = new FileInputStream(path);
			 BufferedInputStream bis = new BufferedInputStream(fis);
			 FileOutputStream fos = new FileOutputStream(nw);				
			 BufferedOutputStream bos = new BufferedOutputStream(fos);) {
			
			/*int i;
			while ((i = bis.read()) != -1) {
				bos.write(i);		
				*/
			byte[] readByte = new byte[fis.available()];
			while(bis.read(readByte) != -1) {
				bos.write(readByte);
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("경로가 잘못되었습니다.");
		}
		old.delete();
		System.out.println(old.getName()+"가 "+move+"로 이동 완료");
		
	}

}
