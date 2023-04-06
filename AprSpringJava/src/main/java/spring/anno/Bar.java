package spring.anno;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bar {
	@Value("javaKim")
	String str;
	
	public void doBar() {
		System.out.println(str + " : Bar.doBar() 실행");
	}
	@PostConstruct
	public void start() {
		System.out.println("Var.init");
	}
	@PreDestroy
	public void stop() {
		System.out.println("Var.destory");
	}

	public void setStr(String str) {
		this.str = str;
	}
	
}
