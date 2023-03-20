package day0222.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest2 {
	public static void main(String[] args) throws IOException {
		File nf = new File("d:\\test.txt"); 
		System.out.println("파일 생성 : "+ nf.createNewFile());
		System.out.println("경로 : "+nf.getPath());
		System.out.println("경로 : "+nf.getAbsolutePath());
		System.out.println("경로 : "+nf.getCanonicalPath());
		System.out.println("이름 : "+nf.getName());
		System.out.println("마지막 수정 날짜 : "+new Date(nf.lastModified()));
		
		File f2 = new File("d:\\test123.txt");
		System.out.println(nf.renameTo(f2));
		System.out.println("변경된 이름 : "+nf.getName());
		nf.delete();
		f2.delete();
	}

}
