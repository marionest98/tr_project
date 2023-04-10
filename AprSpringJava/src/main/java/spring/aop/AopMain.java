package spring.aop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext("aop.xml");
		
		GreetingService gs = context.getBean("greeting", GreetingService.class);
		gs.sayHello("springKim");
		try {
			gs.sayGoodbye("springA");
		}catch (Exception e) {
			System.out.println("예외 처리");
		}
		System.out.println("program end!!");
	}

}
