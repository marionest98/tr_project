package day0222.io;

import java.io.Serializable;

public class Person implements Serializable{
	
	private static final long serialVersionUID = 1L;// 버전 관리
	
	String name; 
	/* transient */  String job; // transient : 직렬화대상에서 제외. 스트림을 통해 전송X
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + "]";
	}
	
}